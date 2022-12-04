import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter term");
        int n= sc.nextInt();
        System.out.println(fibonacciSeries(n));
        sc.close();
    }
    public static int fibonacciSeries(int n)
    {
    if(n==0||n==1)
    {
        return n;
    }
    int fn1=fibonacciSeries(n-1);
    int fn2=fibonacciSeries(n-2);
       int fn=fn1+fn2; 
       
       return fn;
    }
}
