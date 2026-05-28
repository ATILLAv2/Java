package timus;

import java.util.Scanner;

public class t1263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int[] votes = new int[N + 1];

        for (int i = 0; i < M; i++) {
            int candidate = in.nextInt();
            votes[candidate]++;
        }

        for (int i = 1; i <= N; i++) {
            double percent = (double) votes[i] / M * 100;
            System.out.printf("%.2f%%\n", percent);
        }
        in.close();
    }
}
