package laba11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class example5 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        System.out.println("\n" + "Список до: " + "\n");

        strings.add("Строка 1");
        strings.add("Строка 2 подстрока 1");
        strings.add("Строка 3 подстрока 2");
        strings.add("Строка 4");
        strings.add("Строка 5 подстрока 3");

        for (String s : strings) {
            System.out.println(s);
        }

        String searchSubstring = "подстрока";
        List<String> stringsAfter = filterBySubstring(strings, searchSubstring);

        System.out.println("\n" + "Список после фильтрации (содержат \"" + searchSubstring + "\"): " + "\n");

        for (String s : stringsAfter) {
            System.out.println(s);
        }
    }
    public static List<String> filterBySubstring(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }

}
