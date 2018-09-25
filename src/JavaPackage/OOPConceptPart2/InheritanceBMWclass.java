package OOPConceptPart2;

public class InheritanceBMWclass extends InheritanceCarclass {// has-a relationship
    public void start(){
        //when same method present in parent and child class with same name and same no of arguments is called method overriding
        System.out.println("BMW...Start the car");
    }
    public void bmwsaftey(){
        System.out.println("Excess safety for BMW car");
    }
}
