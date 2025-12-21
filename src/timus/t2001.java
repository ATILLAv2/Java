package timus;

import java.util.Scanner;

public class t2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        int x = a1 - a3; // ягоды первого
        int y = b1 - b2; // ягоды второго

        System.out.println(x + " " + y);

        in.close();
    }
}
