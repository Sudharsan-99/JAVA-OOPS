package Inheritance.Types.Multilevel;

public class Main2 {
    public static void main(String[] args) {
        BoxPrices ten = new BoxPrices(10,11,12,13,50);
        //In the code when we run What will be the Output?
        //The Answer is when the BoxPrice Obj is created
        //First-- it will point to The Below Code---This is a constructor of BoxWeigth
                  //  public BoxWeigth(double length, double breadth, double height, double weigth) {
                            //super(length, breadth, height);
                            // System.out.println("THE WEIGTH IS = "+super.weigth);
                           //System.out.println("THE WEIGTH IS = "+this.weigth);
                           //Used to intialize values present in the Parent Class
                           //  this.weigth = weigth;
                       //}

        //Secondly-- it will see the super keyword in the above code and Check To which Constructor this the super Keyword Points to.
        //And finds out it point to Box Constructor
                 // public Box(double length,double breadth,double height){
                        //System.out.println("Box Class Constructor For Cuboid");
                        // this.length=length;
                        // this.breadth=breadth;
                        // this.height=height;
                        // }

        //So when we Print it The Output will be as below
                       //"Box Class Constructor For Cuboid"
                       //"THE WEIGTH IS = "+super.weigth;
                       //THE WEIGTH IS = "+this.weigth
                       //and then finnally the below Print Statement Runs

        System.out.println("The BoxPrices for The Box of Length "+ten.length+", Breadth "+ten.breadth+" ,Heigth "+ten.height+" and Weigth of "+ten.weigth+" is "+ten.cost);
    }
}
