package laba5;

public class example3 {
    public static void main(String[] args) {
        TwoInts obj1 = new TwoInts();
        TwoInts obj2 = new TwoInts(1);
        TwoInts obj3 = new TwoInts(2, 3);
    }

    static class TwoInts {

        public TwoInts() {
            System.out.println("Вызван конструктор без аргументов");
        }

        public TwoInts(int first) {
            System.out.println("Вызван конструктор с одним аргументом: " + first);
        }

        public TwoInts(int first, int second) {
            System.out.println("Вызван конструктор с двумя аргументами: " + first + ", " + second);
        }
    }
}
