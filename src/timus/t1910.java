package timus;

import java.util.Scanner;

public class t1910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int maxSum = 0;
        int middleIndex = 0;

        for (int i = 1; i < n - 1; i++) {
            int sum = a[i - 1] + a[i] + a[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
                middleIndex = i + 1;
            }
        }
        System.out.println(maxSum + " " + middleIndex);
    }
}
