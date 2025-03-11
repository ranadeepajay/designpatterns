package org.example.prototypedesignpattern;

public class Rectangle implements Shape{
    private int lenght;
    private  int breadth;


    public Rectangle(int lenght, int breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void draw(){
        System.out.println("rectangle with dimentions:"+lenght+":"+breadth);
    }
    @Override
    public Shape clone() {
        return new Rectangle(this.lenght,this.breadth);
    }
}
