package laba1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        Float num1 = in.nextFloat();

        System.out.println("Введите второе число: ");
        Float num2 = in.nextFloat();

        Float sum = num1 + num2;
        Float raz = num1 - num2;

        System.out.println(sum + "\n" + raz);

        in.close();

    }
}
