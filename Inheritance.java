// it is also called singlr level of inheritance 
public class Inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
}
//base class=parent class
class Animal
{
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
//derived class =child class
class Fish extends Animal{
    int fins;
    void swim()
    {
        System.out.println("swims in water");
    }
}
