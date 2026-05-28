package timus;

import java.math.BigInteger;
import java.util.Scanner;

public class t1243 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger N = in.nextBigInteger();
        BigInteger result = N.mod(BigInteger.valueOf(7));
        System.out.println(result);
        in.close();
    }
}
