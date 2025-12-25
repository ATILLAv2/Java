package timus;

import java.util.Scanner;

public class t1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int n = in.nextInt();

        int num = 0;

        for (int i = 0; i < n; i++) {
            int arrived = in.nextInt();
            num += arrived;
            num = Math.max(0, num - k);
        }

        System.out.println(num);
        in.close();
    }
}
