package timus;

import java.util.HashSet;
import java.util.Scanner;

public class t1563 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        HashSet<String> visited = new HashSet<>();
        int bayanCount = 0;

        for (int i = 0; i < n; i++) {
            String shop = in.nextLine();
            if (visited.contains(shop)) {
                bayanCount++;
            } else {
                visited.add(shop);
            }
        }
        System.out.println(bayanCount);
        in.close();
    }
}
