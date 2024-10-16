package Interfaces.HomeWork.ThreeDimensionalShapes;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(4);
        System.out.println(sphere.CalculateArea());
        System.out.println(sphere.CalculatePerimeter());
        System.out.println(sphere.CalculateVolume());

        //cuboid
        Cuboid cuboid = new Cuboid(5,3,4);
        System.out.println(cuboid.CalculateArea());
        System.out.println(cuboid.CalculatePerimeter());
        System.out.println(cuboid.CalculateVolume());
    }
}
