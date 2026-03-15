package laba9;

public class example6 {
    public static void main(String[] args) {
        Node head = null;
        for (int i=9; i>=0; i--) {
            head = new Node(i, head);
        }

        Node ref = head;
        Node newtail = new Node(123, null);
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newtail;

        Node newNode=new Node(44, null);
        ref = head;
        int k=1;

        while (ref.next!= null && (k<2 )) {
            ref = ref.next;
            k++;
        }
        newNode.next=ref.next.next;
        ref.next=newNode;

        ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next=null;

        ref = head;
        int d=1;
        while (ref.next!= null && (d<6)) {
            ref = ref.next;
            d++;
        }
        ref.next = ref.next.next;

        ref = head;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }

    static class Node {
        public int value;
        public Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
