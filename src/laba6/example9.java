package laba6;

import java.util.Arrays;
import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = in.nextLine();

        char[] charArray = input.toCharArray();
        char[] reversedArray = charArray.clone();
        revers(reversedArray);

        System.out.println("Новый массив: " + Arrays.toString(reversedArray));
    }
    public static void revers(char[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int j = array.length - 1 - i;

            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
