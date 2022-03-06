package ex2;

//Tester for ex 1

import ex1.Circle;
import ex1.Rectangle;
import ex1.Shape;
import ex1.Square;

public class Tests {
    public static void main(String[] args) {
        Shape[] sh=new Shape[3];
        sh[0]=new Rectangle(2,3);
        sh[1]=new Circle(2);
        sh[2]=new Square(2);

        System.out.println(sh[0].getArea());
        System.out.println(sh[0].getAPerimeter());

        System.out.println(sh[1].getArea());
        System.out.println(sh[1].getAPerimeter());

        System.out.println(sh[2].getArea());
        System.out.println(sh[2].getAPerimeter());



    }


}


