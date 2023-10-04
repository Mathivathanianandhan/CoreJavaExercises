import java.lang.String;
public class Extractwords {
    public static void main(String args[])
    {
        String a="Hi i am mathivathani anandhan";
        String[] a1=a.split(" ",5);
       for(String w:a1)
        {
            System.out.println(w);
        }
    }


}
