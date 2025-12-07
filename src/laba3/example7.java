package laba3;

public class example7 {
    public static void main(String[] args) {
        int array_size = 10;

        char[] array = new char[array_size];

        char let = 'а';
        for (int i = 0; i < array_size; i++) {
            array[i] = let;
            let += 2;
        }

        System.out.println("Массив в прямом порядке:");
        for (int i = 0; i < array_size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nМассив в обратном порядке:");
        for (int i = array_size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
