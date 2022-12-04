public class LengthString {
    public static int lengthofstring(String str)
    {
        if(str.length()==0)
        {
          return 0;
        } 
        return lengthofstring(str.substring(1))+1;

    }
    public static void main(String[] args) {
        String str="sindhuja";
        System.out.print( lengthofstring(str));
       
    }
}
