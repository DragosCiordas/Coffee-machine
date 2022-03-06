package ex4;

import ex3.Author;
import org.junit.jupiter.api.Test;

public class TestMyPoint {
    @Test
    void testConstructor() {
        MyPoint a = new MyPoint(1,1);
    }

    @Test
    void testTostring() {
        MyPoint a = new MyPoint(1,1);
        System.out.println(a.toString());
    }
    @Test
    void testDistance() {
        MyPoint a = new MyPoint(1,1);
        System.out.println(a.distance(0,0)); //rad 2
    }
    @Test
    void testDistancefin() {
        MyPoint a = new MyPoint(1,1);
        MyPoint b = new MyPoint(1,1);

        System.out.println(a.distance(b)); // pct coincid
    }

}
