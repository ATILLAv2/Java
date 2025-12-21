package laba4;

import java.util.Random;

public class example6 {
    public static void main(String[] args) {

        int rows = 5;
        int cols = 6;
        Random random = new Random();
        int rowRemo = random.nextInt(rows);
        int colRemo = random.nextInt(cols);

        int[][] FArray = new int[rows][cols];
        System.out.println("Массив " + rows + " на " + cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                FArray[i][j] = random.nextInt(10);
                System.out.print(FArray[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nУдаляем строку " + rowRemo + " и столбец " + colRemo);

        int[][] SArray = new int[rows - 1][cols - 1];

        for (int i = 0, newR = 0; i < rows; i++) {
            if (i == rowRemo) {
                continue;
            }
            for (int j = 0, newC = 0; j < cols; j++) {
                if (j == colRemo) {
                    continue;
                }
                SArray[newR][newC] = FArray[i][j];
                newC++;
            }
            newR++;
        }

        System.out.println("\nНовый массив " + (rows-1) + "на" + (cols-1));
        for (int[] ints : SArray) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
