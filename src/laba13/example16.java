package laba13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example16 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Исходная матрица:");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        try (Scanner in = new Scanner(System.in)){
            System.out.print("Введите номер столбца: ");
            int columnNumber = in.nextInt();

            if (columnNumber < 0) {
                throw new IllegalArgumentException("Номер столбца не может быть отрицательным");
            }
            if (columnNumber >= matrix[0].length) {
                throw new ArrayIndexOutOfBoundsException("Столбца с номером " + columnNumber + " не существует");
            }

            System.out.println("Столбец номер " + columnNumber);
            for (int[] ints : matrix) {
                System.out.println(ints[columnNumber]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введена строка вместо числа");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
