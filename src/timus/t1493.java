package timus;

import java.util.Scanner;

public class t1493 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ticket = in.next();

        String prev = String.format("%06d", Integer.parseInt(ticket) - 1);
        int prevSum1 = (prev.charAt(0) - '0') + (prev.charAt(1) - '0') + (prev.charAt(2) - '0');
        int prevSum2 = (prev.charAt(3) - '0') + (prev.charAt(4) - '0') + (prev.charAt(5) - '0');

        String next = String.format("%06d", Integer.parseInt(ticket) + 1);
        int nextSum1 = (next.charAt(0) - '0') + (next.charAt(1) - '0') + (next.charAt(2) - '0');
        int nextSum2 = (next.charAt(3) - '0') + (next.charAt(4) - '0') + (next.charAt(5) - '0');

        if (prevSum1 == prevSum2 || nextSum1 == nextSum2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        in.close();
    }
}
