package laba1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Первое число: ");
        float num1 = in.nextFloat();

        System.out.println("Второе число: ");
        float num2 = in.nextFloat();

        float sum = num1 + num2;

        System.out.println("Сумма чисел равна: " + sum);
        in.close();

    }
}
