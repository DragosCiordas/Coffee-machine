package ex5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCylinder {
    @Test
    void testConstructor() {
        Cylinder c = new Cylinder(2.0);
        assertEquals(2.0, c.getRadius());

    }

    @Test
    void testConstructor2() {
        Cylinder c = new Cylinder(1.0, 1.0);
        assertEquals(1.0, c.getRadius());
        assertEquals(1.0, c.getHeight());

    }

    @Test
    void testMethods() {

        Cylinder c = new Cylinder(1.0, 1.0);
        assertEquals(Math.PI, c.getVolume());
        assertEquals(4*Math.PI, c.getArea());

    }
}