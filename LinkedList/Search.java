import java.security.PublicKey;

public class Search {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        return;

    }

    public int find(int data) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == data) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        Search s = new Search();
        s.addFirst(5);
        s.addFirst(4);
        s.addFirst(3);
        s.addFirst(2);
        s.addFirst(1);
        s.print();
        int f = s.find(8);
        if (f != Integer.MIN_VALUE) {
            System.out.println("data is Present on index = " + f);
        } else {
            System.out.println("Data is not Present");
        }

    }
}
