package org.example.prototypedesignpattern;

public class Circle implements  Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public  void draw(){
        System.out.println("circle is drawn with radius"+radius);
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }
}
