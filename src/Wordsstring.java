import java.util.Scanner;
public class Wordsstring {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String txt;
        int count=0;
        System.out.println("Enter the string");
        txt=in.nextLine();
        for(int i=0;i<txt.length()-1;i++)
        {
            if(txt.charAt(i)==' ' && txt.charAt(i+1)!=' ')
            {
                count++;
            }
            System.out.println("Total String is"+(count+1));
        }


    }

}
