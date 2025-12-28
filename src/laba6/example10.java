package laba6;

import java.util.Arrays;
import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Сколько чисел вы хотите ввести? ");
        int count = in.nextInt();

        if (count <= 0) {
            System.out.println("Количество должно быть положительным!");
            in.close();
            return;
        }

        System.out.println("Введите " + count + " целых чисел:");
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextInt();
        }

        int[] result = MinMax(numbers);
        System.out.println("Наибольшее и наименьшее значений : " + Arrays.toString(result));
        in.close();
    }
    public static int[] MinMax(int... nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }
}
