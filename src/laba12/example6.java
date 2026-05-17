package laba12;

import java.util.Random;

public class example6 {
    private static int[] array;
    private static int sum = 0;

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        Thread[] threads = new Thread[8];
        for (int i = 0; i < 8; i++) {
            final int start = i;
            final int end = (i == 7) ? array.length : start + 1;

            threads[i] = new Thread(() -> {
                int localSum = 0;
                for (int j = start; j < end; j++) {
                    localSum += array[j];
                }
                sum += localSum;
            });
            threads[i].start();
            threads[i].join();
        }
        System.out.println("\nСумма элементов массива: " + sum);
    }
}
