package laba11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class example10 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }

        int filter = 50;
        List<Integer> integersAfter = filterLessThan(integers, filter);

        System.out.println("\n" + "Список после фильтрации (меньше " + filter + "): " + "\n");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterLessThan(List<Integer> list, int filter) {
        return list.stream()
                .filter(x -> x < filter)
                .collect(Collectors.toList());
    }
}
