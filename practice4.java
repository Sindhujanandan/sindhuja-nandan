import java.util.Arrays;
public class practice4 {
    public static void main(String[]args)
    {
        String str1="care";
        String str2="race";
       //convert strings to lowercase,why?
//so that we don't have to check separatly for a lower&uppercase
str1=str1.toLowerCase();
str2=str2.toLowerCase();
// first check-if the lengths are the same
if(str1.length()==str2.length())
{
    //converts stirngs into char array 
    char[] str1chararray=str1.toCharArray();
    char[] str2chararray=str2.toCharArray();
    // sort the char array
    Arrays.sort(str1chararray);
    Arrays.sort(str2chararray);
    // if the sorted char arrays are same 
    ///or indetical then the  Strings are anagram
    boolean result=Arrays.equals(str1chararray, str2chararray);
if(result){
    System.out.println(str1 +"and"+str2+"are anagrams of each other ");
}
else{
    System.out.println(str1 +"and"+str2+"are not anagrams of each other ");
}
}
//case when lengths are not equal 
else{
System.out.println(str1 +"and"+str2+"are not anagrams of each other ");
}
    }
    
}
