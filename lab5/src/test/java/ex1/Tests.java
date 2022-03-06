package ex1;

//Teste for ex 2

import ex2.ProxyImage;
import ex2.RealImage;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    void testconstructor() {
        ProxyImage eu = new ProxyImage("doi zece", true);
        RealImage tu = new RealImage("alo");
        RealImage ea = new RealImage("HHH");


        ea.display();
        System.out.println("\n");
        tu.display();
        System.out.println("\n");
        eu.display();


    }

}
