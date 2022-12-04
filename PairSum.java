import java.util.*;
public class PairSum {
    public static boolean pairrsum( ArrayList<Integer> list,int target)
    {
        // brute force
        for( int i=0;i<list.size();i++)
        {
            for( int j=0;j<list.size();j++)
        {
            if(list.get(i)+list.get(j)==target)
            {
return true;
            }
        }
        }
        return false;
    }
    public static boolean pairrSum( ArrayList<Integer> list,int target)
    {
        // two pointer apporach
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp)
        {
            // case 1
            if(list.get(lp)+list.get(rp)==target)
            {
                return true;
            }
           if(list.get(lp)+list.get(rp)<target)
            {
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(21);
        int target=24;
        System.out.println(pairrSum(list,target));
        System.out.println(pairrsum(list,target));
    }
}
