package timus;

import java.util.Scanner;

public class t2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int totalTasks = 12;

        int remainingTasks = totalTasks - n;

        int timeForRemainingTasks = remainingTasks * 45;

        int totalTimeNeeded = 60 + timeForRemainingTasks;

        if (totalTimeNeeded <= 300) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        in.close();
    }
}
