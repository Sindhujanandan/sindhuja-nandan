public class Polymorphispm {
    public static void main(String[] args) {
        Calculator calcv=new Calculator();
        System.out.println(calcv.sum((float)1.6,(float) 8.2));
        System.out.println(calcv.sum(2, 9));
        System.out.println(calcv.sum(2, 9,7));
        Deer d= new Deer();
         d.eat();
        
    }
}
class Calculator
{
    int sum(int a, int b)
    {
        return a+b;
    }
    int sum(int a, int b,int c)
    {
        return a+b+c;
    }
    float sum(float a, float b)
    {
        return a + b;
    }
}
//runtime polymorphism
class Animal
{
    void eat()
    {
        System.out.println("eats anything ");
    }
}
class Deer extends Animal
{
    void eat()
    {
        System.out.println("eats grass");
    }
}