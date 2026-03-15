package laba9;

public class example9 {
    public static void main(String[] args) {
        Node head = newNode(1);
        while (head != null) {
            System.out.println(" " + head.value);
            head = head.next;
        }
    }

    static Node newNode(int x) {
        Node node = new Node(x, null);
        if ((2*x + 1) < 20) {
            node.next = newNode(2*x + 1);
        }
        return node;
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
