public class practice2 {
    public static void main(String args[])
    {
        int x=5,y=4;
        System.out.println("before swapping");
        System.out.println("x="+x);
        System.out.println("y"+y);
        //int x=5,y=4;
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("after swapping ");
         System.out.println("x="+x);
         System.out.println("y="+y);
    }
}

