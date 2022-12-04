public class checkpowernum {
    public static void main(String args[])
    {
        System.out.println(powernum(16));
    }
    public static boolean powernum(int n )
    {
        return (n&(n-1))==0;
        
    }     
}
