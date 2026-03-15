package laba9;

import java.util.ArrayList;
import java.util.List;

public class example12 {
    public static void main(String[] args) {
        int N = 100000;

        long startTime = System.nanoTime();

        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Последний человек: " + people.getFirst());
        System.out.println("Время выполнения: " + duration + " мс");
    }
}
