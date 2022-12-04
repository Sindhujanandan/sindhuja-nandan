public class MultiLevelInherit {
    public static void main(String[] args) {
        Dog Dobby=new Dog();
        Dobby.eat();
        Dobby.legs=4;
        System.out.println(Dobby.legs);
    }
}
class Animal{
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
    class Mammals extends Animal
    {
        int legs;
    }
    class Dog extends Mammals
    {
        String  bread;
    }

