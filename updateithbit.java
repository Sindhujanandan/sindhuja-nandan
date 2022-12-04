public class updateithbit {
    public static void main(String args[]){
        System.out.println(Updateithbit(10,2,0));
 
    }
    public static int setithbit(int n,int i){
        int bitmask=1<<i;
         return n|bitmask;
         }
         public static int clearithbit(int n,int i){
            int bitmask=~(1<<i);
           return n&bitmask;
           }
    public static int Updateithbit(int n,int i,int bitmask){
        if(bitmask==0)
        {
            return clearithbit(10,2);
        }
        else {
            return setithbit(10,2); 
        }
    }
}
