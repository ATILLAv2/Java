package laba13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example15 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int size;
            System.out.print("Введите размер массива: ");
            size = in.nextInt();

            if (size <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным");
            }

            int[] array = new int[size];

            System.out.println("Введите элементы массива (целые числа):");
            for (int i = 0; i < size; i++) {
                System.out.print("элемент[" + i + "] = ");
                array[i] = in.nextInt();
            }

            int sum = 0;
            int count = 0;

            for (int num : array) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }

            if (count == 0) {
                throw new ArithmeticException("Положительные элементы отсутствуют");
            }

            double avg = (double) sum / count;
            System.out.println("Среднее значение: " + avg);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введена строка вместо числа");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e);
        }  catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
