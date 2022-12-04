import java.util.*;
public class Sun_Num {
    public static int  sumOfNum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int sum=n+sumOfNum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter term");
        int n= sc.nextInt();
        System.out.println("sum of numbers");
        System.out.println( sumOfNum(n));
        sc.close();
}
}