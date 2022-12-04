public class Tiling {
    public static void main(String[] args) {
        System.out.println(tilingProb(3));
    }
public static int  tilingProb(int n)
{
    if(n==0||n==1)
    {
        return 1;
    }
 int verTil=tilingProb(n-1);
 int horTil=tilingProb(n-2);
 int totways=verTil+horTil;
 return totways;
}
}
