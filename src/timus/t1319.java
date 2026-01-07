package timus;

import java.util.Scanner;

public class t1319 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] matrix = new int[N][N];

        int num = 1;

        for (int startCol = N - 1; startCol >= 0; startCol--) {
            int row = 0;
            int col = startCol;
            while (row < N && col < N) {
                matrix[row][col] = num++;
                row++;
                col++;
            }
        }

        for (int startRow = 1; startRow < N; startRow++) {
            int row = startRow;
            int col = 0;
            while (row < N && col < N) {
                matrix[row][col] = num++;
                row++;
                col++;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j]);
                if (j < N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
