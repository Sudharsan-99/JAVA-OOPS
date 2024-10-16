package Polymorphism.Overloading.HomeWork.StringManipulator;

public class StringManipulator {
    public StringManipulator() {
        disp();
    }
    public void disp(){
        System.out.println("Enter The Value!!");
    }
    public String concat(String s1,String s2){
        return s1+s2;
    }
    public String concat(String s1,String s2,String s3){
        return s1+s2+s3;
    }
    public String concat(String s1,int n){
        return s1+n;
    }
}
