package ex2;

import org.junit.jupiter.api.Test;

 import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAuthor {
    @Test
    void testconstructor() {
        Author a = new Author("Dragos","dragos@gmail.com", 'm');
       assertEquals("Dragos",a.getName());
        assertEquals('m',a.getGender());
        assertEquals("dragos@gmail.com",a.getEmail());

    }



    @Test
    void testString() {
        Author a = new Author("Dragos","dragos@gmail.com", 'm');
        System.out.println(a.toString());

    }

}
