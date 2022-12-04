public class CalculatePower {
    // First type 
    // Time complexity=O(n)
    public static void main(String[] args) {
        System.out.println("through first type");
       System.out.println(power(5,5));
       System.out.println("through second type");
       System.out.println(halfsq(5,5));
    }
    public static int power(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        return x* power(x,n-1);
    }
    // second type
    // Time complexity=O(log(n))
public static  int halfsq(int x,int n)
{
    if(n==0)
    {
        return 1;
    }
    int hp=halfsq(x, n/2);
    int hf=hp*hp;
    if(n%2!=0)
    {
        hf=x*hf;
    }
    return hf;
}
}
