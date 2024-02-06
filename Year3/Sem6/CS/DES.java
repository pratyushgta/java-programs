package Year3.Sem6.CS;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DES {
    public static void main(String[] args) throws Exception {
        String plainText = "Hello, World!";
        String key = "12345678"; // 8-char key for DES

        System.out.println("Plain text: " + plainText);

        String encryptedText = encrypt(plainText, key);
        System.out.println("Encrypted text: " + encryptedText);
    }

    public static String encrypt(String plainText, String key) throws Exception {
        DESKeySpec desKeySpec = new DESKeySpec(key.getBytes());
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);

        byte[] plainTextBytes = plainText.getBytes(StandardCharsets.UTF_8);
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] encryptedBytes = cipher.doFinal(plainTextBytes);
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
}
