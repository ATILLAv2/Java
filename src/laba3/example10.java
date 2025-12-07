package laba3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class example10 {
    public static void main(String[] args) {
        Random random = new Random();

        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("\nМассив в порядке убывания значений:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
