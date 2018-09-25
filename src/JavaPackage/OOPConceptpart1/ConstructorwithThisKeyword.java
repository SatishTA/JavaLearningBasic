package OOPConceptpart1;

import java.sql.SQLOutput;

public class ConstructorwithThisKeyword {
//class variables
    String name;
    int age;
    public ConstructorwithThisKeyword (String name, int age) {
        this.name=name; //here local variable equals to local variables
        this.age=age;
        System.out.println(name);
        System.out.println(age);

    }

    public static void main(String[] args) {
        ConstructorwithThisKeyword obj = new ConstructorwithThisKeyword("Tom", 23);
        ConstructorwithThisKeyword obj1 = new ConstructorwithThisKeyword("Mumbai", 35);
    }
}
