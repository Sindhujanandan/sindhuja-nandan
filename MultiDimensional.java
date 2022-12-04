import java.util.*;
public class MultiDimensional {
   public static void main(String[] args) {
    ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
    ArrayList<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(12);
        list.add(15);
        list.add(6);
        list.add(1);
        list.add(21);
        mainlist.add(list);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(33); list2.add(32);list2.add(31);
        mainlist.add(list2);
        for(int i=0;i<mainlist.size();i++)
        {
            ArrayList<Integer> Currlist=mainlist.get(i);
            for(int j=0;j<Currlist.size();j++)
            {
                System.out.print((Currlist.get(j)+" "));
            }
            System.out.println();
        }
        System.out.println(mainlist);
   } 
}
