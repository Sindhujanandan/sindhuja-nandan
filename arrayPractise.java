public class arrayPractise {
    public static  boolean appearence(int nums[])
    {
      for(int i=0;i<nums.length-1;i++)
      {
        for(int j=i+1;j<nums.length;j++)
        {  
        if(nums[i]==nums[j])
        {
            return true;
        }
       /*else{
            return false;
        }*/
        }
      }
      return false;
    }
    public static void main(String args[]) {
       int nums[]={1,2,3,1};
        //System.out.println(appearence(nums));
        //int nums[]={1,2,3,4};
        //System.out.println(appearence(nums));
        //int nums[]={1,1,1,3,3,4,3,2,4,2};
        System.out.println(appearence(nums));
    }
}
