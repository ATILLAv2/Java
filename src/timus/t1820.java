package timus;

import java.util.Scanner;

public class t1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        if (n <= k) {
            System.out.println(2);
        } else {
            int totalSides = n * 2;

            int minutes = (totalSides + k - 1) / k;
            System.out.println(minutes);
        }
        in.close();
    }
}
