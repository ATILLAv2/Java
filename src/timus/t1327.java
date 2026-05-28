package timus;

import java.util.Scanner;

public class t1327 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        int count = 0;

        for (int i = A; i <= B; i++) {
            if (i % 2 == 1) {
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
