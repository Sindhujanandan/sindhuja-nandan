public class ConstructChaining {
    public static void main(String[] args) {
        new Temp();
    }
}
class Temp
{
    Temp()
    {
        this(5);
        System.out.println("the default constructor");
    }
    Temp(int x)
    {
        this(5,15);
        System.out.println(x);
        
    }
    Temp(int x,int y)
    {
       
        System.out.println(x*y);
    }
}
