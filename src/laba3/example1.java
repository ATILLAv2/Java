package laba3;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите номер дня недели (1-7): ");

        if (in.hasNextInt()) {
            int day = in.nextInt();

            switch (day) {
                case 1:
                    System.out.println("1 -> Понедельник");
                    break;
                case 2:
                    System.out.println("2 -> Вторник");
                    break;
                case 3:
                    System.out.println("3 -> Среда");
                    break;
                case 4:
                    System.out.println("4 -> Четверг");
                    break;
                case 5:
                    System.out.println("5 -> Пятница");
                    break;
                case 6:
                    System.out.println("6 -> Суббота");
                    break;
                case 7:
                    System.out.println("7 -> Воскресенье");
                    break;
                default:
                    System.out.println("Введено некорректное значение");
            }
        } else {
            System.out.println("введено некорректное значение");
        }
        in.close();
    }
}
