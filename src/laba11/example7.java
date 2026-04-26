package laba11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class example7 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        System.out.println("\n" + "Список до: " + "\n");

        strings.add("a");
        strings.add("ab");
        strings.add("abc");
        strings.add("abcd");
        strings.add("abcde");
        strings.add("abc");
        strings.add("abcdefg");

        for (String s : strings) {
            System.out.println(s);
        }

        int minLength = 4;
        List<String> stringsAfter = filterByMinLength(strings, minLength);

        System.out.println("\n" + "Список после фильтрации (длина больше " + minLength + "): " + "\n");

        for (String s : stringsAfter) {
            System.out.println(s);
        }
    }

    public static List<String> filterByMinLength(List<String> list, int minLength) {
        return list.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }
}
