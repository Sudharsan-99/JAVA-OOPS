package Inheritance.Types.Heirarchical;

public class Cuboid extends Shape{
    public Cuboid(int length, int breadth,int height) {
        super(length,breadth,height);
    }
    public  void display(){
        System.out.println("This is a Cuboid");
        displayParameters();
    }
    public void displayParameters(){
        System.out.println("The Length of Cuboid is "+this.length+" The Breadth of Cuboid is " + this.breadth + " The heigth of Cuboid is "+ this.height);
    }
    public static int volume(int length,int breadth,int heigth){
        return length*breadth*heigth;
    }
    public static int area(int length,int breadth,int heigth){
        return 2*((length*breadth)+(length*heigth)+(breadth*heigth));
    }
}
