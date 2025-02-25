public class FindFromLast{
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
  public int findDelete(int n){
    Node temp=head;
    int s=0;
    while(temp!=null){
        s++;
        temp=temp.next;
    }
    int idx=s-n;
    int i=1;
    Node prev=head;
    while(i<idx){
        prev=prev.next;
        i++;
    }
    int data=prev.next.data;
    prev.next=prev.next.next;
    return data;
  }
  public static void main(String[] args){
    FindFromLast fe=new FindFromLast();
    fe.addFirst(5);
    fe.addFirst(4);
    fe.addFirst(3);
    fe.addFirst(2);
    fe.addFirst(1);
    fe.print();
    int d=fe.findDelete(3);
    System.out.println("Deleted data is = "+d);
    fe.print();
  }
}