import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Input handling
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any String: ");
        String str = br.readLine();

        System.out.print("Enter the Key: ");
        int key = sc.nextInt();

        // Encrypt and decrypt
        String encrypted = transform(str, key);
        String decrypted = transform(encrypted, -key);

        // Output results
        System.out.println("Encrypted String: " + encrypted);
        System.out.println("Decrypted String: " + decrypted);
    }

    // Generalized transform method for encryption/decryption
    private static String transform(String str, int key) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append((char) ((c + key - 'A' + 26) % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                result.append((char) ((c + key - 'a' + 26) % 26 + 'a'));
            } else {
                result.append(c);  // Non-alphabetic characters remain unchanged
            }
        }
        return result.toString();
    }
}
