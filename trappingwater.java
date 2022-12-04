public class trappingwater {
    public static int trappedwater(int height[])
    {
    int n=height.length;
    //calculate left max boundary
    int leftMax[]=new int[n];
    leftMax[0]=height[0];
    for(int i=1;i<n;i++)
    {
     leftMax[i]=Math.max(height[i], leftMax[i-1]);
    }
    //calculate right max boundary
    int rightMax[]=new int[n];
    rightMax[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--)
    {
        rightMax[i]=Math.max(height[i],rightMax[i+1]);
    }
    int trappedrainwater=0;
    for(int i=0;i<n;i++)
    {
        int waterlevel=Math.min(leftMax[i], rightMax[i]);
        trappedrainwater+=waterlevel-height[i];
    }
    return trappedrainwater;
    }
    public static int tw(int h[])
    {
        int n=h.length;
//find leftmax
int left[]=new int[n];
left[0]=h[0];
for(int i=1;i<n;i++)
{
    left[i]=Math.max(h[i],left[i-1]);
}
//find rightmax
int right[]=new int[n];
right[n-1]=h[n-1];
for(int i=n-2;i>=0;i--)
{
    right[i]=Math.max(h[i],right[i+1]);
}
int trw=0;
for(int i=0;i<n;i++)
{
    //find waterlevel
    int wl=Math.min(left[i],right[i]);
    //find trapping rain water
    trw+=wl-h[i];
}
return trw;
    }
    public static void main(String[] args)
    {
       // int h[]={4,2,0,6,3,2,5};
        //int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
       // int height[]={4,2,0,3,2,5};
        int h[]={5,4,3,6,3,5,7};
       // int a=trappedwater(height);
       int a=tw(h);
        System.out.println(a);
    }
}
