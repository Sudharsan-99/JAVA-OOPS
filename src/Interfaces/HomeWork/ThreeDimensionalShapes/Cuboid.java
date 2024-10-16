package Interfaces.HomeWork.ThreeDimensionalShapes;

import Interfaces.HomeWork.Shapes.Rectangle;

public class Cuboid extends Rectangle implements ThreeDimensionalShape {
    private final int height;
    public Cuboid(int length, int breadth,int height) {
        super(length,breadth);
        this.height = height;
    }

    @Override
    public double CalculateVolume() {
        return length*breadth*height;
    }

    @Override
    public double CalculateArea() {
        return 2*(length*breadth + length*height + breadth*height);
    }

    @Override
    public double CalculatePerimeter() {
        return 4*(length+breadth+height);
    }
}
