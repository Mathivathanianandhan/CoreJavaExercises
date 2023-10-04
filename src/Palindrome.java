import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int rem, rev = 0, tem = n;
        while (n != 0) {

            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        };
            if (tem == rev) {
                System.out.println("The number is Palindrome");
            } else {
                System.out.println("The number is not Palindrome");
            }

    }

}
