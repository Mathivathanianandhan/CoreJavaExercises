import java.util.Scanner;

import java.util.Scanner;
public class Neginteger {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        System.out.println(n);
        for(int i=n;i<=Math.abs(n);i++)
        {
            if(i==0)
            {
                continue;

            }
            else {
                if(n%i==0)
                {
                    System.out.println(i);
                    }
            }
        }
    }
}
