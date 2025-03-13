public class Paelindrom {
    public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
        
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        return;
    }
    public void print(){
        Node temp=head;
        for(int i=0;i<size;i++){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public Node findMid(){
        Node fast=head;
        Node slow=head;
        // for(int i=0;fast!=null && fast.next!=null;i++){
        //     fast=fast.next.next;
        //     slow=slow.next;
        // }
        while (fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        //System.out.println(slow.data);
        return slow;
    }
    public boolean checkpelindrome(){
        if (head==null || head.next==null) {
            return true;
        }
        Node mid=findMid();
        Node prev=null;
        Node curr=mid;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        Node right=prev;
        Node left=head;
        while (right!=null) {
            if (left.data!=right.data) {
                return false;
            }
            right=right.next;
            left=left.next;
            
        }
        return true;
    }
    public static void main(String[] args) {
       Paelindrom p=new Paelindrom();
        p.addFirst(1);
        p.addFirst(2);
        p.addFirst(3);
        p.addFirst(2);
        p.addFirst(1);
        p.print();
        System.out.println( p.checkpelindrome());

    }
}
