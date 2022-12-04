public class Hybrid {
    public static void main(String[] args) {
   Tuna Yellofin= new Tuna();
   Yellofin.fins();
   Yellofin.eat();
   Yellofin.color="yellow";
   System.out.println(Yellofin.color);
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
        class Fish extends Animal
        {
     int fins;
        }
        class Tuna extends Fish
        {
         int price;
         void fins()
         {
            System.out.println("Tuna has 2 closely spaced dorsal fins");
         }
        }
        
