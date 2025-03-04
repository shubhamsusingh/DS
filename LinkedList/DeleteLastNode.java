public class DeletelastNode{
    public static class Node {
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
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return ;
        }
        if(idx==size-1){
            addLast(data);
            return ;
        }
        Node newNode=new Node(data);
        int i=0;
        Node temp =head;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
       newNode.next=temp.next;
       temp.next=newNode;
       size++;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("Size : "+size);
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return ;
        }
        head=head.next;
        size--;
        if(head==null){
            tail=null;
        }

    }
    public void removeFromLast(int idx){
        if(idx>size){
            System.out.println("Index Out Of Bond");
            return ;
        }
        if(idx==size){
         Node prev=head.next;
         head.next=null;
         head=prev;
         size--;
         return ;
        }
        Node temp=head;
        int i=1;
        while(i<size-idx){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        size--;
        

    }
    public void removeFromMiddle(int idx){
        if(idx<0 && idx>size){
            System.out.println("'can not able to delete");
            return ;
        }
        if(idx==0){
            removeFirst();
            return ;
        }
        // if(idx==size-1){
        //     removeFromLast();
        //     return ;
        // }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        size--;

    }

    public static void main(String[] args){
        DeletelastNode dl=new DeletelastNode();
        dl.addFirst(5);
        dl.addFirst(4);
        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);
        dl.print();
        dl.removeFromLast(5);
        dl.print();
        dl.addLast(6);
        dl.print();
        dl.addMiddle(3,12);
        dl.print();
        dl.removeFirst();
        dl.print();
        dl.removeFromMiddle(0);
        dl.print();
    }
    
}