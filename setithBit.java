public class setithBit {
    public static void main(String args[]){
        System.out.println(setithbit(10,2));
    }
    public static int setithbit(int n,int i){
   int bitmask=1<<i;
    return n|bitmask;
    }
}
