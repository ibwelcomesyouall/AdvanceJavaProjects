
package junit_project.junit3;

import junit_project.Arithmetic2;
import junit.framework.TestCase;
public class Arithmetic2Test extends TestCase{
    
    Arithmetic2 a2=null;
    @Override
    public void setUp() throws Exception{
    super.setUp();
    a2=new Arithmetic2();
}
    @Override
    public void tearDown() throws Exception{
        super.tearDown();
        a2=null;
    }
    public void testMul2()
    {
        int x=a2.mul(10, 20);
        assertEquals(200,x);
    }
    public void testMul3(){
        int x=a2.mul(10,20,2);
        assertEquals(400,x);               
    }
    
    public void testDiv()
    {
       int x=a2.div(100,20);
        assertEquals(5,x);  
    }    
}
