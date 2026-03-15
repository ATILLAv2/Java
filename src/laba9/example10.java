package laba9;

public class example10 {
    public static void main(String[] args) {
        Node ref = newNode(1);
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
    }

    static Node newNode(int x) {
        if ((2*x + 1) >= 20) {
            return new Node(x, null);
        }
        Node tail = newNode(2*x + 1);
        return new Node(x, tail);
    }

    static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
