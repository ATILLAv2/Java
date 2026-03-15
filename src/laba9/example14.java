package laba9;

public class example14 {
    public static void main(String[] args) {
        example14 list = new example14();
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("1. Создание с головы:");
        list.createHead(values);
        System.out.println("Результат: " + list);

        System.out.println("\n2. Создание с хвоста:");
        list.createTail(values);
        System.out.println("Результат: " + list);

        System.out.println("\n3. Добавление в начало:");
        list.addFirst(0);
        System.out.println("Результат: " + list);

        System.out.println("\n4. Добавление в конец:");
        list.addLast(6);
        System.out.println("Результат: " + list);

        System.out.println("\n5. Вставка по индексу:");
        list.insert(3, 99);
        System.out.println("Результат: " + list);

        System.out.println("\n6. Удаление первого:");
        list.removeFirst();
        System.out.println("Результат: " + list);

        System.out.println("\n7. Удаление последнего:");
        list.removeLast();
        System.out.println("Результат: " + list);

        System.out.println("\n8. Удаление по индексу:");
        list.remove(2);
        System.out.println("Результат: " + list);

        System.out.println("\n9. Рекурсивное создание с головы:");
        list.createHeadRec(new int[]{10, 20, 30, 40});
        System.out.println("Результат: " + list.toStringRec());

        System.out.println("\n10. Рекурсивное создание с хвоста:");
        list.createTailRec(new int[]{50, 60, 70, 80});
        System.out.println("Результат: " + list.toStringRec());
    }

    private Node head;

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void createHead(int[] values) {
        head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node(values[i], head);
        }
    }
    public void createTail(int[] values) {
        head = null;
        Node tail = null;

        for (int value : values) {
            if (head == null) {
                head = new Node(value);
                tail = head;
            } else {
                tail.next = new Node(value);
                tail = tail.next;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;

        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" - ");
            }
            current = current.next;
        }
        return sb.toString();
    }

    public void addFirst(int value) {
        head = new Node(value, head);
    }

    public void addLast(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);
    }

    public void insert(int index, int value) {
        if (index < 0) return;

        if (index == 0) {
            addFirst(value);
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) return;
            current = current.next;
        }
        if (current != null) {
            current.next = new Node(value, current.next);
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void remove(int index) {
        if (index < 0 || head == null) return;

        if (index == 0) {
            removeFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current.next == null) return;
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    public void createHeadRec(int[] values) {
        head = ref(values, values.length - 1);
    }

    private Node ref(int[] values, int index) {
        if (index < 0) return null;
        return new Node(values[index], ref(values, index - 1));
    }

    public void createTailRec(int[] values) {
        head = refTail(values, 0);
    }
    private Node refTail(int[] values, int index) {
        if (index >= values.length) return null;
        return new Node(values[index], refTail(values, index + 1));
    }

    public String toStringRec() {
        return refStr(head);
    }

    private String refStr(Node node) {
        if (node == null) return "";
        if (node.next == null) return String.valueOf(node.value);
        return node.value + " - " + refStr(node.next);
    }
}
