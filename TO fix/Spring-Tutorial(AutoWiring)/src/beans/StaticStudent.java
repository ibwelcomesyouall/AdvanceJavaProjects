
package beans;

public class StaticStudent {
    
    private static String name;

    public static void setName(String name) {
        StaticStudent.name = name;
    }
    
    public static void hello()
    {
        System.out.println("Student Name is "+ name);
    }
    
}
