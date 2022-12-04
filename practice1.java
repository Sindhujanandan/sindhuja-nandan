import java.util.Scanner;
public class practice1 {
    public static void main(String []args)
    {
Scanner sc=new Scanner(System.in);
String str= sc.nextLine();
   int a=vowelscount(str);
   System.out.println(a);
   sc.close();
    }
    public static int vowelscount(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++){
            char st=str.charAt(i);
        if(st=='a'||st=='e'||st=='i'||st=='o'||st=='u')
        {
        count++;
        }
        }
      return count;
    }
}
