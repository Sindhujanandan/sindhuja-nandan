public class pairs {
    public static void main(String args[])
    {
        int numbers[]={3,6,9,12,15};
        pairsofNum(numbers);
    }
    public static void pairsofNum(int numbers[])
    {
        for(int i=0;i<numbers.length;i++)
        {
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++)
            {
                System.out.print("("+curr+ ","+numbers[j]+")");
            }
        System.out.println();
        }

    }
}
