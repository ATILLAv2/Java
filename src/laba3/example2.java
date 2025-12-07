package laba3;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        String day = in.nextLine().toLowerCase();

        System.out.print("Номер дня недели(if/else): ");

        if (day.equals("понедельник")) {
            System.out.println("1");
        } else if (day.equals("вторник")) {
            System.out.println("2");
        } else if (day.equals("среда")) {
            System.out.println("3");
        } else if (day.equals("четверг")) {
            System.out.println("4");
        } else if (day.equals("пятница")) {
            System.out.println("5");
        } else if (day.equals("суббота")) {
            System.out.println("6");
        } else if (day.equals("воскресенье")) {
            System.out.println("7");
        } else {
            System.out.println("Ошибка, такого дня недели нет.");
        }

        System.out.print("Номер дня недели(switch): ");

        switch (day) {
            case "понедельник":
                System.out.println(1);
                break;
            case "вторник":
                System.out.println(2);
                break;
            case "среда":
                System.out.println(3);
                break;
            case "четверг":
                System.out.println(4);
                break;
            case "пятница":
                System.out.println(5);
                break;
            case "суббота":
                System.out.println(6);
                break;
            case "воскресенье":
                System.out.println(7);
                break;
            default:
                System.out.println("Ошибка, такого дня недели нет.");
        }

        in.close();
    }

}
