package array;
public class bubblesort {
    public static void main(String args[])
    {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        buubblesort(arr);
        printarr(arr);
    }
    public static void buubblesort(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
                }
            }
        }
    }
    public static void printarr(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
