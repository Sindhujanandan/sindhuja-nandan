public class Interfacess {
    public static void main(String[] args) {
       Queen q= new Queen();
       q.moves(); 
       Bear b=new Bear();
       b.eats();
       b.walk();

    } 
}
interface Hervivore
{
   void eats();
}
interface Carnivore
{
void walk();
}
class Bear implements Hervivore,Carnivore
{
 public void eats()
 {
    System.out.println(" Bear eats grass");
 }
 public void walk()
 {
    System.out.println(" bear walks and  also runs  ");
 }
} 
interface ChessPlayer
{
void moves();
}
class Queen implements ChessPlayer
{
   public void moves(){
        System.out.println("up,down,left,right,daigonal");
    }
}
class Rook implements ChessPlayer
{
   public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer
{
   public void moves(){
        System.out.println("up,down,left,right,daigonal(by 1 step)");
    }
}