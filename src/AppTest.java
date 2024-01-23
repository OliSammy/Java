import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AppTest 
{   

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }
    @Test
    public void testSubtract() {
        App app = new App();
        assertEquals(5, app.subtract(10, 5));
    }
    @Test
    public void testMultiply() {
        App app = new App();
        assertEquals(5, app.multiply(1, 5));
    }
    @Test
    public void testDivide() {
        App app = new App();
        assertEquals(5, app.divide(10, 2));
    }
    @Test
    public void testModulo() {
        App app = new App();
        assertEquals(0, app.modulo(10, 5));
    }
    @Test
    public void testPower() {
        App app = new App();
        assertEquals(5, app.power(5, 1));
    }
}

