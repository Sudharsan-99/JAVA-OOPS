package Problems.DiamondProblem;


/*
If 2 or more parent class have same method then the child class extending both parents will be confused as
in which method is to be given preference
This is called as Diamond Problem

To solve this We can use Interfaces


*/
public class Frog implements AquaticAnimal,TerrestrialAnimal {

    @Override
    public void LivesIn() {
        TerrestrialAnimal.super.LivesIn();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.LivesIn();
    }
}
