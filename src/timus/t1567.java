package timus;

import java.util.Scanner;

public class t1567 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        int[] presses = new int[256];

        presses['a'] = 1;
        presses['b'] = 2;
        presses['c'] = 3;
        presses['d'] = 1;
        presses['e'] = 2;
        presses['f'] = 3;
        presses['g'] = 1;
        presses['h'] = 2;
        presses['i'] = 3;
        presses['j'] = 1;
        presses['k'] = 2;
        presses['l'] = 3;
        presses['m'] = 1;
        presses['n'] = 2;
        presses['o'] = 3;
        presses['p'] = 1;
        presses['q'] = 2;
        presses['r'] = 3;
        presses['s'] = 1;
        presses['t'] = 2;
        presses['u'] = 3;
        presses['v'] = 1;
        presses['w'] = 2;
        presses['x'] = 3;
        presses['y'] = 1;
        presses['z'] = 2;
        presses[' '] = 1;
        presses['.'] = 1;
        presses[','] = 2;
        presses['!'] = 3;

        int total = 0;
        for (char c : line.toCharArray()) {
            total += presses[c];
        }
        System.out.println(total);
        in.close();
    }
}
