package Abstraction.Homework.Animal;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Tommy");
        Cat cat = new Cat("Kamili");
        //dog methods
        System.out.println(dog.display());

        //cat methods
        System.out.println(cat.display());
    }
}
