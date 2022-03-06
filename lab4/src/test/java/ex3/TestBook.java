package ex3;


import ex2.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBook {
    @Test
    void testconstructor() {
        Author eu=  new Author("Dorian","dorian@gmail.com", 'm');
        Book au = new Book("Hatz", eu, 25);
        assertEquals("Hatz",au.getName());
        assertEquals("Dorian",eu.getName());
        assertEquals(25,au.getPrice());

    }
    @Test
    void testTostring()
    {
        Author eu=  new Author("Dorian","dorian@gmail.com", 'm');
        assertEquals(" Dorian(m) at dorian@gmail.com",eu.toString());
    }
}
