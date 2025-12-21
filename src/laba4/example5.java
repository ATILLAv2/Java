package laba4;

import java.util.Random;

public class example5 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;
        Random random = new Random();

        int[][] FArray = new int[rows][cols];
        System.out.println("Массив " + rows + " на " + cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                FArray[i][j] = random.nextInt(100);
                System.out.print(FArray[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] SArray = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                SArray[j][i] = FArray[i][j];
            }
        }

        System.out.println("Новый массив " + cols + " на " + rows);
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(SArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
