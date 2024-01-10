/**
 * This class contains methods for implementing Modified Caesar algorithm to encrypt plain text and decrypt cipher text
 * CS-E4
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year3.Sem6.CS;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CaesarCipher {
    String str, encrypted = "", decrypted = "";
    int key;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string: ");
        str = sc.nextLine().toLowerCase();
    }

    void CaesarEncryption() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        String k = sc.nextLine();
        if (k.isEmpty()) {
            key = 3;
        } else {
            key = Integer.parseInt(k);
        }
        encrypted = "";

        StringTokenizer st = new StringTokenizer(str, " "); // breaks sentences (String) into tokens (words)

        while (st.hasMoreTokens()) { // loops until the last token present
            String currentWord = st.nextToken(); // extract a token
            for (int i = 0; i < currentWord.length(); i++) {
                char ch = currentWord.charAt(i); // extract a char from current token/ word
                int nextVal = ch + key; // shifts extracted character to 'key' positions ahead from current pos (current + key)
                if (nextVal > 122) { // checks if shifted char exceeds ascii of last alphabet (122 -> z)
                    nextVal -= 26; // replace char by the next in circular fashion
                }
                char newch = (char) nextVal;
                encrypted += newch;
            }
            encrypted += " ";
        }
        System.out.println("\nPlain text: " + str + "\nEncrypted text: " + encrypted);
    }

    void CaesarDecryption() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        String k = sc.nextLine();
        if (k.isEmpty()) {
            key = 3;
        } else {
            key = Integer.parseInt(k);
        }

        decrypted = "";

        StringTokenizer st = new StringTokenizer(encrypted, " ");

        while (st.hasMoreTokens()) {
            String currentWord = st.nextToken();
            for (int i = 0; i < currentWord.length(); i++) {
                char ch = currentWord.charAt(i);
                int nextVal = ch - key; // shifts extracted character to 'key' positions back from current pos (current - key)
                if (nextVal < 97) { // checks if shifted char subceeds ascii of first alphabet (97 -> a)
                    nextVal += 26; // replace char by the next in circular fashion
                }
                char newch = (char) nextVal;
                decrypted += newch;
            }
            decrypted += " ";
        }
        System.out.println("\nPlain text: " + str + "\nEncrypted text: " + encrypted + "\nDecrypted text: " + decrypted);
    }

    void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n>>>> CAESAR CIPHER <<<<\n1. Encrypt text\n2. Decrypt text\n3. Give up...\n\nEnter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    input();
                    CaesarEncryption();
                    menu();
                    break;
                case 2:
                    if (encrypted.isEmpty()) {
                        input();
                        encrypted = str;
                    }
                    CaesarDecryption();
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
        CaesarCipher ob = new CaesarCipher();
        ob.menu();
    }
}
