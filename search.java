package secondArray;
public class search {
    public static void main(String []args)
    {
        int matrix[][]={{1,2,3,4},{2,4,5,6},{6,7,89,90}};
        int key=14;
        searchnum(matrix,key);
    }
    public static void searchnum(int matrix[][],int key)
    { 
        int notfound=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("number is at index:"+ i+","+j);
                    notfound++;
                }
            }
        }
        if(notfound==0)
        System.out.println("number is not found ");
    }
}
