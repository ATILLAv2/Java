package laba6;

import java.util.Arrays;
import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        if (size <= 0) {
            System.out.println("Размер массива должен быть положительным");
            in.close();
            return;
        }

        int[] originalArray = new int[size];
        System.out.println("Введите " + size + " целых чисел:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = in.nextInt();
        }

        System.out.print("Введите количество начальных элементов для копирования: ");
        int count = in.nextInt();
        int[] newArray = copyArray(originalArray, count);

        System.out.println("Исходный массив: " + Arrays.toString(originalArray));
        System.out.println("Новый массив: " + Arrays.toString(newArray));
        in.close();
    }
    public static int[] copyArray(int[] array, int count) {
        if (count > array.length) {
            count = array.length;
        }
        int[] result = new int[count];
        System.arraycopy(array, 0, result, 0, count);
        return result;
    }
}
