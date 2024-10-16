package Abstraction.Homework.Animal;

public abstract class Animal {
    String name;
    public Animal(String name){
        this.name= name;
    }
    protected abstract String makeSound();
    protected abstract String sleep();
    public abstract String display();
    public String getName(){
        return name;
    }
}
