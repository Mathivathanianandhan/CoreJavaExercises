public class Stringmethods {
    public static void main(String args[])
    {
        String a="Mathi";
        char b=a.charAt(1);
        System.out.println(b);
        int c=a.codePointAt(1);
        System.out.println(c);
        int d=a.codePointBefore(4);
        System.out.println(d);
        String x="mathi";
        System.out.println(a.compareTo(x));
        System.out.println(a.compareToIgnoreCase(x));
        System.out.println(a.contains("at"));
        System.out.println(a.contains("ai"));
        char[] a1={'h','e','l','l','o'};
        String a2="";
        a2=a2.copyValueOf(a1,0,5);
        System.out.println(a2);
        System.out.println(a.equals(x));
        //replace
        System.out.println(x.replace('t','d'));
        //trim
        String a3="     Hi Hello";
        System.out.println(a3);
        System.out.println(a3.trim());


    }

}
