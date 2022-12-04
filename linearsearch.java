public class linearsearch {
    public static int linearsearchh(String numbers[],String keys)
{
    for(int i=0;i<numbers.length;i++)
    {
        if(numbers[i]==keys)
        {
            return i;
        }
    }
    return -1;
}    
public static void main(String[] args)
{
    //int numbers[]={2,4,6,8,10,12,14,16};
    String name[]={"aman","shradha","tanishq"};
    String keys="shradha";
    int index =linearsearchh(name, keys);
if(index== -1)
{
    System.out.println("not found");
}
else
{
    System.out.println("shradha is at "+ index );
}
}
}
