package Inheritance.Basic;

public class BoxWeigth extends Box {
    public double  weigth=50;

    public BoxWeigth(){
        weigth=-1;
    }

    public BoxWeigth(double weigth) {
        this.weigth = weigth;
    }

//    public BoxWeigth(BoxWeigth other){
//        super(other);
//        weigth=other.weigth;
//    }


    public BoxWeigth(Box other, double weigth) {
        super(other);
        this.weigth = weigth;
    }
    //there are many variables in both child and Parent classes
    //You are given access to varaibe that are in the ref type i.e.(BoxWeigth)
    //Hence you should have access to weigth varaible
    //this also means  that the ones you are trying to access should be intialized
    //but here whe the obj  itself is of type parent class how will you call the constructor

    public BoxWeigth(double length, double breadth, double height, double weigth) {
        super(length, breadth, height);
//        System.out.println("THE WEIGTH IS = "+super.weigth);
//        System.out.println("THE WEIGTH IS = "+this.weigth);
        //Used to intialize values present in the Parent Class
        this.weigth = weigth;
    }
}

