package array.sorting;
public class counting {
    public  static void main(String args[]) {
        int nums[]={1,4,5,6,7,8,9,10};
        countingsort(nums);
        printarr(nums);
    }
    public static void countingsort(int[]nums)
    {
        int large=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
              large=Math.max(large, nums[i]);
        }
        int count[]=new int[large+1];
        for(int i=0;i>=count.length-1;i--)
        {
           count[nums[i]]++;
        }
        //counting sort
        int j=0;
        for(int i=count.length-1;i>=0;i--)
    {
while(count[i]>0)
{
    nums[j]=i;
    j++;
    count[i]--;
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
