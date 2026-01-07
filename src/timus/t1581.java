package timus;

import java.util.Scanner;

public class t1581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                result.append(count).append(" ").append(arr[i - 1]).append(" ");
                count = 1;
            }
        }
        result.append(count).append(" ").append(arr[N - 1]);

        System.out.println(result);
        in.close();
    }
}
