package laba9;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Размер: ");
        int[] a = new int[in.nextInt()];

        System.out.println("Введите массив:");
        input(a, 0, in);

        System.out.println("Массив:");
        output(a, 0);

        in.close();
    }
    static void input(int[] a, int i, Scanner s) {
        if (i < a.length) {
            System.out.print(i + " = ");
            a[i] = s.nextInt();
            input(a, i + 1, s);
        }
    }

    static void output(int[] a, int i) {
        if (i < a.length) {
            System.out.print(a[i] + " ");
            output(a, i + 1);
        }
    }
}
