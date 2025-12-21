package laba4;

public class example4 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
