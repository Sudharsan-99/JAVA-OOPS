package Polymorphism.Override.HomeWork.Animal;

public class Main {
    public static void main(String[] args) {
        Animal dog=new Animal();
        Animal dog1 = new Dog();
        dog1.makesound();
        dog.makesound();
        Animal cow = new Cow();
        Animal cat = new Cat();
        cow.makesound();
        cat.makesound();

        //array of object
        Animal animals[] = new Animal[3];
        animals[0]=new Cat();
        animals[1]=new Dog();
        animals[2]=new Cow();
        for(Animal ani:animals){
            ani.makesound();
        }
    }
}
