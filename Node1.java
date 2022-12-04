public class Node1 {
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
    public static Node tail;
    public static int size;
    public  void addFirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head= tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    } 
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=null;
            return;
        }
        tail.next=newNode;
        tail=newNode;
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
    public void add(int idx,int data)
    {
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
          head=tail=null;
          size=0;
          return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev =head;
        for(int i=0;i<size-2;i++)
        {
           prev=prev.next; 
        }
        int val=prev.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
    }
    public int itrSearch(int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp =temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1)
        {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key)
    {
        return helper(head,key);
    }
    public void reverse()
    {
        Node prev=null;
        Node Curr=tail=head;
        Node next;
        while(Curr!=null)
        {
    next=Curr.next;
    Curr.next=prev;
    prev=Curr;
    Curr=next;
        }
        head=prev;
    }
    public void deleteNthfromend(int n)
    {
        int sz=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            sz++;
        }
        if(n==sz)
        {
            head=head.next;
            return;
        }
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind)
        {
          prev=prev.next;
          i++;
        }
        prev.next=prev.next.next;
        return;

    }
    public Node findmid(Node head)
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
    public boolean checkPalindrome()
    {
        if(head==null||head.next!=null)
        {
            return true;
        }
        // find mid
        Node midNode=findmid(head);
        // reverse 2nd half
        Node prev=null;
        Node Curr=midNode;
        Node next;
        while(Curr!=null)
        {
         next=Curr.next;
         Curr.next=prev;
         prev=Curr;
         Curr=next;
        }
        Node right =prev;
        Node left=head;
        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
   // MERGE SORT
    private Node getMid(Node head)
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
    public Node mergeSort(Node head)
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
    public void zigzag()
    {
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextR,nextL;
        //alt merge -zig-zag merge
        while(left!=null&&right!=null)
        {
           nextL=left.next;
           left.next=right;
           nextR=right.next;
           right.next=nextL;
           left=nextL;
           right=nextR;
        }
        }
    public static void main(String[] args) {
        Node1 l1=new Node1();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(6);
      //  l1.addLast(3);
      //  l1.addLast(4);
      //  l1.add(2, 9);
      //  l1.print();
        //System.out.println(l1.size);
       // l1.removeLast();
        //l1.print();
        //System.out.println(l1.itrSearch(9));
       // System.out.println(l1.itrSearch(19));
       // System.out.println(l1.recSearch(9));
      //  System.out.println(l1.recSearch(19));
      //  l1.reverse();
      //  l1.print();
       // l1.deleteNthfromend(3);
        l1.print();
        //System.out.println(l1.checkPalindrome());
       // l1.head=l1.mergeSort(l1.head);
      //  l1.print();
        l1.zigzag();
        l1.print();
        
        
    }
}
