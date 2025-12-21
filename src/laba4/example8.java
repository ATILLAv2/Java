package laba4;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String encryptString = in.nextLine();

        System.out.println("Введите ключ (целое число):");
        int shift = in.nextInt();
        in.nextLine();

        String encryptedText = Encrypt.getEncryptString(encryptString, shift);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = in.nextLine();

        boolean validAnswer = false;

        while (!validAnswer) {
            switch (answer.toLowerCase()) {
                case "y":
                    String decryptedText = Encrypt.getEncryptString(encryptedText, -shift);
                    System.out.println("Текст после обратного преобразования: " + decryptedText);
                    validAnswer = true;
                    break;
                case "n":
                    System.out.println("До свидания!");
                    validAnswer = true;
                    break;
                default:
                    System.out.println("Введите корректный ответ (y/n):");
                    answer = in.nextLine();
                    break;
            }
        }
    }

    static class Encrypt {
        public static String getEncryptString(String encryptString, int shift) {

            char[] arrayChar = encryptString.toCharArray();
            long[] arrayInt = new long[arrayChar.length];
            char[] arrayCharNew = new char[arrayChar.length];

            for (int i = 0; i < arrayChar.length; i++) {
                arrayInt[i] = arrayChar[i] + shift;
                arrayCharNew[i] = (char) arrayInt[i];
            }

            encryptString = new String(arrayCharNew);
            return encryptString;
        }
    }
}
