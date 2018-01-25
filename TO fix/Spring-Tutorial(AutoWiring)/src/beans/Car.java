package beans;

public class Car {
    
    private Engine engine;
    public void printData()
    {
        System.out.println("EngineModelYear: "+engine.getModelyear());
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    
}
