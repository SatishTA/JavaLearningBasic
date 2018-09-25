package OOPConceptpart1;

public class FunctionasInJAVA {
    public static void main(String[] args){

        FunctionasInJAVA obj= new FunctionasInJAVA();
        //obj is the reference variables and referring the object. New FunctionasInJAVA is the object
        //After creating the object the copy of all the non static methods will be given to this newly created object4
        // main method will always be void as it never returns anything.
        obj.method1();
        String l = obj.qa();
        System.out.println(l);
        int div= obj.division(30,10);
        System.out.println(div);

    }
    //non static methods void does not return any value
    // no input to below method and no output

    public void method1(){
    System.out.println("Method 1 to print");
    }

    //Method which returns integer type
    // no input to below method but return type is integer

    public int method2(){
        int i=10;
        int j=10;
        int k=i+j;
        return k;

    }
// no input to below method but output type is string

    public String qa(){
        System.out.println("QA method");
        String s ="Selenium";
        return s;

    }

    public int division(int x, int y){
        System.out.println("Division Method");
        int z=x/y;
        return z;

    }
}
