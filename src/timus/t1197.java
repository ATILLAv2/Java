package timus;

import java.util.Scanner;

public class t1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        int[] dx = {2, 2, -2, -2, 1, 1, -1, -1};
        int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};

        for (int i = 0; i < n; i++) {
            String position = in.nextLine().trim();
            int column = position.charAt(0) - 'a' + 1;
            int row = position.charAt(1) - '0';

            int count = 0;
            for (int j = 0; j < 8; j++) {
                int newCol = column + dx[j];
                int newRow = row + dy[j];
                if (newCol >= 1 && newCol <= 8 && newRow >= 1 && newRow <= 8) {
                    count++;
                }
            }
            System.out.println(count);
        }
        in.close();
    }
}
