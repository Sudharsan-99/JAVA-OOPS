package Interfaces.HomeWork.Shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.CalculateArea());
        System.out.println(circle.CalculatePerimeter());
        Circle circle1 = new Circle(5);
        System.out.println(circle1.CalculateArea());
        System.out.println(circle1.CalculatePerimeter());


        //Rectangle
        Rectangle rectangle = new Rectangle(4,5);
        rectangle.CalArea();
        rectangle.CalPerimeter();

        //description
        rectangle.description();
        circle1.description();
        int areavalue=Shape.ComparesArea(rectangle,circle1);
        if(areavalue>0){
            System.out.println("Circle has Higger Area");
        }
        else if(areavalue<0){
            System.out.println("Rectangle has Higger Area");
        }
        else{
            System.out.println("They have equal Area");
        }
    }
}
