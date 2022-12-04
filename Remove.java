public class Remove {
    public static class Node
    {
        int data;
        Node next;
        int size;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.size=Node.size();
        }
    }
    public static Node head;
    public static Node tail;
    public void print() //Tc=O(n)
    {
        if(head==null)
        {
            System.out.println("LL is empty");
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    } 
    public void print() //Tc=O(n)
    {
        if(head==null)
        {
            System.out.println("LL is empty");
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Remove l1=new Remove();
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(3);
        l1.addLast(4);
        l1.add(2, 9);
        l1.print();
        l1.removeFirst();
        l1.print();
    }
}
