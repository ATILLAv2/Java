package laba5;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Num obj = new Num();

        System.out.print("Введите число: ");
        int number = in.nextInt();

        if (number == 0) {
            obj.setValue();
        } else {
            obj.setValue(number);
        }

        System.out.println("Результат: " + obj.getValue());
        in.close();
    }

    static class Num {
        private int value;

        public Num() {
            setValue(0);
        }

        public Num(int val) {
            setValue(val);
        }

        public void setValue() {
            this.value = 0;
        }

        public void setValue(int i) {
            if (i > 100) {
                this.value = 100;
            } else {
                this.value = i;
            }
        }

        public int getValue() {
            return this.value;
        }
    }
}
