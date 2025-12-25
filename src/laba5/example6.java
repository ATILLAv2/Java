package laba5;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        MinMax MinMax = new MinMax();

        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        MinMax.setValues(num1);
        MinMax.getValue();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        MinMax.setValues(num1, num2);
        MinMax.getValue();
    }

    static class MinMax {
        private int min;
        private int max;

        public MinMax() {
            this.min = 0;
            this.max = 0;
        }

        public MinMax(int value) {
            setValues(value);
        }

        public MinMax(int value1, int value2) {
            setValues(value1, value2);
        }

        public void setValues(int value) {
            this.min = value;
            this.max = value;
        }

        public void setValues(int value1, int value2) {
            if (value1 >= value2) {
                this.max = value1;
                this.min = value2;
            } else {
                this.max = value2;
                this.min = value1;
            }
        }
        public void getValue() {
            System.out.println("min = " + min + ", max = " + max);
        }
    }
}
