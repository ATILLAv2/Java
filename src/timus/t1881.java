package timus;

import java.util.Scanner;

public class t1881 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int w = in.nextInt();
        int n = in.nextInt();
        in.nextLine();

        int currentLineLength = 0;
        int lines = 1;

        for (int i = 0; i < n; i++) {
            String word = in.nextLine();
            int wordLength = word.length();

            if (currentLineLength == 0) {
                currentLineLength = wordLength;
            } else if (currentLineLength + 1 + wordLength <= w) {
                currentLineLength += 1 + wordLength;
            } else {
                lines++;
                currentLineLength = wordLength;
            }
        }
        int pages = (lines + h - 1) / h;
        System.out.println(pages);
        in.close();
    }
}
