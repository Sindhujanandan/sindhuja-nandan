public class Hierarchical {
    public static void main(String[] args) {
        Dog Dobby=new Dog();
        Dobby.eat();
    }
}
class animal{
    String color;
    void eat()
    {
System.out.println("eats");
    }
    void breathe()
    {
        System.out.println("breathe");
}
    }
    class Mammals extends animal
    {
        int legs;
        void walk()
        {
            System.out.println(" waklks");
        }
    }
    class Dog extends animal
    {
        int bread;
        void swim()
        {
            System.out.println(" swims");
        }
    }
