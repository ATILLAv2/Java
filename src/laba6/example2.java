package laba6;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Введите 'f' для вызова счетчика:");
            String input = in.nextLine();

            if (input.equalsIgnoreCase("f")) {
                Counter.inc();
            } else {
                break;
            }
        }
        System.out.println("Программа завершена. Всего вызовов: " + Counter.getCount());
        in.close();
    }
    static class Counter {
        private static int count = 0;

        public static void inc() {
            System.out.println("Текущее значение счетчика: " + count);
            count++;

        }
        public static int getCount() {
            return count;
        }
    }
}
