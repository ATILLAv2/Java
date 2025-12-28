package laba6;

import java.util.Arrays;
import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = in.nextLine();

        char[] charArray = input.toCharArray();

        int[] codeArray = convert(charArray);

        System.out.println("Исходная строка: \"" + input + "\"");
        System.out.println("Массив кодов: " + Arrays.toString(codeArray));
    }
    public static int[] convert(char[] charArray) {

        int[] codeArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            codeArray[i] = charArray[i];
        }
        return codeArray;
    }
}
