package laba3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");

            int size = in.nextInt();

            if (size <= 0) {
                System.out.println("Ошибка: массив должен быть положительным");
                in.close();
                return;
            }

            int[] numbers = new int[size];
            int index =0;

            for (int i = 1; index < size; i++) {
                if (i % 5 == 2) {
                    numbers[index] = i;
                    index++;
                }
            }

            System.out.println("\nМассив чисел:");
            for (int i = 0; i < size; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Ошибка: необходимо ввести целое число");
        }

        finally {
            in.close();
        }
    }
}
