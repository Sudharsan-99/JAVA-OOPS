package Interfaces.Basics;

public class Main {
    public static void main(String[] args) {
        Car newcar= new Car();
        newcar.acc();
        newcar.start();
        newcar.stop();
        ElectricEngine electricEngine= new ElectricEngine();
        NiceCar tata = new NiceCar(electricEngine);
        tata.start();
        tata.stop();
    }
}
