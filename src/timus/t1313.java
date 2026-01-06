package timus;

import java.util.Scanner;

public class t1313 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int x = i, y = 0; x >= 0 && y < n; x--, y++) {
                sb.append(a[x][y]).append(" ");
            }
        }
        for (int j = 1; j < n; j++) {
            for (int x = n - 1, y = j; x >= 0 && y < n; x--, y++) {
                sb.append(a[x][y]).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
