package laba9;

import java.util.LinkedList;
import java.util.List;

public class example13 {
    public static void main(String[] args) {
        int N = 100000;

        long startTime = System.nanoTime();

        List<Integer> people = new LinkedList<>();
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
