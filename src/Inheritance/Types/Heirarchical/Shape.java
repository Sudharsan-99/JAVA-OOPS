package Inheritance.Types.Heirarchical;

public class Shape {
    int height;
    int length;
    int breadth;

    public Shape() {
        this.length=-1;
        this.breadth=-1;
        this.height=-1;
    }

    //cubeboid
    public Shape(int length, int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    //cube
    public Shape(int side) {
        this.length = side;
        this.breadth=side;
        this.height=side;
    }

    //Triangle
    public Shape(int length , int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public void display() {
        System.out.println("This is a shape with dimensions:");
        System.out.println("Length: " + length + ", Breadth: " + breadth + ", Height: " + height);
    }
}
