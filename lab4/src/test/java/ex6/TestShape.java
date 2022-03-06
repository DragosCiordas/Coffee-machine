package ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestShape {

    @Test
    void testSecondConstructor() {
        Shape shape = new Shape("red", true);
        assertEquals("red", shape.getColor());
        assertEquals(true, shape.isFilled());

    }
    @Test
    void testToString() {
        Shape shape = new Shape("red", true);
        assertEquals("A Shape with color of red, filled true", shape.toString());


    }
}
