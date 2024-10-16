package Polymorphism.Override.HomeWork.AccessModifiers;

public class Student extends Person{
    @Override
     protected void getDetail(String name) {
        System.out.println("The Name is "+name);
    }
}