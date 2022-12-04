public class QuickSort {
    public static void main(String[] args) {
        int []arr={7,3,5,6,7,8};
        int si=0;
        int ei=arr.length-1;
        quickSort(arr,si,ei);
        System.out.println("sorted array");
        printArr(arr);
    }
    public static void printArr(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int arr[],int si,int ei)
 {
    if(si>=ei)
    {
        return;
    }
   int pIdx=partition(arr,si,ei);// tc=n
   quickSort(arr, si, pIdx-1);
   quickSort(arr, pIdx+1, ei);
 }
 public static int partition(int arr[],int si,int ei)
 {
    int pivot=arr[ei];
    int i=si-1;
    for(int j=si;j<ei;j++)
    {
        if(arr[j]<=pivot)
        {
            i++;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    }
    i++;
    int temp=pivot;
    arr[ei]=arr[i];
    arr[i]=temp;
    return i;
    
    }
}

