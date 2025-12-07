package laba3;

public class example8 {
    public static void main(String[] args) {
        int array_size = 10;

        char[] array = new char[array_size];
        String sogl = "AEIOU";

        char let = 'A';
        for (int i = 0; i < array_size; let++) {
            if (sogl.indexOf(let) == -1) {
                array[i++] = let;
            }
        }

        System.out.println("Массив гласных:");
        for (int i = 0; i < array_size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
