package laba13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example17 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)){

            System.out.print("Введите размер массива: ");
            int size = in.nextInt();

            if (size <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным");
            }

            byte[] array = new byte[size];

            System.out.println("Введите элементы массива (от -128 до 127):");
            for (int i = 0; i < size; i++) {
                System.out.print("элемент[" + i + "] = ");
                int input = in.nextInt();

                if (input < -128 || input > 127) {
                    throw new ArithmeticException("Число " + input + " выходит за пределы диапазона byte");
                }
                array[i] = (byte) input;
            }

            int sum = 0;
            for (byte num : array) {
                sum += num;
            }

            if (sum < -128 || sum > 127) {
                throw new ArithmeticException("Сумма " + sum + " выходит за пределы диапазона byte");
            }
            System.out.println("Сумма элементов массива: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введена строка вместо числа");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
