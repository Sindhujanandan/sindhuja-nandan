public class Practice2 {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void  printDigits(int digit)
    {
        if(digit==0)
        {
            return;
        }
            int rem=digit%10;
            printDigits(digit/10);
            System.out.print(digits[rem]+" ");
    }
    public static void main(String[] args) {
      printDigits(291025);
      System.out.println();
       
    }
}
