import java.util.HashMap;
public class Question01 {
    public static void main(String[] args) {
        // create
        HashMap<String,Integer>hm= new HashMap<>();
        // insert-O(1)
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("US", 50);
        System.out.println(hm);

        //get-O(1)
       int population= hm.get("India");
       System.out.println(population);
       System.out.println(hm.get("Indonesia"));
       // containskey-O(1)
       System.out.println(hm.containsKey("India"));
       System.out.println(hm.containsKey("indonesia"));
       // remove--O(1)
       System.out.println(hm.remove("china"));
       System.out.
       println(hm);
       // size
       System.out.println(hm.size());
       // Is empty
       hm.clear();
       System.out.println(hm.isEmpty());
    }
}
