public class clrlastithbit {
    public static void main(String args[])
    {
        System.out.println(clrithbit(10,1));
    } 
    public static int clrithbit(int n,int i)
    {
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
}
