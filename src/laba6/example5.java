package laba6;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите натуральное число: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: число должно быть больше нуля");
        } else {
            long sum = sumSquar(n);

            System.out.println("Сумма квадратов " + n + " = " + sum);
        }
        in.close();
    }
    public static long sumSquar(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;
        }
        return sum;
    }
}
