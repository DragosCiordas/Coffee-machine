package ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCircle {



    @Test
    void testConstructor() {
        Circle circle = new Circle(1.0);
        assertEquals(Math.PI, circle.getArea());
        assertEquals(1.0, circle.getRadius());


    }

    @Test
    void testConstructor2() {
        Circle circle = new Circle("red",1,true);
        assertEquals("red", circle.getColor());
        assertEquals(1.0, circle.getRadius());
        assertEquals(true, circle.isFilled() );


    }
    @Test
    void testToString(){
        Circle circle = new Circle("red",1,true);
        assertEquals("A Circle with radius= 1.0 which is a subclass of  A Shape with color ofred' and filled", circle.toString());

    }

}
