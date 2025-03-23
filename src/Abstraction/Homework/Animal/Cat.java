package Abstraction.Homework.Animal;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    protected String makeSound() {
        return "Mewoo WEEEE mewwooo ";
    }

    @Override
    protected String sleep() {
        return "Weeee Weeee";
    }

    @Override
    public String display(){
        return "The Cat Name is "+getName()+" and The way it makes Sound is "+makeSound()+" and the way" +
                " it sleeps is "+sleep();
    }
}
