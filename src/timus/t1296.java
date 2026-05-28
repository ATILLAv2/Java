package timus;

import java.util.Scanner;

public class t1296 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            int p = in.nextInt();
            currentSum += p;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println(maxSum);
        in.close();
    }
}
