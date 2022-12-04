import java.util.*;
public class ClassRoom {
    public static void main(String[] args ) {
        Queue<Integer> d = new LinkedList<Integer>();
      //  String s2="1"
      int n=5;
        int[] s1={4,3,2,6,2};
        //d.addFirst("1");
       // d.addFirst(2);
       // d.addLast(4);
       // d.addLast(4);
       // d.remove();
       // d.add(s2 + "1");
      //  d.add(s1+"1");
       // System.out.println(d);
       // String first=d.poll();
       // String se=d.poll();
       // System.out.println(se);
        //d.add(first + se);
        //System.out.println( d.getLast());
       // System.out.println(d);
       //System.out.println(first);
       // System.out.println(d);
       int r=0;
       for (int i = 0; i < n; i++) {
        d.add(s1[i]);
    }
   // System.out.println(d);
    int f=d.poll();
    int s=d.poll();
    r+=f+s;
    d.add(f + s);
   // System.out.println(f);
   // System.out.println(s);
   // System.out.println(d);
    System.out.println(r);
    int f1=d.poll();
    int s2=d.poll();
    r+=f1+s2;
    d.add(f1 + s2);
  // System.out.println(f1);
   // System.out.println(s2);
 //System.out.println(d);
 System.out.println(r);
 int f2=d.poll();
    int s3=d.poll();
    r+=f2+s3;
    d.add(f2 + s3);
  // System.out.println(f2);
   // System.out.println(s3);
 //System.out.println(d);
 System.out.println(r);
 int f3=d.poll();
 int s4=d.poll();
 r+=f3+s4;
 d.add(f3 + s4);
//System.out.println(f3);
// System.out.println(s4);
//System.out.println(d);
System.out.println(r);
    }
}
