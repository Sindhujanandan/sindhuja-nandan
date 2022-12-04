package secondArray;
public class practise3 {
    public static void main(String []args)
    { int row=2,coloumn=3;
        int [][]arr={{1,3,4},{6,7,8}};
        trans(arr);
        int transpose[][]=new int[coloumn][row];
        for(int i=0;i<row;i++)
    {
        for(int j=0;j<coloumn;j++)
        {
            transpose[j][i]=arr[i][j];
        }
    }
    trans(transpose);
}
    public static void trans(int[][]arr) {
        
    System.out.println("matrix after transpose");
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[0].length;j++)
        {
            System.out.print(arr[i][j]
            +" ");
        }
        System.out.println();
    }
    }
    }

