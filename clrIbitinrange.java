public class clrIbitinrange {
    public static void main(String args[])
    {
        System.out.println(clribitrange(10,2,4));
    } 
    public static int clribitrange(int n,int i,int j)
    {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
}
