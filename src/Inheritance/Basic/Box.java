package Inheritance.Basic;

public class Box {
    public double length;
    public double breadth;
    public double height;
    double weigth=78;

    public Box() {
        super();//Class Object is the root of the class hierarchy. Every class has Object as a superclass.
        // All objects, including arrays, implement the methods of this class.
        this.length=-1;
        this.breadth=-1;
        this.height=-1;
    }
    public Box(double length,double breadth,double height){
        //System.out.println("Box Class Constructor For Cuboid");
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    public Box(double side){
        //System.out.println("Box Class Constructor For Cube");
        this.length=side;
        this.breadth=side;
        this.height=side;
    }
    public Box(Box other){
        this.length=other.length;
        this.breadth=other.breadth;
        this.height=other.height;
    }
}
