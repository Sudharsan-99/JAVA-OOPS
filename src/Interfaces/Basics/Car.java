package Interfaces.Basics;

public class Car implements Engine,Brake{

    @Override
    public void brake() {
        System.out.println("Brake");
    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate");
    }
}
