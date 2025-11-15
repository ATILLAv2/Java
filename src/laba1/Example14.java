package laba1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();

        int num1 = num - 1;
        int num2 = num + 1;
        int num3 = num + num1 + num2;
        int a = 2;

        System.out.println(num1 + "\n" + num + "\n" + num2);
        System.out.println(Math.pow(num3,a));

        in.close();

    }
}
