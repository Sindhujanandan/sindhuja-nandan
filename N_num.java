//import java.util.*;
public class N_num {
// for decreasing order 10 numbers prints thrpugh recursion
    public static void recurnum(int n)
    {
        if(n==1)
        {
            System.out.print(n);
            return;
        }
        System.out.print(n+ " ");
        recurnum(n-1);
    }
    // for Increasing order 10 numbers prints thrpugh recursion
    public static void increaseNum(int n)
    {
        if(n==1)
        {
            System.out.print(n +" ");
            return;
        }
        increaseNum(n-1);
        System.out.print(n+ " ");
        
        
        
    }

public static void main(String[] args) {
   //Scanner sc=new Scanner(System.in);
  // int n= sc.nextInt();
   //recurnum( n);
  // sc.close();
  int  n=10; 
increaseNum( n);
}
}