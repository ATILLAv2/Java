package laba6;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое неотрицательное число: ");
        int n = in.nextInt();

        if (n < 0) {
            System.out.println("Ошибка: число должно быть неотрицательным!");
        } else {
            long result = doubleFact(n);
            System.out.println(n + "!! = " + result);
        }
        in.close();
    }
    public static long doubleFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        int current = n;

        while (current > 0) {
            result *= current;
            current -= 2;
        }
        return result;
    }
}
