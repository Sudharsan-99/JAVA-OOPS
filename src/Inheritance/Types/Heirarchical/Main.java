package Inheritance.Types.Heirarchical;

public class Main {
    public static void main(String[] args) {
        //Shape
        Shape shape= new Shape();
        System.out.println(shape.length+" "+ shape.breadth+" "+ shape.height);
        shape.display();

        System.out.println();

        //Cube
        Cube cube = new Cube(6);
        cube.display();
        System.out.println("The Area of Cube is = "+ Cube.area(6));
        System.out.println("The Volume of Cube is = "+ Cube.volume(6));

        System.out.println();

        //Cuboid
        Cuboid cuboid = new Cuboid(6,7,8);
        cuboid.display();
        System.out.println("The Area of Cube is = "+ Cuboid.area(6,7,8));
        System.out.println("The Volume of Cube is = "+ Cuboid.volume(6,7,8));
    }
}
