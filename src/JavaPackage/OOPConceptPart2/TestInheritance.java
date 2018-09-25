package OOPConceptPart2;

public class TestInheritance {
    public static void main(String args[]){
        //this is called static polymorphism or compile time polymorphism
        InheritanceBMWclass b=new InheritanceBMWclass();// Create object of the class
        b.start();//this statment will call BMW class to start car
        b.stop();//this statment will call CarClass class to stop the car
        b.refuel();
        b.bmwsaftey();
        b.engine();
        InheritanceCarclass c = new InheritanceCarclass();
        c.start();
        c.stop();
        c.refuel();
System.out.println("*********************");
        //only common method or parent class method will be called with dynamic polymorphism
        InheritanceCarclass C1=new InheritanceBMWclass(); //Child class object can be referred by parent class reference variables
        // this is called dynamic polymorphism
        //Top casting
        C1.refuel();
        C1.start();
        C1.stop();
        //Down casting
        InheritanceBMWclass B1=(InheritanceBMWclass)new InheritanceCarclass();

    }
}

