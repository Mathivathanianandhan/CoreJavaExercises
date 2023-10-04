public class Triangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        for (int i=rows;i>=1;--i)
         {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=rows;i>=1;--i)
        {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                  System.out.print("*");
            }
            System.out.println();
        }
        int k=0;
        for(int i=1;i<=rows;i++,k=0)
        {
            for(int s=1;s<rows-i;s++) {
                System.out.print("  ");
            }
            while(k!=2*i-1)
            {
                System.out.print("* ");
                k++;
            }
System.out.println();
        }
        int count=0,count1=0;
        for(int i=1;i<=rows;i++,k=0)
        {
            for(int s=1;s<rows-i;s++) {
                System.out.print("  ");
            }
            while(k!=2*i-1)
            {
                if (count<=rows-1 )
                {
                    System.out.print((i+k)+" ");
                    count++;
                }
                else
                {
                    count1++;
                    System.out.print((i+k-2*count1)+" ");
                }

                k++;
            }
            count1=count=k=0;
            System.out.println();
        }

        for(int i=rows;i>=1;i--,k=0)
        {
            for(int s=1;s<rows-i;s++) {
                System.out.print("  ");
            }
            while(k!=2*i-1)
            {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
        char last='E',start='A';
        for(int i=1;i<=last-'A'+1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(start+" ");
            }
            start++;
System.out.println();
        }
    }
}
