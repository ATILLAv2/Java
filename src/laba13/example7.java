package laba13;

public class example7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (ArithmeticException e) {
            System.out.println("2");
        }
        try {
            System.out.println("0_1");
            throw new ArithmeticException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("2");
        }
        System.out.println("3");
    }
}
