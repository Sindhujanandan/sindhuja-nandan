import java.util.*;
public class Question11 {
    public static String getStart(HashMap<String,String>tickets)
    {
        HashMap<String,String>revMap=new HashMap<>();
        for(String key:tickets.keySet())
        {
            revMap.put(tickets.get(key),key);
        }
        for(String key:tickets.keySet())
        {
            if(!revMap.containsKey(key))
            {
                return key;//starting point 
            }
        }
        return null;
    }
    public static void main(String[] args) {
       HashMap<String,String>tickets=new HashMap<>();
       tickets.put("Chennai", "Bengaluru");
       tickets.put("Mumbai", "Delhi");
       tickets.put("Goa", "Chennai");
       tickets.put("Delhi", "Goa");
        String start=getStart(tickets);
        for (String key : tickets.keySet()) {
            System.out.print("->"+tickets.get(start));
            start=tickets.get(start);
        }
        System.out.println();
    }
}