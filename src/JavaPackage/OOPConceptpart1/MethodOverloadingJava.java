package OOPConceptpart1;

public class MethodOverloadingJava {
    public static void main(String[] args){
        MethodOverloadingJava obj= new MethodOverloadingJava();
        obj.sum();
        obj.sum(10);
        obj.sum(10,20);

    }
    //Method overloading when method name is same with different arguments(make sure different data type) or input param within the same class
    // you can't create method inside method
    //same method name and same input param is not allowed
    public void sum(){
        System.out.println("print the sum method with 0 input param");
    }
    public void sum(int i){
        System.out.println("print the sum method with 1 input param");
    }
    public void sum(int i, int j){
        System.out.println("print the sum method with 2 input param");
    }

}
