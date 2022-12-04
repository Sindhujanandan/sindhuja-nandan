import java.util.*;
public class Question8 {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Patna");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        Iterator it=cities.iterator();
       
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("through advance for loop");
        for(String city:cities)
        {
            System.out.println(city);
        }
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        System.out.println("through LinkedHashSet");
        lhs.add("Patna");
        lhs.add("Delhi");
        lhs.add("Bengluru");
        lhs.add("Noida");
        lhs.add("Mumbai");
        System.out.println(lhs);
        TreeSet<String> ts=new TreeSet<>();
        System.out.println("through TreeSet");
        ts.add("Patna");
        ts.add("Delhi");
        ts.add("Bengluru");
        ts.add("Noida");
        ts.add("Mumbai");
        System.out.println(ts);
    }
}
