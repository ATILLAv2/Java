package Kyrsach;

import java.util.Scanner;

public class Scytale {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = in.nextLine();

        int maxDiameter = text.length() / 2;
        if (maxDiameter < 1) {
            maxDiameter = 1;
        }

        System.out.print("Введите диаметр жезла (количество строк, от 1 до " + maxDiameter  + "): ");
        int diameter = in.nextInt();
        in.nextLine();
        if (diameter <= 0) {
            System.out.println("Диаметр жезла должен быть положительным числом");
        }else {
            ScytaleCipher.visual(text, diameter);

            long startEncrypt = System.nanoTime();
            String encrypted = ScytaleCipher.encrypt(text, diameter);
            long endEncrypt = System.nanoTime();
            double encryptTimeMs = (endEncrypt - startEncrypt) / 1_000_000.0;

            System.out.println("\nЗашифрованный текст: " + encrypted);
            System.out.printf("Время шифрования: %.3f мс\n", encryptTimeMs);

            long startDecrypt = System.nanoTime();
            String decrypted = ScytaleCipher.decrypt(encrypted, diameter);
            long endDecrypt = System.nanoTime();
            double decryptTimeMs = (endDecrypt - startDecrypt) / 1_000_000.0;

            System.out.println("\nРасшифрованный текст: " + decrypted);
            System.out.printf("Время дешифрования: %.3f мс\n", decryptTimeMs);
        }
    }

    public static class ScytaleCipher {
        public static String encrypt(String text, int diameter) {
            int textLength = text.length();
            int columns = (int) Math.ceil((double) textLength / diameter);

            char[][] matrix = new char[diameter][columns];
            int index = 0;

            for (int row = 0; row < diameter; row++) {
                for (int col = 0; col < columns; col++) {
                    if (index < textLength) {
                        matrix[row][col] = text.charAt(index);
                    } else {
                        matrix[row][col] = '\0';
                    }
                    index++;
                }
            }
            StringBuilder result = new StringBuilder();
            for (int col = 0; col < columns; col++) {
                for (int row = 0; row < diameter; row++) {
                    if (matrix[row][col] != '\0') {
                        result.append(matrix[row][col]);
                    }
                }
            }
            return result.toString();
        }

        public static String decrypt(String cipherText, int diameter) {
            int cipherLength = cipherText.length();
            int columns = (int) Math.ceil((double) cipherLength / diameter);

            char[][] matrix = new char[diameter][columns];

            int[] symbolsInColumn = new int[columns];
            int totalSymbols = cipherLength;

            for (int col = 0; col < columns; col++) {
                symbolsInColumn[col] = (int) Math.ceil((double) totalSymbols / (columns - col));
                totalSymbols -= symbolsInColumn[col];
            }

            int index = 0;
            for (int col = 0; col < columns; col++) {
                for (int row = 0; row < symbolsInColumn[col]; row++) {
                    if (index < cipherLength) {
                        matrix[row][col] = cipherText.charAt(index);
                        index++;
                    }
                }
            }
            StringBuilder result = new StringBuilder();
            for (int row = 0; row < diameter; row++) {
                for (int col = 0; col < columns; col++) {
                    if (matrix[row][col] != '\0') {
                        result.append(matrix[row][col]);
                    }
                }
            }
            return result.toString();
        }

        public static void visual(String text, int diameter) {
            int columns = (int) Math.ceil((double) text.length() / diameter);

            int index = 0;
            for (int row = 0; row < diameter; row++) {
                System.out.print("Строка " + (row + 1) + ": ");
                for (int col = 0; col < columns; col++) {
                    if (index < text.length()) {
                        System.out.print(text.charAt(index) + " ");
                    } else {
                        System.out.print("_ ");
                    }
                    index++;
                }
                System.out.println();
            }
        }
    }
}
