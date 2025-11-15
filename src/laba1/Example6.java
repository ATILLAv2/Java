package laba1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Имя: ");
        String fname = in.nextLine();

        System.out.println("Фамилия: ");
        String lname = in.nextLine();

        System.out.println("Отчество: ");
        String sname = in.nextLine();

        System.out.println("Hello: " + lname +" " + fname+" " + sname);
        in.close();

    }
}
