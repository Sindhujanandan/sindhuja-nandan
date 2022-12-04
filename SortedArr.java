public class SortedArr {
    public static void main(String[] args) {
        int [] arr= {4,6,7,8,9};
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int[] arr,int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return isSorted(arr, i+1);
    }
}
