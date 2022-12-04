import java.util.*;

public class AddElement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(15);
        list.add(6);
        list.add(1);
        list.add(21);
        // print list
        System.out.println(list);
        // get an element
        int n= list.get(5);
        System.out.println(n);
       // remove an element 
        list.remove(2);
        System.out.println(list);
        //set element at index
        list.set(2, 10);
        System.out.println(list);
        // contains element
        System.out.println(list.contains(1));
        System.out.println(list.contains(17));
        // add an element at any index
        list.add(1,9);
        System.out.println(list);
        // find the size
        System.out.println(list.size());
        for(int i=0;i<=list.size()-1;i++)
        {
            System.out.print(list.get(i));
            System.out.print(" ");
        }
        System.out.println();
        // print reverse of an ArrayList
        
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i));
            System.out.print(" ");
        }
        System.out.println();
        // sort in ascending order
        Collections.sort(list);

    }
}
