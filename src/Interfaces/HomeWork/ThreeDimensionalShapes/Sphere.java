package Interfaces.HomeWork.ThreeDimensionalShapes;

import Interfaces.HomeWork.Shapes.Circle;

public class Sphere extends Circle implements ThreeDimensionalShape{

    public Sphere(int radius) {
        super(radius);
    }

    @Override
    public double CalculateVolume() {
        return (4/3)*3.14*Math.pow(radius,3);
    }

    @Override
    public double CalculateArea() {
        return 4*3.14*radius*radius;
    }

    @Override
    public double CalculatePerimeter() {
        return 2*3.14*radius;
    }
}
