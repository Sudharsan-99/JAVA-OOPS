package Inheritance.Types.Multilevel;

import Inheritance.Basic.Box;
import Inheritance.Basic.BoxWeigth;

public class BoxPrices extends BoxWeigth {
    double cost;
    public BoxPrices(){
        super();
        this.cost=-1;
    }
    public BoxPrices(double cost) {
        this.cost = cost;
    }

    public BoxPrices(Box other, double weigth, double cost) {
        super(other, weigth);
        this.cost = cost;
    }

    public BoxPrices(double length, double breadth, double height, double weigth, double cost) {
        super(length, breadth, height, weigth);
        this.cost = cost;
    }
}
