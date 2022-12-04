//import java.util.*;
// time comflexity is O(n)
// Space comflexity is  also O(n)
public class Factorial {
    public static int factorialNum(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fn=n*factorialNum(n-1);
        return fn;
    }
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
       // int n= sc.nextInt();
       // sc.close();
       int  n=5; 
       System.out.println(factorialNum(n));
     }
}
