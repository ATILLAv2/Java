package timus;

import java.util.HashSet;
import java.util.Scanner;

public class t1196 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        HashSet<String> teacherDates = new HashSet<>();

        for (int i = 0; i < N; i++) {
            teacherDates.add(in.nextLine());
        }

        int M = in.nextInt();
        in.nextLine();
        int count = 0;

        for (int i = 0; i < M; i++) {
            String date = in.nextLine();
            if (teacherDates.contains(date)) {
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
