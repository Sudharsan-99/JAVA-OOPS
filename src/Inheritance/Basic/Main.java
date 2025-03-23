package Inheritance.Basic;

public class Main {
    public static void main(String[] args) {
        Box b1= new Box();
        System.out.println(b1.length+" "+ b1.breadth+" "+ b1.height);

        Box b2= new Box(7);
        int areaofcube=(int)((int) 6*(Math.pow(b2.length,2)));
        System.out.println("Area of Cube is = "+areaofcube);

        Box b3 = new Box(7,8,9);
        int areaofcuboid=(int)((int) 2*((b3.length*b3.breadth)+(b3.breadth*b3.height)+(b3.length*b3.height)));
        System.out.println("Area of Cuboid is = "+areaofcuboid);

        Box b4 = new Box(b3);
        System.out.println(b4.length+" "+b4.breadth+" "+b4.height);


        //Inheritance
        BoxWeigth b5 = new BoxWeigth();
        System.out.println(b5.length+" "+b5.breadth+" "+b5.height+" "+b5.weigth);//output---(-1,-1,-1,-1)

        BoxWeigth b6 = new BoxWeigth(2,3,4,10);
        System.out.println(b6.length+" "+b6.breadth+" "+b6.height+" "+b6.weigth);

        Box  b7 = new BoxWeigth(2,5,67,8);//Parent Classes referencing to child class
        //System.out.println(b7.weigth);//Throws error;
        System.out.println(b7);

        //there are many variables in both child and Parent classes
        //You are given access to variable that are in the ref type i.e.(BoxWeigth)
        //Hence you should have access to weight variable
        //this also means  that the ones you are trying to access should be intialized
        //but here whe the obj  itself is of type parent class how will you call the constructor

        //BoxWeigth b8=  new Box();//Throws error because we are referencing a child to Parent;
    }
}

//               POINTS TO REMEMBER
//HEIRARCHY OF PRINTING --- First comes the Box Class ,
//                          Second comes the BoxWeigth Class,
//                          Third is the Main Method


// Child class can't refer to another child
// Child can't refer to Parent Class