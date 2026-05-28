package timus;

import java.util.Scanner;

public class t2056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean Three = false;
        boolean allFive = true;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            int grade = in.nextInt();

            if (grade == 3) {
                Three = true;
            }
            if (grade != 5) {
                allFive = false;
            }
            sum += grade;
        }
        double average = sum / n;

        if (Three) {
            System.out.println("None");
        } else if (allFive) {
            System.out.println("Named");
        } else if (average >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
        in.close();
    }
}
