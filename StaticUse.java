public class StaticUse {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName= "jvm";
         
        Student s2= new Student();
        System.out.println(s2.schoolName);
    }
}
class Student
{
 static int returnpercentage(int math,int physics,int che)
    {
return (math+physics+che)/3;
    }
    String name;
    int roll;
 static String schoolName;

 void setName(String name)
 {
    this.name=name;
 }
 String getName()
 {
    return this.name;
 }
}