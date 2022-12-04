public class RotatedSorted {
    public static int search(int []arr,int tar,int si,int ei)
    {
        if(si>ei)
        {
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar)
        {
            return mid;

        }
        if(arr[si]<=arr[mid])
        {
            if(arr[si]<=tar&&tar<=arr[mid])
            {
                return search(arr, tar, si, mid-1);
            }
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<=tar&&tar<=arr[ei])
            {
                return search(arr, tar, mid+1,ei);
            }
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,2,9,8,10,5,8,98};
        int target=8;
        int tarIdx=search(arr,target,0,arr.length-1);
        System.out.println("found at index");
        System.out.println(tarIdx);
    }
}
