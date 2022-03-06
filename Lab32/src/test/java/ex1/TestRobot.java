package ex1;


import org.junit.jupiter.api.Test;


public class TestRobot {

    @Test
    void testconstructor() {
        Robot a = new Robot();
        if(1==a.getX())
            System.out.println("OK"); // am o mica problema cu pachetele pentru assertEquals

    }

}
