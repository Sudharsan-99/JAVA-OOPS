package Interfaces.Basics;

public class NiceCar {
    private Engine engine;

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public NiceCar(){
        this.engine=new PowerEngine();
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
}
