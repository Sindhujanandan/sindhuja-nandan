import java.util.*;
import java.util.Collections;
public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(15);
        list.add(6);
        list.add(1);
        list.add(21);
        // sort in Ascending order
        Collections.sort(list);
        System.out.println( list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println( list);
        // Max in the Arraylist
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=list.size()-1;i++)
        {
            max=Math.max(max, list.get(i));
        }
        System.out.println("max element ="+max);
       int idx1=1, idx2=3;
       System.out.println( list);
       swap(list, idx1, idx2);
       System.out.println(list);
}
 // Swap elements of an Arraylist
 public static void swap(ArrayList<Integer> list, int idx1,int idx2)
 {
    int temp=list.get(idx1);
    list.set(idx1,list.get(idx2));
    list.set(idx2, temp);
 }
}
