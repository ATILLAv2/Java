package laba1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("День недели: ");
        String day = in.nextLine();

        System.out.println("Месяц: ");
        String month = in.nextLine();

        System.out.println("Дата: ");
        int date = in.nextInt();

        System.out.println("Сегодня: " + day +" " + month+" " + date);
        in.close();

    }
}
