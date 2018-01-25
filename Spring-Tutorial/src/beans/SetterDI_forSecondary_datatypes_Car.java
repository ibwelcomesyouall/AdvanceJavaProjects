package beans;

public class SetterDI_forSecondary_datatypes_Car {
    
    private String carname;
    private SetterDI_forSecondary_datatypes_Engine engine;

    public void setCarname(String Carname) {
        this.carname = Carname;
    }

    public void setEngine(SetterDI_forSecondary_datatypes_Engine engine) {
        this.engine = engine;
    }
    
    public void printcarDetails()
    {
        System.out.println("Car Name is: "+carname);
        System.out.println("Car model year is: "+engine.getModelyear());
    }
    
}
