public class binarysearch {
    public static void main(String[] args)
    {
        int numbers[]={1,5,9,6,4,9,10};
        int key=10;
    System.out.println("number is at index"+ usebinary( numbers,key));
    }
    public static int usebinary( int numbers[],int key)
    {
        int start=0;
        int end=numbers.length;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(numbers[mid]==key)
            {
                return mid;
            }
           else if(numbers[mid]<key)
        {
        start=mid+1;
        }   
        else{
        end=mid-1;
    }
    }
    return -1;
    }
}
