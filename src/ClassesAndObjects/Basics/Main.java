package ClassesAndObjects.Basics;

public class Main {
    public static void main(String[] args) {
        Person sonu = new Person(25,"Vinoth Version",20,"Sonu");
        System.out.println(sonu.name + ":"+ sonu.age);
        sonu.display();
        sonu.setMoney(100000);
        sonu.display();

        Person moni = new Person("Moni",25,"Vinoth Version",17,100000);
        moni.character="good  boy";
        moni.display();

    }
}
