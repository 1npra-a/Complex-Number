import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for the ComplexNumber class
 */
public class ComplexNumberTester {

    /**
     * Testing the add() method
     */
    @Test
    public void testAdd() {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(1, 4);
        ComplexNumber result = c1.add(c2);
        assertEquals(new ComplexNumber(3,7), result);
    }

    /**
     * Testing the subtract() method
     */
     @Test
     public void testSubtract() {
        ComplexNumber c1 = new ComplexNumber(5, 6);
        ComplexNumber c2 = new ComplexNumber(2, 3);
        ComplexNumber result = c1.subtract(c2);
        assertEquals(new ComplexNumber(3, 3), result);
    }

    /**
     * Testing the multiply() method
     */
    @Test 
    public void testMultiply() {
        ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(3, 4);
        ComplexNumber result = c1.multiply(c2);
        assertEquals(new ComplexNumber(-5, 10), result);
    }

    /**
     * Testing the divide() method
     */
    @Test
    public void testDivide() {
        ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(3, 4);
        ComplexNumber result = c1.divide(c2);
        assertEquals(new ComplexNumber(0.44f, 0.08f), result);
    }

    /**
     * Testing the equals() method
     */
    @Test
    public void testEquals() {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(2, 3);
        assertTrue(c1.equals(c2));
    }

    /**
     * Testing toString() for both positive and negative imiginary part
     */
    @Test
    public void testToString() {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        assertEquals("3.0 + 4.0i", c1.toString());

        ComplexNumber c2 = new ComplexNumber(3, -4);
        assertEquals("3.0 - 4.0i", c2.toString());
    }
}
