package laba9;

public class example5 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int result = n * fact(n - 1);
            System.out.println("fact " + result);
            return result;
        }
    }
}
