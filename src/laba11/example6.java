package laba11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class example6 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        int filter = 5;
        List<Integer> integersAfter = filterNumbers(integers, filter);

        System.out.println("\n" + "Список после фильтрации (делятся на " + filter + " без остатка): " + "\n");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterNumbers(List<Integer> list, int filter) {
        return list.stream()
                .filter(x -> x % filter == 0)
                .collect(Collectors.toList());
    }
}
