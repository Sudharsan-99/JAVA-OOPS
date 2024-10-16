package Polymorphism.Override.HomeWork.Shapes;

public class Circle extends Shape{
    @Override
    public double area(int num) {
        return 3.14*num*num;
    }
}
