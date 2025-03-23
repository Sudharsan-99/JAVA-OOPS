package Abstraction.Homework.Animal;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    protected String makeSound() {
        return "Boow Boow";
    }

    @Override
    protected String sleep() {
        return "Uzzz";
    }

    public String display(){
        return "The Dog Name is "+getName()+" and The way it makes Sound is "+makeSound()+" and the way" +
                " it sleeps is "+sleep();
    }
}
