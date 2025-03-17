public class Index {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
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
        head.prev = newNode;
        head = newNode;
        return;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;

        }
        System.out.println("null");
        System.out.println("Size of LL " + size);
    }

    public void addMid(int idx, int data) {
        if (head == null) {
            addFirst(data);
            return;
        }
        if (idx == 1) {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 1;
        while (temp != null && i < idx) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        size++;
        if (temp == null && temp.next == null) {
            System.out.println("INDEX out of bound");
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        return;

    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("There is no Node to remove");
            return -1;
        }
        int removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("There is no Node to remove");
            return -1;
        }
        int removedData = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return removedData;

    }

    public void addLast(int data) {

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        return;
    }

    public void printFromlast() {
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        Index i = new Index();
        i.addFirst(5);
        i.addFirst(4);
        i.addFirst(3);
        i.addFirst(2);
        i.addFirst(1);
        i.print();
        i.addLast(6);
        i.addLast(7);
        i.print();
        i.addMid(2, 8);
        i.print();
        i.printFromlast();
        int removedData = i.removeFirst();
        System.out.println("Removed data : " + removedData);
        i.print();
        removedData = i.removeFirst();
        System.out.println("Removed data : " + removedData);
        i.print();
        removedData = i.removeLast();
        System.out.println("Removed data : " + removedData);
        i.print();

    }
}
