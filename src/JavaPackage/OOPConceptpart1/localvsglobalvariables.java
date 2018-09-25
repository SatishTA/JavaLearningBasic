package OOPConceptpart1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class localvsglobalvariables {
//global var or class var
// to access global variables in local class create new object than access the global variable
    String name="Tom";
    int age=35;

    public static void main (String[] Args){
    int age=38;
    System.out.println(age);
    localvsglobalvariables obj = new localvsglobalvariables();
    System.out.println(obj.name);
    System.out.println(obj.age);
    System.out.println(obj.sum());
    }
    public int sum(){
        int i=10; // local variables
        int j=90;
        int k =i+j;
        return k;
    }
}
