package Polymorphism.Overloading.Basics;

public class Overloading {
    //Add Sum
    public Overloading() {
        dis();
    }
    public void dis(){
        System.out.println("Enter the Values !!");
    }
    public static int add(int a,int b){
        return 2*(a+b);
    }
    public static double add(double a,double b){
        return a+b;
    }
}
