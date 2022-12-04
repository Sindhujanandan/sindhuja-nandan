public class BinaryString {
    public static void main(String[] args) {
        printbinaryString(3,0,"");
    }
    public static void printbinaryString(int n,int lastplace,String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
    printbinaryString(n-1, 0, str+"0");
    if(lastplace==0)
    {
        printbinaryString(n-1, 1, str+"1");
    }
    }
}
