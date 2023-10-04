import java.util.Scanner;
public class Factinteger {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        System.out.println(n);
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println("These numbers are positive factors"+i);
            }
        }
    }

}
