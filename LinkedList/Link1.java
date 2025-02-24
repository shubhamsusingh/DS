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
    public static int size = 0;

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

    public void addMiddle(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i = 1;
        Node temp = head;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void AddLast(int data) {
        Node newNode = new Node(data);
        size++;
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

    public int removeFirst() {
        // Node temp=head;
        if (size == 0) {
            System.out.println("Linked List Is Empty");
            return Integer.MIN_VALUE;
        }
        size--;
        int val = head.data;
        head = head.next;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            size--;
            int val = head.data;
            head = tail = null;
            return val;
        } else {
            Node temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }
            int val = temp.next.data;
            temp.next = null;
            tail = temp;

            size--;
            return val;
        }
    }

    public int removeIndex(int idx) {
        Node temp = head;
        int i = 0;
        int val;
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1 && idx == 1) {
            val = head.data;
            head = tail = null;
            return val;
        } else if (size >= idx) {
            while (temp != null && i < idx - 1) {
                temp = temp.next;
                i++;
            }
            size--;
            val = temp.next.data;
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }

        } else {
            System.out.println("You have not enough data");
            return Integer.MAX_VALUE;
        }

        return val;

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
        int flag = l.removeFirst();

        System.out.println("Element Deleted Successfully " + flag);

        l.print();
        int flag1 = l.removeLast();

        System.out.println("Element Deleted Successfully " + flag1);

        l.print();
        int flag2 = l.removeIndex(3);

        System.out.println("Element Deleted Successfully" + flag2);

        l.print();
        System.out.println("this is size " + size);

    }
}