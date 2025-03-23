package Polymorphism.Overloading.HomeWork.StringManipulator;

public class Main {
    public static void main(String[] args) {
        StringManipulator stringManipulator=new StringManipulator();
        System.out.println(stringManipulator.concat("sonu","moni"));
        System.out.println(stringManipulator.concat("sonu",98));
        System.out.println(stringManipulator.concat("sonu","moni","raju"));
    }
}
