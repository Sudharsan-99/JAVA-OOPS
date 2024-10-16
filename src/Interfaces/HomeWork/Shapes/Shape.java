package Interfaces.HomeWork.Shapes;

public interface Shape {
    double CalculateArea();
    double CalculatePerimeter();

    default void description(){
        System.out.println("I am Shape");
    }

    static int ComparesArea(Shape s1,Shape s2){
        return Double.compare(s1.CalculateArea(), s2.CalculateArea());
    }
}
