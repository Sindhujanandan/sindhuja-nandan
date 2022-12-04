//import java.util.*;
public class sellandbuystock {
    public static int maxprofit(int prices[])
    {
int buyprices=Integer.MAX_VALUE;
int maxprofit=0;
for(int i=0;i<prices.length;i++)
{
    if(buyprices<prices[i])
    {
        int p=prices[i]-buyprices;
        maxprofit=Math.max(maxprofit, p);
    }
    else{
        buyprices=prices[i];
    }
}
return maxprofit;
    }
    public static int sellbuy(int prices[])
    {
int buy=prices[0];
int pro=0;
for(int i=1;i<prices.length;i++)
{
    if(buy<prices[i])
    {
        pro+=prices[i]-buy;
    }
    else{
        buy=prices[i];
    }
}
return pro;
    }
    public static void main (String aregs[])
    {
//int prices []={7,1,5,3,6,4};
//int prices[]={7,6,4,3,1};
int prices[]={5,4,7,6,8};
System.out.println(sellbuy(prices));
    }
}