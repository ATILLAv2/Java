package timus;

import java.util.Scanner;

public class t1991 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {
            int booms = in.nextInt();

            if (booms >= k) {
                a += booms - k;
            } else {
                b += k - booms;
            }
        }
        System.out.println(a + " " + b);
        in.close();
    }
}
