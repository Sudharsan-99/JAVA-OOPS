package Inheritance.Types.Heirarchical;

public class Cube extends Shape{

    public Cube(int side) {
        super(side);
    }

    public Cube() {
        super(-1);
    }

    public static int area(int side){
        return 6*(side*side);
    }

    public void display(){
        System.out.println("This is a Cube");
        displayParameters();
    }

    public static int volume(int side){
        return side*side*side;
    }

    public void displayParameters() {
        System.out.println("The side length of the Cube is " + this.length);
    }
}
