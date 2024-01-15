package Year3.Sem6.CS;

//Ansh Maheshwari N056

import java.util.Scanner;

public class RailFence {

    // Encrypts text using the Rail Fence cipher pattern
    public static String encryptRailFence(String text, int key) {
        // Validation for number of rails
        if (key < 2) {
            return "Invalid number of rails. Please enter a value greater than 1.";
        }

        StringBuilder encryptedText = new StringBuilder();
        int length = text.length();

        // Create a matrix to hold the characters in the zigzag pattern
        char[][] railMatrix = new char[key][length];

        // Fill the matrix in a zigzag pattern
        int row = 0, col = 0, direction = -1; // Start at top row, going downwards
        for (int i = 0; i < length; i++) {
            railMatrix[row][col] = text.charAt(i);

            // Move to the next position in the zigzag pattern
            if (row == 0 || row == key - 1) {
                direction = -direction; // Change direction at top/bottom rail
            }
            row += direction;
            col++;
        }

        // Read the matrix in a zigzag pattern to get the encrypted text
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < length; j++) {
                // ONLY append non-empty characters (fix for IndexOutOfBoundsException)
                if (railMatrix[i][j] != 0) {
                    encryptedText.append(railMatrix[i][j]);
                }
            }
        }

        return encryptedText.toString();
    }

    // Decrypts text using the Rail Fence cipher pattern (reverse of encryption)
    public static String decryptRailFence(String text, int numRails) {
        // Validation for number of rails
        if (numRails < 2) {
            return "Invalid number of rails. Please enter a value greater than 1.";
        }

        StringBuilder decryptedText = new StringBuilder();
        int length = text.length();

        // Create an empty matrix to hold the decrypted characters
        char[][] railMatrix = new char[numRails][length];

        // Fill the matrix in a zigzag pattern

        int row = 0, col = 0, index = 0, direction = -1; // Start at top row, going downwards
        for (int i = 0; i < length; i++) {
            railMatrix[row][col] = text.charAt(index++);

            // Move to the next position in the zigzag pattern
            if (row == 0 || row == numRails - 1) {
                direction = -direction; // Change direction at top/bottom rail
            }
            row += direction;
            col++;
        }

        System.out.println("\nDiagonal placement of encrypted text: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(railMatrix[i][j] + " ");
            }
            System.out.println();
        }


        // Fill the matrix in a zigzag pattern
        String decrypt = "";
        row = 0;
        col = 0;
        direction = -1; // Start at top row, going downwards
        for (int i = 0; i < length; i++) {
            decrypt+=railMatrix[row][col];

            // Move to the next position in the zigzag pattern
            if (row == 0 || row == numRails - 1) {
                direction = -direction; // Change direction at top/bottom rail
            }
            row += direction;
            col++;
        }
        return decrypt;
    }

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter text to encrypt/decrypt: ");
        String textToProcess = inputReader.nextLine();

        System.out.print("Enter number of rails: ");
        int numRails = inputReader.nextInt();

        String encryptedText = encryptRailFence(textToProcess, numRails);
        String decryptedText = decryptRailFence(encryptedText, numRails);

        System.out.println("Encrypted text: " + encryptedText);
        System.out.println("Decrypted text: " + decryptedText);
    }
}
