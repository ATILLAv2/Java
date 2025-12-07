package laba3;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество чисел Фибоначчи: ");
        int n = in.nextInt();

        long a = 1, b = 1;

        System.out.print("Последовательность fro: ");
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                System.out.print("1 ");
            } else {
                long next = a + b;
                System.out.print(next + " ");
                a = b;
                b = next;
            }
        }
        System.out.println();

        long c = 1, d = 1;
        int count = 1;

        System.out.print("Последовательность while: ");
        while (count <= n) {
            if (count == 1 || count == 2) {
                System.out.print("1 ");
            } else {
                long next = c + d;
                System.out.print(next + " ");
                c = d;
                d = next;
            }
            count++;
        }
        System.out.println();
    }
}
