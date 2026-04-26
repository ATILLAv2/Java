package laba11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class example9 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        System.out.println("\n" + "Список до: " + "\n");

        strings.add("Строка1");
        strings.add("СтрокаДва");
        strings.add("Строка<3");
        strings.add("СтрокаЧетыре");
        strings.add("Строка№Пять");

        for (String s : strings) {
            System.out.println(s);
        }

        List<String> stringsAfter = filterOnlyLetters(strings);

        System.out.println("\n" + "Список после фильтрации (только буквы): " + "\n");

        for (String s : stringsAfter) {
            System.out.println(s);
        }
    }

    public static List<String> filterOnlyLetters(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[а-яА-Я]+"))
                .collect(Collectors.toList());
    }
}
