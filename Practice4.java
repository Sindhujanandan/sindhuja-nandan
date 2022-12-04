public class Practice4 {
    // count contiguous substrings
  public static int  countsubstrs(String s,int i,int j,int n)
  {
    if(n==1)
    {
        return 1;
    }
    if(n<=0)
    {
        return 0;
    }
    int res =countsubstrs(s, i+1, j, n-1)+countsubstrs(s, i, j-1, n-1)-countsubstrs(s, i+1, j-1, n-2);
  if(s.charAt(i)==s.charAt(j))
  {
    res++;
  }
  return res;
  }
    public static void main(String[] args) {
        //String s="abcab";
        String s="aba";
        int n=s.length();
        System.out.print(countsubstrs(s,0,n-1,n));
    }
}
