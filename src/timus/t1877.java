package timus;

import java.util.Scanner;

public class t1877 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int code1 = Integer.parseInt(scanner.nextLine());
        int code2 = Integer.parseInt(scanner.nextLine());

        boolean canHack = (code1 % 2 == 0) || (code2 % 2 == 1);

        System.out.println(canHack ? "yes" : "no");
        scanner.close();
    }
}
