public class Arrays {
    public static void main(String args[])
    {
        String[] course={"BCA","MCA","MBA"};
        course[0]="DCA";
        System.out.println(course[0]);
        for(int i=0;i<course.length;i++)
        {
            System.out.println(course[i]);
        }
    }
}
