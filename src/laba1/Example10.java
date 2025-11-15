package laba1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ваш год рождения: ");
        int age = in.nextInt();

        age = 2025 - age;

        System.out.println("Ваш возраст: " + age);
        in.close();

    }
}
