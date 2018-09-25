package OOPConceptpart1;

public class ChildClassB extends ParentClassA { //here extends keywords first goto parent class and call methods than comes to child class
    public ChildClassB(){
        super();
        System.out.println("Child class constructor");
    }
    public ChildClassB(int i){
        super(i);
    }
    public ChildClassB(int i, int j){
        super(i,j);
    }
    public static void main(String[] args){
        ChildClassB obj = new ChildClassB();
        ChildClassB obj1 = new ChildClassB(10);
        ChildClassB obj2 = new ChildClassB(10,50);
    }
}
