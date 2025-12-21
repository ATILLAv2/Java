package timus;

import java.util.Scanner;

public class t1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        System.out.println(N * (M + 1));
        in.close();
    }
}
