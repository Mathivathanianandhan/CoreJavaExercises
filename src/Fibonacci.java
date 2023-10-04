import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int[] a=new int[n];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<n;i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
        System.out.println("Fibonacci series");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }

}
