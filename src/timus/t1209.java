package timus;

import java.util.Scanner;

public class t1209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            long K = in.nextLong();
            long d = 8 * K - 7;
            long sqrtd = (long) Math.sqrt(d);

            if (sqrtd * sqrtd == d) {
                result.append("1 ");
            } else {
                result.append("0 ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
