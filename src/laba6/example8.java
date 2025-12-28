package laba6;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        if (size <= 0) {
            System.out.println("Размер массива должен быть положительным");
            in.close();
            return;
        }

        int[] array = new int[size];
        System.out.println("Введите " + size + " целых чисел:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        double average = avg(array);
        System.out.printf("Среднее значение: %.2f%n", average);
    }
    public static double avg(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
