package timus;

import java.util.Scanner;

public class t1723 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int maxCount = 0;
        char maxChar = 'a';
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) ('a' + i);
            }
        }
        System.out.println(maxChar);
        in.close();
    }
}
