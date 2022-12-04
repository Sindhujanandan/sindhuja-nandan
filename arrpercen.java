import java.util.*;
public class arrpercen {
public static void main(String[] args)
{
int input[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("enter two numbers");
input[0]=sc.nextInt();
input[1]=sc.nextInt();
int percentage=(input[0]+input[1])/2;
System.out.println("find percentage");
System.out.println(" so percentge is :" + percentage);
System.out.println("length of array:"+ input.length);
sc.close();
}    
}
