package timus;

import java.util.Scanner;

public class t1607 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        while (a < c) {
            a += b;
            if (a > c) {
                a = c;
                break;
            }
            c -= d;
        }
        System.out.println(a);
        in.close();
    }
}
