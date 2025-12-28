package timus;

import java.util.Scanner;

public class t2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int min1 = a - b * c;
        int min2 = a * b - c;
        int min3 = a + b - c;
        int min4 = a - b - c;
        int min5 = a * b * c;

        int result = Math.min(min1, Math.min(min2, Math.min(min3, Math.min(min4, min5))));
        System.out.println(result);
    }
}
