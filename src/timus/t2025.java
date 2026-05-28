package timus;

import java.util.Scanner;

public class t2025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int k = in.nextInt();

            int base = n / k;
            int remainder = n % k;

            int totalPairs = n * (n - 1) / 2;
            int internalPairs = 0;

            internalPairs += (k - remainder) * (base * (base - 1) / 2);
            internalPairs += remainder * ((base + 1) * base / 2);

            int result = totalPairs - internalPairs;
            System.out.println(result);
        }
        in.close();
    }
}
