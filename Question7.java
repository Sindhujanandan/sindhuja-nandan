import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        HashSet<Integer> Set=new HashSet<>();
        Set.add(1);
        Set.add(2);
        Set.add(4);
        Set.add(2);
        System.out.println(Set);
        Set.remove(2);
        if(Set.contains(2))
        {
            System.out.println("Set contains 2");
        }else{
            System.out.println("Not Contains");
        }
        Set.clear();
        System.out.println(Set.size());
        System.out.println(Set.isEmpty());
    }
}
