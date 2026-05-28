package timus;

import java.util.Scanner;

public class t1545 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = in.nextLine();
        }

        String letter = in.nextLine();

        for (String h : str) {
            if (h.startsWith(letter)) {
                System.out.println(h);
            }
        }
        in.close();
    }
}
