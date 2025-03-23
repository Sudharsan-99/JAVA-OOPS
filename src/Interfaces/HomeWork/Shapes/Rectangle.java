package Interfaces.HomeWork.Shapes;

public class Rectangle implements Shape {
    public  final int length;
    public final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void description() {
        System.out.println("I am Rectangle with length "+length+" and Breadth "+breadth);
    }

    @Override
    public double CalculateArea() {
        return length*breadth;
    }

    @Override
    public double CalculatePerimeter() {
        return 2*(length+breadth);
    }

    public void CalArea(){
        System.out.println(CalculateArea());
    }
    public void CalPerimeter(){
        System.out.println(CalculatePerimeter());
    }
}
