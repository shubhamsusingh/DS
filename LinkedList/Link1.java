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
    int size = 0;

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
        Node newNode = new Node(data);
        size++;
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

    public boolean removeFirst() {
        // Node temp=head;
        if (head == null) {
            return false;
        }
        head = head.next;
        return true;

    }

    public boolean removeLast() {
        if (head == null) {
            return false;
        }
        Node temp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        size--;
        return true;
    }

    public boolean removeIndex(int idx) {
        Node temp = head;
        int i = -1;
        if (head == null) {
            return false;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            while (temp != null && i < idx - 1) {
                temp = temp.next;
                i++;
            }
            if (temp == null || temp.next == null) {
                return false;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }

        }
        size--;
        return true;

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
        boolean flag = l.removeFirst();
        if (flag) {
            System.out.println("Element Deleted Successfully");
        } else {

            System.out.println("Element cant Deleted (NOt avaiblable)");
        }
        l.print();
        boolean flag1 = l.removeLast();
        if (flag1) {
            System.out.println("Element Deleted Successfully");
        } else {

            System.out.println("Element cant Deleted (NOt avaiblable)");
        }
        l.print();
        boolean flag2 = l.removeIndex(2);
        if (flag2) {
            System.out.println("Element Deleted Successfully");
        } else {

            System.out.println("Element cant Deleted (NOt avaiblable)");
        }
        l.print();

    }
}