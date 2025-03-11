package org.example.prototypedesignpattern;

public class PrototypeMain {
    public static void main(String[] args) {

        Circle circle=new Circle(10);

        Circle clonedCircle=(Circle) circle.clone();
        clonedCircle.setRadius(14);
        clonedCircle.draw();


        Rectangle rectangle=new Rectangle(9,13);
        Rectangle clonedRectangle=(Rectangle) rectangle.clone();

        clonedRectangle.setBreadth(10);
        clonedRectangle.setLenght(14);
        clonedRectangle.draw();



    }
}
