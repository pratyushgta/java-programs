/**
 * This class contains methods for implementing Hill Cipher algorithm to encrypt 3-letter plain text and decrypt 3-letter cipher text
 * CS-E6
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year3.Sem6.CS;

import java.util.Scanner;

public class HillCipher {
    int PT_size, key_size;
    int[][] PT, key, encrypted, decrypted;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter 3-letter plain-text: ");
        String plain_text = sc.nextLine().toUpperCase();

        // Converting plain-text to numbers
        PT_size = plain_text.length();
        PT = new int[PT_size][1];
        System.out.println("\nCreating " + (PT_size) + "*1 Plain-text matrix:");
        for (int i = 0; i < PT_size; i++) {
            for (int j = 0; j < 1; j++) {
                PT[i][j] = plain_text.charAt(i) - 65;
                System.out.println(plain_text.charAt(i) + "(" + PT[i][j] + ")");
            }
        }

        System.out.print("\nEnter " + (PT_size * PT_size) + "-letter key-text: ");
        String key_text = sc.nextLine().toUpperCase();

        // Converting key-text to numbers
        key_size = PT_size;
        key = new int[key_size][key_size];
        System.out.println("\nCreating " + key_size + "*" + key_size + " Key matrix:");
        int k = 0; // Counter to keep track of the current character in key_text
        for (int i = 0; i < key_size; i++) {
            for (int j = 0; j < key_size; j++) {
                if (k >= key_text.length()) {
                    System.out.println("Not enough characters in the key text.");
                    return;
                }
                key[i][j] = key_text.charAt(k) - 65;
                System.out.print((char) (key[i][j] + 65) + "(" + key[i][j] + ")\t");
                k++;
            }
            System.out.println();
        }
    }

    public void encryptHill() {
        int sum; // Stores sum obtained during multiplication of row and column
        encrypted = new int[PT_size][1];
        // multiplying key and plain-text
        for (int i = 0; i < PT_size; i++) {
            sum = 0;
            for (int j = 0; j < key_size; j++) {
                sum += key[i][j] * PT[j][0];
            }
            encrypted[i][0] = sum % 26;
        }

        System.out.println("\nEncrypted matrix:");
        for (int i = 0; i < PT_size; i++) {
            System.out.println((char) (encrypted[i][0] + 65) + "(" + encrypted[i][0] + ")");
        }
    }

    public void dencryptHill() {
        System.out.print("\nDecrypting: ");
        for (int i = 0; i < PT_size; i++) {
            System.out.print((char) (encrypted[i][0] + 65) + " ");
        }

        // Calculating the determinant of the key matrix
        int det = (key[0][0] * ((key[1][1] * key[2][2]) - (key[2][1] * key[1][2]))) -
                (key[0][1] * ((key[1][0] * key[2][2]) - (key[2][0] * key[1][2]))) +
                (key[0][2] * ((key[1][0] * key[2][1]) - (key[2][0] * key[1][1])));

        // Calculate the multiplicative inverse of the determinant modulo 26 (d*d_inv*mod26 = 1)
        int det_inv = 0;
        for (int i = 0; i < 26; i++) {
            if ((det * i) % 26 == 1) {
                det_inv = i;
                break;
            }
        }

        // Calculating adjoint of the key matrix
        int[][] adj = new int[3][3];
        adj[0][0] = (key[1][1] * key[2][2] - key[2][1] * key[1][2]);
        adj[0][1] = -(key[0][1] * key[2][2] - key[2][1] * key[0][2]);
        adj[0][2] = (key[0][1] * key[1][2] - key[1][1] * key[0][2]);
        adj[1][0] = -(key[1][0] * key[2][2] - key[2][0] * key[1][2]);
        adj[1][1] = (key[0][0] * key[2][2] - key[2][0] * key[0][2]);
        adj[1][2] = -(key[0][0] * key[1][2] - key[1][0] * key[0][2]);
        adj[2][0] = (key[1][0] * key[2][1] - key[2][0] * key[1][1]);
        adj[2][1] = -(key[0][0] * key[2][1] - key[2][0] * key[0][1]);
        adj[2][2] = (key[0][0] * key[1][1] - key[1][0] * key[0][1]);

        // Calculating the inverse of the key matrix
        int[][] key_inv = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                key_inv[i][j] = (det_inv * adj[i][j]);
                while (key_inv[i][j] < 0) {
                    key_inv[i][j] += 26;
                }
            }
        }

        // Multiplying inverse key matrix and cipher text
        int sum;
        decrypted = new int[PT_size][1];
        for (int i = 0; i < PT_size; i++) {
            sum = 0;
            for (int j = 0; j < key_size; j++) {
                sum += key_inv[i][j] * encrypted[j][0];
            }
            decrypted[i][0] = sum % 26;
        }

        System.out.println("\nDecrypted matrix:");
        for (int i = 0; i < PT_size; i++) {
            System.out.println((char) (decrypted[i][0] + 65) + "(" + decrypted[i][0] + ")");
        }
    }


    void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n>>>> HILL CIPHER <<<<\n1. Encrypt text\n2. Decrypt text\n3. Give up...\n\nEnter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    input();
                    encryptHill();
                    menu();
                    break;
                case 2:
                    if (encrypted == null) {
                        input();
                        encrypted = new int[PT_size][1];
                        for (int i = 0; i < PT_size; i++) {
                            for (int j = 0; j < 1; j++) {
                                encrypted[i][j] = PT[i][j];
                            }
                        }
                    }
                    dencryptHill();
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

    public static void main(String[] args) {
        HillCipher ob = new HillCipher();
        ob.menu();
    }
}
