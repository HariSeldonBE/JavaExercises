import java.util.Scanner;

public class C19_CaesarCipher {
    public static void main(String[] args) {
        /*
        Encrypt the text entered by the user according to the "Caesar Cipher Method".
        Caesar Cipher: Caesar cipher, an encryption technique
        that was first used by the Roman leader Julius Caesar.
        This encryption is one of the simplest and most well-known encryption techniques.
        It is a type of encryption where each letter in the plain text is replaced by
        a letter that is a certain number of positions ahead in the alphabet.

        hello ----> ifmmp ---> shifted by 1
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the amount of shift: ");
        int shift = scanner.nextInt();

        String encryptedText = caesarCipher(text, shift);

        System.out.println("Encrypted Text: " + encryptedText);

    }

    public static String caesarCipher(String text, int shift) {
        String encryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            char chr = text.charAt(i);
            chr += shift;
            encryptedText += chr;
        }
        return encryptedText;
    }
}
