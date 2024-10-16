package Polymorphism.Overloading.HomeWork.Geometry;

public class Geometry {
    public Geometry() {
        disp();
    }
    public void disp(){
        System.out.println("Hi Enter The Values !!");
    }
    //Rectangle
    public double area(int length,int breadth){
        return length*breadth;
    }
    //Circle
    public double area(double radius){
        return 3.14*radius*radius;
    }
    //Triangle
    public double area(int b , int h, int side){
        double s = (side+b+h)/2;
        return Math.sqrt(s * (s - b) * (s - h) * (s - side));
    }
    //Square
    public double area(int side){
        return side*side;
    }
}
