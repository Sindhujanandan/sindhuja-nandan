public class Oopsconcept {
    public static void main(String args[])
{
    Pen p1= new Pen();
    p1.setcolor("Blue");
    System.out.println(p1.color);
    p1.settip(5);
    System.out.println(p1.tip);
    Student s1= new Student();
    s1.newname("sindhuja nandan");
    System.out.println(s1.name);
    s1.newage(18);
    System.out.println(s1.age);
    s1.newMarks(78.0f);
    System.out.println(s1.marks);
}
}
class Student 
{
    String name;
    int age;
    float marks;
    void newname(String Name)
    {
        name=Name;
    }
    void newage(int Age)
    {
        age=Age;
    }
    void newMarks(Float Marks)
    {
        marks=Marks;
    }
}
class Pen{
    String color;
    int tip;
    public void setcolor(String newcolor) {
        color = newcolor;
    }
    public  void settip(int newtip)
    {
        tip = newtip;
    }
}

