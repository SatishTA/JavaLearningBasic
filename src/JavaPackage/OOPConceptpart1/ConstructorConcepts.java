package OOPConceptpart1;
//Constructor is used to initalize the class variables
public class ConstructorConcepts {
    String name;
    int age;

    public ConstructorConcepts(){
        System.out.println("Default constructor");
    }

    public ConstructorConcepts(int i){ //ConstructorConcepts having 1 param
        System.out.println("Default constructor having 1 param");
    }

    public ConstructorConcepts(int i , int j){ //ConstructorConcepts having 2 param
        System.out.println("Default constructor having 2 Epworth Pre School ");
        System.out.println(i +" " +j);
    }
    public ConstructorConcepts(String name , int age){ //ConstructorConcepts having 2 param
        this.name=name; //this.classvariable =local variable
        this.age=age;
    }
    public static void main (String[] Args){
        ConstructorConcepts obj= new ConstructorConcepts(); //to call constructor you need to create obj than it will be called
        ConstructorConcepts obj1= new ConstructorConcepts(10);
        ConstructorConcepts obj2= new ConstructorConcepts("TOM",20);
        System.out.println(obj2.name);
        System.out.println(obj2.age);


    }
}
