//import java.util.*;
public class practice1 {
    int real;
    int imag;
    public practice1(int r,int i){
        real=r;
        imag=i;}
        public static practice1 add( practice1 a,practice1 b){
            return new practice1 ((a.real+b.real),(a.imag+b.imag));
        }
        public static practice1 diff( practice1 a, practice1 b)
        {
            return new practice1 ((a.real-b.real),(a.imag-b.imag));
        }
        public static  practice1 product(practice1 a, practice1 b){
return new practice1(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
}
public void printComplex(){
    if(real==0&&imag!=0){
        System.out.println(imag+"i");
    }
    else if(imag==0&&real!=0){
        System.out.println(real);
    }
    else{
        System.out.println(real+"+"+imag+"i");
    }
}
}
class Solution
{
    public static void main(String[]args) 
    { 
        practice1  c=new practice1 (4,5);
        practice1  d=new practice1(9,4);
        practice1  e=practice1.add(c,d);
        practice1 f=practice1.diff(c,d);
        practice1 g=practice1.product(c,d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
