package Abstraction.Basics;

public abstract class Shape {
    protected abstract int area();
    public abstract String toString();
    public final String colour;

    public String getColour() {
        return colour;
    }

    public Shape(String colour) {
        this.colour = colour;
    }
}
