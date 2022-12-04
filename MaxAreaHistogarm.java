import java.util.Stack;

public class MaxAreaHistogarm {
public static void maxAreainHIStogram(int arr[])
{
    int nsr[]=new int[arr.length];
    int nsl[]= new int[arr.length];
    Stack<Integer> s=new Stack<>();
    for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        s =new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        int maxArea=0;
        //current area:width =j-i-1=nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++)
        {
            int heights=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int Currarea=heights*width;
            maxArea=Math.max(Currarea, maxArea);
        }
       System.out.println("max area in histogram is:"+maxArea);
}
    public static void main(String heights[])
    {
  int arr[]={2,1,5,6,2,3};
  maxAreainHIStogram(arr);
    }
}
