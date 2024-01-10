/**
 * This class contains methods for implementing Rail-Fence algorithm to encrypt plain text and decrypt cipher text
 * CS-E4
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year3.Sem6.CS;

import java.util.Scanner;

public class RailFenceCipher {
    String str, encrypted = "", decrypted = "";
    int key;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string: ");
        str = sc.nextLine().toLowerCase();
        str = str.replace(" ", ""); // removing whitespaces in between sentences to form a one whole word
    }

    void railEncryption() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        key = sc.nextInt();
        encrypted = "";

        int row = key;
        int col = str.length();
        char[][] matrix = new char[row][col];

        boolean direction = false; // control direction of diagonal movement. True= up, False= down
        int row_pos = 0; // diagonal row position in matrix at which char is to be placed

        for (int i = 0; i < col; i++) {
            if (row_pos == 0 || row_pos == key - 1)
                direction = !direction; // change direction of diagonal if its 1st row or last row

            matrix[row_pos][i] = str.charAt(i);

            if (direction == true)
                row_pos++; // moving down the rows
            else
                row_pos--; // moving up the rows
        }

        // display plain-text placed as sequence of diagonals
        System.out.println("\nDiagonal placement of plain text: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] != 0)
                    encrypted += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("\nPlain text: " + str + "\nEncrypted text: " + encrypted);
    }

    void railDecryption() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        key = sc.nextInt();
        decrypted = "";

        int row = key;
        int col = encrypted.length(); // length of plain-text = length of encrypted text
        char[][] matrix = new char[row][col];

        boolean direction = false;
        int row_pos = 0;

        /* forming a matrix where char will be placed diagonally */
        for (int i = 0; i < col; i++) {
            if (row_pos == 0 || row_pos == key - 1)
                direction = !direction;

            matrix[row_pos][i] = '*'; // marking positions where characters would be placed diagonally

            if (direction == true)
                row_pos++;
            else
                row_pos--;
        }
        /* replacing diagonal *'s with char of encrypted text*/
        int char_pos = 0; // keep track of character to be placed in the matrix
        direction = false;
        row_pos = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == '*' && char_pos < col) {
                    matrix[i][j] = encrypted.charAt(char_pos++);
                }
            }
        }

        // display encrypted text placed as sequence of diagonals
        System.out.println("\nDiagonal placement of encrypted text: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // reading text diagonally to decrypt
        for (int i = 0; i < col; i++) {
            if (row_pos == 0 || row_pos == key - 1)
                direction = !direction;

            decrypted += matrix[row_pos][i];

            if (direction)
                row_pos++;
            else
                row_pos--;
        }
        System.out.println("\nPlain text: " + str + "\nEncrypted text: " + encrypted + "\nDecrypted text: " + decrypted);
    }

    void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n>>>> RAIL-FENCE CIPHER <<<<\n1. Encrypt text\n2. Decrypt text\n3. Give up...\n\nEnter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    input();
                    railEncryption();
                    menu();
                    break;
                case 2:
                    if (encrypted.isEmpty()) {
                        input();
                        encrypted = str;
                    }
                    railDecryption();
                    menu();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nHeh! You thought this hasn't been accounted for?");
                    menu();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RailFenceCipher ob = new RailFenceCipher();
        ob.menu();
    }
}
