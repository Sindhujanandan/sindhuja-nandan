public class Ouccur {
    // when number first time in an array
    public static int firstOuccur (int []arr,int key,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
      if(arr[i]==key)
      {
        return i;
      }
      return firstOuccur(arr,key,i+1);
    }
    /*public static void main(String[] args) {
        int []arr={1,0,5,7,8,8,9,9,8};
        System.out.println(firstOuccur(arr,8,0));
    }*/
    // when number first time in an array
    public static void main(String[] args) {
        int []arr={1,0,5,7,8,8,9,9,8};
        System.out.println(lastOuccur(arr,8,0));
    }
    public static int lastOuccur (int []arr,int key,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        int isFound=lastOuccur (arr,key,i+1);

      if(isFound==-1&&arr[i]==key)
      {
        return i;
      }
      return isFound;
    }
}
