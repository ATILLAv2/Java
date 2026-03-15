package laba9;

import java.util.*;

public class example15 {
    private static final int size = 3000000;
    private static final long index = 3000000;

    public static void main(String[] args) {
        System.out.println("ArrayDeque");

        System.out.println("Добавление в начало: " + getAddFirstTime() + " мс");
        System.out.println("Добавление в середину: " + getAddMiddleTimeDeque() + " мс");
        System.out.println("Добавление в конец: " + getAddLastTime() + " мс");
        System.out.println("Удаление из начала: " + getRemoveFirstTimeDeque() + " мс");
        System.out.println("Удаление из середины: " + getRemoveMiddleTimeDeque() + " мс");
        System.out.println("Удаление из конца: " + getRemoveLastTimeDeque() + " мс");
        System.out.println("Получение по индексу: " + getGetTimeDeque() + " мс");

        System.out.println("\nLinkedHashSet");

        System.out.println("Добавление: " + getAddTimeSet() + " мс");
        System.out.println("Добавление в середину: " + getAddMiddleTimeSet() + " мс");
        System.out.println("Удаление из начала: " + getRemoveFirstTimeSet() + " мс");
        System.out.println("Удаление из середины: " + getRemoveMiddleTimeSet() + " мс");
        System.out.println("Удаление из конца: " + getRemoveLastTimeSet() + " мс");
        System.out.println("Получение по индексу: " + getGetTimeSet() + " мс");

        System.out.println("\nArrayList");

        System.out.println("Добавление в начало: " + getAddFirstTimeList() + " мс");
        System.out.println("Добавление в середину: " + getAddMiddleTimeList() + " мс");
        System.out.println("Добавление в конец: " + getAddLastTimeList() + " мс");
        System.out.println("Удаление из начала: " + getRemoveFirstTimeList() + " мс");
        System.out.println("Удаление из середины: " + getRemoveMiddleTimeList() + " мс");
        System.out.println("Удаление из конца: " + getRemoveLastTimeList() + " мс");
        System.out.println("Получение по индексу: " + getGetTimeList() + " мс");
    }

    //ArrayDeque методы
    private static long getAddFirstTime() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            deque.addFirst(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getAddMiddleTimeDeque() {
        long start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        list.add(list.size() / 2, 999);
        return System.currentTimeMillis() - start;
    }

    private static long getAddLastTime() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            deque.addLast(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getRemoveFirstTimeDeque() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < size; i++) {
            deque.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            deque.pollFirst();
        }
        return System.currentTimeMillis() - start;
    }

    private static long getRemoveMiddleTimeDeque() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < size; i++) {
            deque.add(i);
        }
        long start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>(deque);
        list.remove(list.size() / 2);
        return System.currentTimeMillis() - start;
    }

    private static long getRemoveLastTimeDeque() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < size; i++) {
            deque.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            deque.pollLast();
        }
        return System.currentTimeMillis() - start;
    }

    private static long getGetTimeDeque() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < size; i++) {
            deque.add(i);
        }
        Random rand = new Random(42);
        long start = System.currentTimeMillis();
        for (long i = 0; i < index / 1000; i++) {
            int index = rand.nextInt(deque.size());
            Iterator<Integer> it = deque.iterator();
            int pos = 0;
            while (it.hasNext() && pos < index) {
                it.next();
                pos++;
            }
        }
        return System.currentTimeMillis() - start;
    }

    //LinkedHashSet методы
    private static long getAddTimeSet() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            set.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getAddMiddleTimeSet() {
        long start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        list.add(list.size() / 2, 999);
        return System.currentTimeMillis() - start;
    }

    private static long getRemoveFirstTimeSet() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(i);
        }
        long start = System.currentTimeMillis();
        Iterator<Integer> it = set.iterator();
        if (it.hasNext()) {
            it.next();
            it.remove();
        }
        return System.currentTimeMillis() - start;
    }

    private static long getRemoveMiddleTimeSet() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(i);
        }
        long start = System.currentTimeMillis();
        Iterator<Integer> it = set.iterator();
        int targetIndex = set.size() / 2;
        int idx = 0;
        Integer toRemove = null;
        while (it.hasNext() && idx <= targetIndex) {
            toRemove = it.next();
            idx++;
        }
        if (toRemove != null) {
            set.remove(toRemove);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getRemoveLastTimeSet() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(i);
        }
        long start = System.currentTimeMillis();
        Iterator<Integer> it = set.iterator();
        Integer last = null;
        while (it.hasNext()) {
            last = it.next();
        }
        if (last != null) {
            set.remove(last);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getGetTimeSet() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(i);
        }
        Random rand = new Random(42);
        long start = System.currentTimeMillis();
        for (long i = 0; i < index / 1000; i++) {
            int index = rand.nextInt(set.size());
            Iterator<Integer> it = set.iterator();
            int pos = 0;
            while (it.hasNext() && pos < index) {
                it.next();
                pos++;
            }
        }
        return System.currentTimeMillis() - start;
    }

    //ArrayList методы
    private static long getAddFirstTimeList() {
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.addFirst(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getAddMiddleTimeList() {
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        list.add(list.size() / 2, 999);
        return System.currentTimeMillis() - start;
    }

    private static long getAddLastTimeList() {
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long getRemoveFirstTimeList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            if (!list.isEmpty()) {
                list.removeFirst();
            }
        }
        return System.currentTimeMillis() - start;
    }

    private static long getRemoveMiddleTimeList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        list.remove(list.size() / 2);
        return System.currentTimeMillis() - start;
    }

    private static long getRemoveLastTimeList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            if (!list.isEmpty()) {
                list.removeLast();
            }
        }
        return System.currentTimeMillis() - start;
    }

    private static long getGetTimeList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        Random rand = new Random(42);
        long start = System.currentTimeMillis();
        for (long i = 0; i < index / 1000; i++) {
            int index = rand.nextInt(list.size());
            list.get(index);
        }
        return System.currentTimeMillis() - start;
    }
}
