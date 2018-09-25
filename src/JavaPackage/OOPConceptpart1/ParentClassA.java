package OOPConceptpart1;

public class ParentClassA {
    public ParentClassA(){
        System.out.println("Parent Class Constructor");
    }
    public ParentClassA(int i){ //constructor with 1 variables
        System.out.println("Parent Class Constructor value of i " +i);
    }
    public ParentClassA(int i, int j){ //constructor with 2 variables
        System.out.println("Parent Class Constructor value of i " +i + " and values of j " +j);
    }
}
