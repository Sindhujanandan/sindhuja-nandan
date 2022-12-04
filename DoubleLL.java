public class DoubleLL {
    public class Node
    {
        int data;
        Node next;
        Node prev;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public static Node head;
public static Node tail;
public static int size;
public void addFirst(int data)
{
    Node newnode=new Node(data);
    size++;
    if(head==null)
    {
        head=tail=newnode;
        return;
    }
    newnode.next=head;
    head.prev=newnode;
    head=newnode;
}
// print 
public void print()
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+"<->");
        temp=temp.next;
    }
    System.out.println("null");
}
public void addLast(int data)
{
     Node newnode=new Node(data);
     size++;
     if(head==null)
     {
        head=tail=newnode;
     }
     newnode.prev=tail;
     tail.next=newnode;
     tail=newnode;
}
public int removeFirst()
{
    size--;
    if(head==null)
    {
      System.out.println("DLL is empty");
      return Integer.MIN_VALUE;
    }
    int val=head.data;
    head=head.next;
    head.prev=null;
    return val;
}
public int removeLast()
{
   
    if(head==null)
    {
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
    }
    int val=tail.data;
    tail=tail.prev;
    tail.next=null;
    size--;
    return val;
}
    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(6);
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addLast(7);
        dll.addLast(8);
        dll.print();
       // System.out.println(dll.size);
       dll.removeFirst();
       dll.removeLast();
       dll.print();
       //System.out.println(dll.size);

    }
}
