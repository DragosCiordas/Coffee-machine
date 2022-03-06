package ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSquare {

    @Test
    void testConstructor() {
        Square s= new Square(1,"blue",true);
        assertEquals(1,s.getSide());
        assertEquals("blue", s.getColor());
        assertEquals(true, s.isFilled());

    }

    @Test
    void testToString() {
        Square s = new Square(1,"blue",true);
        assertEquals("A square with side= 1.0wich is a subclass of A rectangle with length=1.0, width=1.0wich is a subclass ofA Shape with color of blue, filled true",s.toString());


    }
}
