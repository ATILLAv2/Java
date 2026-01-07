package timus;

import java.util.Scanner;

public class t1585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        int emperorCount = 0;
        int littleCount = 0;
        int macaroniCount = 0;
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            switch (line) {
                case "Emperor Penguin" -> emperorCount++;
                case "Little Penguin" -> littleCount++;
                case "Macaroni Penguin" -> macaroniCount++;
            }
        }
        int maxCount = emperorCount;
        String result = "Emperor Penguin";

        if (littleCount > maxCount) {
            maxCount = littleCount;
            result = "Little Penguin";
        }
        if (macaroniCount > maxCount) {
            result = "Macaroni Penguin";
        }
        System.out.println(result);
        in.close();
    }
}
