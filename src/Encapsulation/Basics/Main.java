package Encapsulation.Basics;

public class Main {
    public static void main(String[] args) {
        Human sonu = new Human();
        sonu.setAge(20);
        sonu.setName("Sonu");
        System.out.println(sonu.getName()+":"+sonu.getAge());
    }
}
