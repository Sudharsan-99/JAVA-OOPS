package Interfaces.Basics;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start like power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop like power Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate like power Engine");
    }
}
