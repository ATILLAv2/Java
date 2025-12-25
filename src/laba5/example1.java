package laba5;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CharContainer obj = new CharContainer();

        System.out.print("Введите символ: ");
        char inputChar = in.next().charAt(0);
        obj.setChar(inputChar);

        int code = obj.getCode();
        System.out.println("Код символа: " + code);

        obj.printChar();
    }

    static class CharContainer {

        private char symbol;

        public void setChar(char symbol) {
            this.symbol = symbol;
        }

        public int getCode() {
            return symbol;
        }

        public void printChar() {
            System.out.println("Символ: " + symbol + " | Код: " + (int) symbol);
        }
    }
}
