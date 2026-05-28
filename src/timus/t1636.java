package timus;

import java.util.Scanner;

public class t1636 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T1 = in.nextInt();
        int T2 = in.nextInt();
        in.nextLine();

        int penalty = 0;
        for (int i = 0; i < 10; i++) {
            int attempts = in.nextInt();
            penalty += attempts * 20;
        }

        if (T2 - penalty < T1) {
            System.out.println("Dirty debug :(");
        } else {
            System.out.println("No chance.");
        }
        in.close();
    }
}
