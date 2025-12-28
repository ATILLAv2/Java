package laba6;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        int[] array = new int[size];
        System.out.println("Введите " + size + " целых чисел:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        System.out.println("Наибольшее: " + math.max(array));
        System.out.println("Наименьшее: " + math.min(array));
        System.out.println("Среднее: " + math.average(array));

        in.close();
    }
    static class math {

        public static int max(int[] numbers) {
            int maxValue = numbers[0];
            for (int num : numbers) {
                if (num > maxValue) {
                    maxValue = num;
                }
            }
            return maxValue;
        }
        public static int min(int[] numbers) {
            int minValue = numbers[0];
            for (int num : numbers) {
                if (num < minValue) {
                    minValue = num;
                }
            }
            return minValue;
        }
        public static double average(int[] numbers) {
            double sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum / numbers.length;
        }
    }
}
