
package beans;

public class DependencyIngestion {
    
    private String gender;
    
    public void sayHello(String name)
    {
        System.out.println("Hello"+" "+gender+" "+name);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
