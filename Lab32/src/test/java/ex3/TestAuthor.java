package ex3;

import ex2.Circle;
import org.junit.jupiter.api.Test;

public class TestAuthor {
    @Test
    void testconstructor() {
        Author a = new Author("Dragos","dragos@gmail.com", 'm');
        if ("Dragos" == a.getName())
            System.out.println("OK nume");
        if ("dragos@gmail.com" == a.getEmail())
            System.out.println("OK email");
        if ('m' == a.getGender())
            System.out.println("OK gen");
    }

    @Test
    void testString() {
        Author a = new Author("Dragos","dragos@gmail.com", 'm');
            System.out.println(a.toString());

    }
}
