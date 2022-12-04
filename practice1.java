package secondArray;
public class practice1 {
    public static void main(String[]args)
    {
        int[][] arr={{4,7,8},{8,8,7}} ;
        int count=counting(arr);
        System.out.println(count);
    }
    public static int counting(int[][]arr)
    {
    int count=0;
        for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[0].length;j++)
        {
            if(arr[i][j]==7)
            {
               count++;
            }
    }
}
    return count;
    }
}

