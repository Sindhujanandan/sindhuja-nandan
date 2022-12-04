public class array {
public static void update(int marks[] ,int nonchange)
{
    nonchange=12;
for(int i=0;i<marks.length;i++)
{
    marks[i]=marks[i]+1;
}
}
    public static void main(String[]args)
    {
        int marks[]={98,99,87};
        int nonchange=12;
        System.out.println(nonchange);
        update(marks,nonchange);
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");            
        }
        System.out.println();
    }

}
