public class clearithbit {
    public static void main(String args[]){
        System.out.println(clearithBit(10,1));
    }
    public static int clearithBit(int n,int i){
     int bitmask=~(1<<i);
    return n&bitmask;
    }
}
