package laba12;

import java.util.Random;

public class example5 {
    private static int[] array;
    private static int max;

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
                int localMax = array[start];
                for (int j = start + 1; j < end; j++) {
                    if (array[j] > localMax) {
                        localMax = array[j];
                    }
                }
                if (localMax > max) {
                    max = localMax;
                }
            });
            threads[i].start();
            threads[i].join();
        }
        System.out.println("\nМаксимальный элемент: " + max);
    }
}
