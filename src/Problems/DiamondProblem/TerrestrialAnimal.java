package Problems.DiamondProblem;

public interface TerrestrialAnimal {
    default void LivesIn() {
        System.out.println("Lives On land");
    }
}
