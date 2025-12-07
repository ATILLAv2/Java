package laba3;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = in.nextInt();

        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        System.out.println("Числа от " + min + " до " + max);
        System.out.println("Оператор fro");

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Оператор while");

        int i = min;
        while (i <= max) {
            System.out.print(i + " ");
            i++;
        }
        in.close();

    }
}
