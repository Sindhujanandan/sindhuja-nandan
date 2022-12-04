package array;
public class selectionsort {
    public static void sortarr(int arr[] )
    {
        for(int turn=0;turn<arr.length-1;turn++)
        {
            int minpos=turn;
for(int j=turn+1;j<arr.length;j++)
{
    if(arr[minpos]>arr[j])
    {
        minpos=j;
    }
}
           //swapping
            int temp=arr[minpos];
            arr[minpos]=arr[turn];
            arr[turn]=temp;   
      
            }
        }
    
        public static void printarr(int arr[]){
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
    }
    public static void main(String args[])
    {
        //int arr[]={4,5,6,1,2};
        int arr[]={1,2,6,3,4,5,6};
        sortarr(arr);
        printarr(arr);
    }
}
