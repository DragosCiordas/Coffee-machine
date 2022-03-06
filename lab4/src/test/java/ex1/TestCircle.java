package ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCircle {
    @Test
    void testconstructor() {
        Circle a = new Circle(1);
        if (1 == a.getRadius())
            System.out.println("OK"); // am o mica problema cu pachetele pentru assertEquals

    }

    @Test
    void testconstructor2() {
        Circle a = new Circle("red", 1);
        if (1 == a.getRadius())
            System.out.println("OK1");
        assertEquals("red",a.getColor());
            System.out.println("OK2");

    }
    @Test
    void tesArea() {
        Circle a = new Circle(1);
        if (Math.PI == a.getArea())
            System.out.println("OK, raza e "+a.getArea());

    }

}

