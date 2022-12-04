public class Practice1 {
    public static void alloccur(int []arr,int key,int i)
    {
        if(i==arr.length)
        {
           return ;
        }
       if(key==arr[i])
        {
        System.out.print(i+" ");
        }
        alloccur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        alloccur(arr,key,0);
            System.out.println(); 
        }
    }

