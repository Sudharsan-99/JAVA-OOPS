package Interfaces.Basics;

public class ElectricEngine implements Engine{
    public void start() {
        System.out.println("Start like electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop like electric Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate like electric Engine");
    }
}
