package secondArray;

public class practise2 {
    public static void main(String[]args)
    {
        int [][]arr={{1,3,4},{6,7,8}};
        int sum=0;
        for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[0].length;j++)
        {
            if(i==1)
            {
            sum+=arr[i][j];
            }
        }
    }
    System.out.println(sum);
    }
}