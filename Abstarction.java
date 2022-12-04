public class Abstarction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Mustang Myhorse=new Mustang();
        //animal-> Horse->Mustang
     Myhorse.eat();
    }
}
abstract class Animal{
    String color;
    Animal()
    {
        color="brown";
 System.out.println("animal constructor called ");
    }
    void eat()
    {
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal
{
    Horse()
    {
        System.out.println("horse constrctor called ");
    }
    void changecolor()
    {
        color="dark brown";
    }
    void walk()
    {
        System.out.println( "works on  four legs ");
    }
}
class Chicken extends Animal{
    void changecolor()
    {
        color="white";
    }
    void walk()
    {
        System.out.println("works on  two leg");
    }
}
class Mustang extends Horse
{
Mustang()
{
    System.out.println("Mustang constructor called ");
}
}