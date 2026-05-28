package timus;

import java.util.Scanner;

public class t1876 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int result = Math.max(2 * b + 40, 2 * a + 39);

        System.out.println(result);
        in.close();
    }
}
