public class shortest {
   public static void  main(String []args)
   {
    String path="NSSEES";
    float value=getshortest(path);
    System.out.println(value);
   }
   public static float getshortest(String path)
   {
    int x=0,y=0;
    for(int i=0;i<path.length();i++)
    {
        char dir=path.charAt(i);
        if(dir=='S')
        {
            y--;
        }
        else if(dir=='N'){
            y++;
        }
        else if(dir=='E'){
            x++;
        }
        else{
            x--;
        } 
    }
    float x2=x*x;
    float y2=y*y;
    return (float)Math.sqrt(x2+y2);
   }
   } 

