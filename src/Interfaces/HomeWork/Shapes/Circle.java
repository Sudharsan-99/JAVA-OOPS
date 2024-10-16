package Interfaces.HomeWork.Shapes;

public class Circle implements Shape{

    public final int radius;


    protected Circle(int radius){
        this.radius=radius;
    }
    @Override
    public double CalculateArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double CalculatePerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public void description() {
        System.out.println("This is a Circle with Radius "+radius);
    }
}
