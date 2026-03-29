package Kyrsach;

import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = in.nextLine();

        System.out.print("Введите ключ (сдвиг от 1 до 32): ");
        int key = in.nextInt();
        in.nextLine();

        long startEncrypt = System.nanoTime();
        String encrypted = CaesarCipher.encrypt(text, key);
        long endEncrypt = System.nanoTime();
        double encryptTimeMs = (endEncrypt - startEncrypt) / 1_000_000.0;

        System.out.println("\nЗашифрованный текст: " + encrypted);
        System.out.printf("Время шифрования: %.3f мс\n", encryptTimeMs);

        long startDecrypt = System.nanoTime();
        String decrypted = CaesarCipher.decrypt(encrypted, key);
        long endDecrypt = System.nanoTime();
        double decryptTimeMs = (endDecrypt - startDecrypt) / 1_000_000.0;

        System.out.println("\nРасшифрованный текст: " + decrypted);
        System.out.printf("Время дешифрования: %.3f мс\n", decryptTimeMs);
    }

    public static class CaesarCipher {

        private static final String ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        private static final String ALPHABET_LOWER = ALPHABET.toLowerCase();

        private static String encrypt(String text, int shift) {
            if (text == null || text.isEmpty()) {
                return text;
            }

            StringBuilder result = new StringBuilder();
            shift = shift % ALPHABET.length();

            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
                char encryptedChar = shiftChar(currentChar, shift);
                result.append(encryptedChar);
            }

            return result.toString();
        }

        private static String decrypt(String text, int shift) {
            if (text == null || text.isEmpty()) {
                return text;
            }

            StringBuilder result = new StringBuilder();
            shift = shift % ALPHABET.length();

            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
                char decryptedChar = shiftChar(currentChar, -shift);
                result.append(decryptedChar);
            }

            return result.toString();
        }

        private static char shiftChar(char c, int shift) {
            int index;

            if (Character.isUpperCase(c)) {
                    index = ALPHABET.indexOf(c);
                    if (index != -1) {
                        int newIndex = (index + shift) % ALPHABET.length();
                        if (newIndex < 0) {
                            newIndex += ALPHABET.length();
                        }
                        return ALPHABET.charAt(newIndex);
                    }
                } else if (Character.isLowerCase(c)) {
                    index = ALPHABET_LOWER.indexOf(c);
                    if (index != -1) {
                        int newIndex = (index + shift) % ALPHABET.length();
                        if (newIndex < 0) {
                            newIndex += ALPHABET.length();
                        }
                        return ALPHABET_LOWER.charAt(newIndex);
                    }
                }
            return c;
        }
    }
}
