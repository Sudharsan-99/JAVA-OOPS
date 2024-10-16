package ClassesAndObjects.Basics;

public class Person {
    protected String name;
    protected int age;

    //instance initializer block
    {
        name="Default name";
        age=20;
    }

    //Field Initializer
    protected String HouseName="Default";
    protected int HouseNumber=0;

    //Setter
    private int Money;
    public void setMoney(int money){
        this.Money=money;
    }

    //Static Initializer Block For Static Fields
    static String character;
    static{
        character="Good";
    }


    //constructor initialization of Attributes
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Person(String name, int houseNumber, String houseName, int age, int money) {
        this.name = name;
        HouseNumber = houseNumber;
        HouseName = houseName;
        this.age = age;
        this.Money = money;
    }


    public Person(int houseNumber, String houseName, int age, String name) {
        HouseNumber = houseNumber;
        HouseName = houseName;
        this.age = age;
        this.name = name;
    }

    //default Constructor
    public Person(){
        display();
    }

    protected void display(){
        System.out.println(name+":"+age+" House name :"+HouseName+" and House Number "+HouseNumber+" With a monthly Salary of : "+Money);
        System.out.println(character);
    }

}
