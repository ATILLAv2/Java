package laba5;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = in.nextInt();

        System.out.print("Введите символ: ");
        char character = in.next().charAt(0);

        CharIntD obj1 = new CharIntD(number, character);
        obj1.display();

        System.out.print("Введите число с плавающей запятой: ");
        double value = in.nextDouble();

        CharIntD obj2 = new CharIntD(value);
        obj2.display();
    }

    static class CharIntD {
        private char character;
        private int number;

        public CharIntD(int number, char character) {
            this.number = number;
            this.character = character;
        }

        public CharIntD(double value) {
            int intPart = (int) value;
            this.character = (char) intPart;

            double drob = value - intPart;
            this.number = (int)(drob * 100);
        }

        public void display() {
            System.out.println("Символ: '" + character + "' код: " + (int) character);
            System.out.println("Число: " + number);
        }
    }
}
