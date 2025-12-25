package laba5;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        CharPrnt obj = new CharPrnt();

        System.out.print("Введите первый символ: ");
        char fChar = in.next().charAt(0);
        obj.setStartChar(fChar);

        System.out.print("Введите второй символ: ");
        char sChar = in.next().charAt(0);
        obj.setEndChar(sChar);

        obj.prntChar();
    }

    static class CharPrnt {
        private char startChar;
        private char endChar;

        public void setStartChar(char startChar) {
            this.startChar = startChar;
        }

        public void setEndChar(char endChar) {
            this.endChar = endChar;
        }

        public void prntChar() {
            char first = startChar < endChar ? startChar : endChar;
            char last = startChar < endChar ? endChar : startChar;

            for (char ch = first; ch <= last; ch++) {
                System.out.print(ch + " ");
            }
        }
    }
}