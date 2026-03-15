package laba9;

import java.util.HashMap;

public class example11 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            map.put(i, "Строка" + i);
        }

        System.out.println("Ключи > 5:");
        map.forEach((k, v) -> {
            if (k > 5) {
                System.out.println(k + " = " + v);
            }
        });

        System.out.println("\nКлюч = 0:");
        StringBuilder sb = new StringBuilder();
        map.forEach((k, v) -> {
            if (k == 0) {
                sb.append(v).append(", ");
            }
        });
        System.out.println(!sb.isEmpty() ? sb.substring(0, sb.length()-2) : "Нет");

        System.out.println("\nПроизведение ключей:");
        long p = 1;
        for (var e : map.entrySet()) {
            if (e.getValue().length() > 5) {
                p *= e.getKey();
            }
        }
        System.out.println(p > 1 ? p : "Нет подходящих ключей");
    }
}
