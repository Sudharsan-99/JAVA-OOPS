package Abstraction.Basics;

public class Triangle extends Shape{
    int length;
    int breadth;

    public Triangle(String colour, int length, int breadth) {
        super(colour);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int area(){
        return (int)(0.5*length* breadth);
    }

    @Override
    public String toString() {
        return "This is Traingle of color "+getColour()+" and area of "+area();
    }

}
