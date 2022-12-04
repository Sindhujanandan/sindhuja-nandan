public class odd {
    public static void main(String []args)
    {
        int num1=50;
           /*  int rem=num1%10;
           if(rem==0)
           {
            System.out.println("even");
           }
           else{
            System.out.println("odd");
           }*/
           oddNeven(num1);
        }
        public static void oddNeven(int num1)
{
        int bitmask=1;
        if((num1 & bitmask)==0)
        {
System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
}
    }
