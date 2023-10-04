import java.util.Scanner;
public class Armstrong {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int i=0,t=n,p=0,rem;
        while(n>0)
        {
             rem=n%10;
             p=p+(rem*rem*rem);
             n=n/10;
        }
        if(t==p)
        {
            System.out.println(p+"The number is Armstrong");
        }
        else
        {
            System.out.println(p+"The number is not Armstrong");
        }

    }
}
