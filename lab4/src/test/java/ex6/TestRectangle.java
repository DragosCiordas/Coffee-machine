package ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRectangle {


    @Test
    void testConstructor() {

        Rectangle r = new Rectangle(1.0,2.0);
        assertEquals(1.0,r.getWidth() );
        assertEquals(2.0,r.getLength());
        assertEquals(2.0,r.getArea());
        assertEquals(6.0,r.getPerimeter());




    }
    @Test
    void testConstructor2() {

        Rectangle r = new Rectangle(2.0,3.0,true,"green");
        assertEquals(true, r.isFilled());
        assertEquals("green", r.getColor());
    }


    @Test
    void testToString(){

        Rectangle r = new Rectangle(2.0,3.0,true,"green");
        assertEquals("A rectangle with length=3.0, width=2.0wich is a subclass ofA Shape with color of green, filled true",r.toString());
    }
}
