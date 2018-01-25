
package junit_project.junit3;

import junit_project.Arithmetic1;
import junit.framework.TestCase;
public class Arithmetic1Test extends TestCase{
    
    Arithmetic1 a1=null;
    @Override
    public void setUp() throws Exception{
    super.setUp();
    a1=new Arithmetic1();
}
    @Override
    public void tearDown() throws Exception{
        super.tearDown();
        a1=null;
    }
    public void testSum2()
    {
        int x=a1.sum(10, 20);
        assertEquals(30,x);
        x=a1.sum(100,200);
        assertEquals(300,x);
        x=a1.sum(30,20);
        assertEquals(50,x);                
    }
    
    public void testSum3()
    {
       int x=a1.sum(10,20,30);
        assertEquals(60,x);
        x=a1.sum(100,200,300);
        assertEquals(600,x);
        x=a1.sum(30,20,30);
        assertEquals(80,x);  
    }
    public void testSub()
    {
        int x=a1.sub(100, 20);
        assertEquals(80,x);
        x=a1.sub(1000,200);
        assertEquals(800,x);
        x=a1.sub(80,20);
        assertEquals(60,x);
    }
    
}
