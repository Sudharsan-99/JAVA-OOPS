package Polymorphism.Overloading.HomeWork.Geometry;

public class Main {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        //Area of Rectangle
        int length=5;
        int breadth=6;
        int side=10;
        int height=10;
        int radius=5;
        //area of rectangle
        System.out.println("Area of Rectangle is "+geometry.area(length,breadth));
        //area of circle
        System.out.println("Area of Circle is "+geometry.area(radius));
        //area of triangle
        System.out.println("Area of Triangle is "+geometry.area(breadth,height,side));
        //area of square
        System.out.println("Area of Square is "+geometry.area(side));
    }
}
