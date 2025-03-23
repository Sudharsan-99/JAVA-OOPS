package Interfaces.FunctionalInterfaces;

public class Main {
    public static void main(String[] args) {

        System.out.println("a = 4 and b = 5 ");
        Calculator adder = new Calculator() {
            public int calculate(int a,int b){
                return a+b;
            }
        };
        System.out.println(adder.calculate(4,5));

        Calculator multiplier=(int a,int b) -> a*b;
        System.out.println("Multiplication : "+multiplier.calculate(4,5));

        Calculator divider=(int a,int b) -> {
            if(b!=0){
                return a/b;
            }
            else {
                throw new ArithmeticException("Dividing By Zero");
            }
        };
        System.out.println("Division : "+divider.calculate(4,5));

        Calculator subtraction=(int a,int b) -> a-b;
        System.out.println("Subtraction : "+subtraction.calculate(4,5));
    }
}
