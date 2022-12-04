import java.util.LinkedList;
public class MergeSort {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    private  Node getMid(Node head)
    {
       Node slow=head;
       Node fast=head;
       while(fast!=null&&fast.next!=null)
       {
        slow=slow.next;
        fast=fast.next.next;
       }
       return slow;
    }
    private  Node merge(Node head1,Node head2)
    {
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null&&head2!=null)
        {
            if(head1.data<=head2.data)
            {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
            while(head1!=null)
            {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            while(head2!=null)
            {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
            return mergedLL.next;
        }
    public  static Node mergeSort(Node head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        Node mid=getMid(head);
        // left &right merge sort
        Node righthead=mid.next;
        mid.next=null;
        Node newleft=mergeSort(head);
        Node newright=mergeSort(righthead);
        return merge(newleft,newright);
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(3);
        ll.addLast(4);
        System.out.println(ll);
        mergeSort(ll);
        System.out.println();
      
    }
}
