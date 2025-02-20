public class Link1 {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addMiddle(int data, int idx) {
        Node newNode = new Node(data);
        int i = 1;
        Node temp = head;
        if (idx == 0) {
            addFirst(data);
            return;
        }
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void AddLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {

            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Link1 l = new Link1();
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);
        l.AddLast(4);
        l.AddLast(6);
        l.addMiddle(5, 5);
        l.print();

    }
}