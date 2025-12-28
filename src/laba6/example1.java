package laba6;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        peregrus obj = new peregrus();

        System.out.print("Введите символ: ");
        char ch = in.nextLine().charAt(0);
        obj.setValue(ch);

        System.out.print("Введите текст: ");
        String str = in.nextLine();
        obj.setValue(str);
        obj.display();

        System.out.print("Введите массив: ");
        String input = in.nextLine();
        char[] charArray = input.toCharArray();
        obj.setValue(charArray);
        obj.display();

        in.close();
    }
    static class peregrus {
        private char charValue;
        private String stringValue;

        public peregrus() {
            charValue = ' ';
            stringValue = "";
        }

        public void setValue(char ch) {
            this.charValue = ch;
        }

        public void setValue(String str) {
            this.stringValue = str;
        }

        public void setValue(char[] charArray) {
            if (charArray.length == 1) {
                this.charValue = charArray[0];
                stringValue = "";
            } else {
                this.stringValue = new String(charArray);
                charValue = ' ';
            }
        }

        public void display() {
            System.out.println("Символьное поле: '" + charValue + "'");
            System.out.println("Текстовое поле: \"" + stringValue + "\"");
        }
    }
}
