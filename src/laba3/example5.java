package laba3;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество чисел для проверки: ");
        int n = in.nextInt();

        int sum = 0;
        int wsum = 0;
        int v = 1;

        System.out.println("Подходящие числа(for):");

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nСумма подходящих чисел: " + sum);

        System.out.println("Подходящие числа(while):");

        while (v <= n) {
            if (v % 5 == 2 || v % 3 == 1) {
                System.out.print(v + " ");
                wsum += v;
            }
            v++;
        }

        System.out.println("\nСумма подходящих чисел: " + wsum);
        in.close();
    }
}
