package Polymorphism.Overloading.HomeWork.Convertor;

import java.util.Scanner;

public class Convertor {
    public int  n;
    Scanner sc = new Scanner(System.in);

    public Convertor() {
        int value = disp1();
        disp2();
        Check(value);
        sc.close();
    }

    public int  disp1(){
        System.out.println(" Which Operation You Need To Perform ");
        System.out.println(" For inches to feet Enter 1 ");
        System.out.println(" For inches to centimeter Enter 2 ");
        System.out.println(" For  inches to meters Enter 3 ");
        System.out.print(" Enter The Value = ");
        return sc.nextInt();
    }

    public void Check(int m){
        if(m==1){
            System.out.println(n+" Inche is equal to "+convert((double)n)+" Feet");
        }
        else if(m==2){
            System.out.println(n+" Inche is equal to "+convert(n)+" Centimeter");
        }
        else if(m==3){
            System.out.println(n+" Inche is equal to "+convert((float)n)+" Meter");
        }
        else{
            System.out.println(" Invalid Value !! Enter the Value Correctly ");
        }
    }
    public void disp2(){
        System.out.print("Please Enter The Value For Conversion = ");
        n=sc.nextInt();
    }
    public int convert(int n){
        return (int) (n * 2.54);
    }
    //inche to feet
    public double convert(double n){
        return n* 0.0833333333;
    }
    //inche to Meter
    public float convert(float n){
        return  (n* 0.0254f);
    }
}
