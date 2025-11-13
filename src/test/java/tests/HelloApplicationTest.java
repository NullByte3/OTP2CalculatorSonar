package tests;

import club.nullbyte3.otp22.HelloApplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class HelloApplicationTest {

    @Test
    public void testDivideValues() {
        assertEquals(2.0, HelloApplication.divideValues(6.0, 3.0), 0.0001);
        assertEquals(-2.5, HelloApplication.divideValues(-5.0, 2.0), 0.0001);
    }

    @Test
    public void testMultiplyValues() {
        assertEquals(6.0, HelloApplication.multiplyValues(2.0, 3.0), 0.0001);
        assertEquals(-10.0, HelloApplication.multiplyValues(-2.0, 5.0), 0.0001);
        assertEquals(0.0, HelloApplication.multiplyValues(0.0, 100.0), 0.0001);
    }

    @Test
    public void testSubtractValues() {
        assertEquals(2.0, HelloApplication.subtractValues(5.0, 3.0), 0.0001);
        assertEquals(-8.0, HelloApplication.subtractValues(-5.0, 3.0), 0.0001);
    }

    @Test
    public void testAddValues() {
        assertEquals(5, HelloApplication.addValues(2, 3));
        assertEquals(-1, HelloApplication.addValues(2, -3));
        assertEquals(0, HelloApplication.addValues(0, 0));
    }
}
