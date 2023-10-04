import java.util.Scanner;
import java.lang.String;
public class Palindstr {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        String str1="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }
if((str.toLowerCase()).equals(str1.toLowerCase()))
{
    System.out.println("The given string is palindrome");
}
else {
    System.out.println("The given string is not palindrome");
}
{

}
    }
}
