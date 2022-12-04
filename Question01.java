import java.util.*;
public class Question01 {
static class Heap{
    ArrayList<Integer> arr= new ArrayList<>();
    public void add(int data)
    {
        // add at last index
        arr.add(data);
        int x=arr.size()-1;// x is child index
        int par=(x-1)/2;// parent inx
        //while(arr.get(x)<arr.get(par)) for minindex
        while(arr.get(x)>arr.get(par)) // for maxidx
        {
            // swap
            int temp=arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par,temp );
            x=par;
            par=(x-1)/2;
        }
    }
    public int peek()
{
    return arr.get(0);
}
private void heapify(int i)
{
    int left=2*i+1;
    int right=2*i+2;
  //  int minIdx=i;
  int maxIdx=i;

   // if(left<arr.size()&& arr.get(minIdx)>arr.get(left)) minidx
    if(left<arr.size()&& arr.get(maxIdx)<arr.get(left)) // for maxidx
    {
        maxIdx=left;
    }
   // if(right<arr.size()&& arr.get(minIdx)>arr.get(right)) for minidx
    if(right<arr.size()&& arr.get(maxIdx)<arr.get(right)) // for maxidx
    
    {
        maxIdx=right;
    }
    if(maxIdx!=i)
    {
        // swap
        int temp=arr.get(i);
        arr.set(i, arr.get(maxIdx));
        arr.set(maxIdx, temp);

        heapify(maxIdx);
    }
}
public int remove()
{
    int data=arr.get(0);
    // step1-swap first &last
    int temp=arr.get(0);
    arr.set(0, arr.get(arr.size()-1));
    arr.set(arr.size()-1,temp);
    // step2-delete last
    arr.remove(arr.size()-1);
    // step3-heapify
    heapify(0);
    return data;
}
public boolean isEmpty()
{
    return arr.size()==0;
}
}
   public static void main(String[] args) {
     Heap h=new Heap();
     h.add(3);
     h.add(4);
     h.add(1);
     h.add(5);
     while(!h.isEmpty())
     {
        System.out.println(h.peek());// heap sort O(nlogn``)
        h.remove();
     }
   } 
}
