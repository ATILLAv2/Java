package laba1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Месяц: ");
        String month = in.nextLine();

        System.out.println("Количество дней: ");
        int days = in.nextInt();

        System.out.println(month +" содержит в себе " +days +" дней");
        in.close();

    }
}
