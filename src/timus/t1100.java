package timus;

import java.util.Arrays;
import java.util.Scanner;

public class t1100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Team[] teams = new Team[n];

        for (int i = 0; i < n; i++) {
            int id = in.nextInt();
            int m = in.nextInt();
            teams[i] = new Team(id, m, i);
        }

        Arrays.sort(teams, (a, b) -> {
            if (a.m != b.m) {
                return b.m - a.m;
            }
            return a.index - b.index;
        });

        for (Team t : teams) {
            System.out.println(t.id + " " + t.m);
        }
        in.close();
    }

    static class Team {
        int id;
        int m;
        int index;

        Team(int id, int m, int index) {
            this.id = id;
            this.m = m;
            this.index = index;
        }
    }
}
