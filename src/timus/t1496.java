package timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class t1496 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> sub = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String team = in.nextLine();
            sub.put(team, sub.getOrDefault(team, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : sub.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
        in.close();
    }
}
