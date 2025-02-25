public class ReverseLinkedList{
    public static class Node{
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
            if(head==null){
              head=tail=newNode;
              return;  
            }
            newNode.next=head;
            head=newNode;
        }
        public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        public void reverseLL(){
            Node prev=null;
            Node curr=tail=head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;

        }
        public static void main(String[] args){
            ReverseLinkedList rv=new ReverseLinkedList();
            rv.addFirst(5);
            rv.addFirst(4);
            rv.addFirst(3);
            rv.addFirst(2);
            rv.addFirst(1);
            rv.print();
            rv.reverseLL();
            rv.print();
        }
}