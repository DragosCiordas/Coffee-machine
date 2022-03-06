package ex4;

import ex2.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBook {
    @Test
    void testConstructor() {

        Author[] a = new Author[3];
        Book b = new Book("Enciclopedy", a, 10);

        a[0] = new Author("John", "johnn@ygmail.com", 'm');
        a[1] = new Author("Rich", "rich@yahoo.com", 'm');
        a[2] = new Author("Nichita", "nichita@yahoo.com", 'm');
        assertEquals(a, b.getAuthors());
        assertEquals('m', a[0].getGender());
        assertEquals(10, b.getPrice());


    }

    @Test
    void testConstructor2() {
        Author[] a = new Author[1];
        a[0] = new Author("John", "johnn@ygmail.com", 'm');
        Book b = new Book("Enciclopedy", a, 10, 3);
        assertEquals("Enciclopedy", b.getName());
        assertEquals(a, b.getAuthors());
        assertEquals(10, b.getPrice());
        assertEquals(3, b.getQtyInStock());
    }

    @Test
    void testToString() {
        Author[] a = new Author[3];
        Book b = new Book("Enciclopedy", a, 10);

        a[0] = new Author("John", "johnn@ygmail.com", 'm');
        a[1] = new Author("Rich", "rich@yahoo.com", 'm');
        a[2] = new Author("Nichita", "nichita@yahoo.com", 'm');
        assertEquals("John (m) at johnn@ygmail.com", b.toString());

    }

    @Test
    void testprintAuthors() {
        Author[] a = new Author[3];
        Book b = new Book("Enciclopedy", a, 10);
        a[0] = new Author("John", "johnn@ygmail.com", 'm');
        a[1] = new Author("Rich", "rich@yahoo.com", 'm');
        a[2] = new Author("Nichita", "nichita@yahoo.com", 'm');
        b.printAuthors();

    }
}
