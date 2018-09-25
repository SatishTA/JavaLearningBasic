package OOPConceptpart1;
public class Car {
    int mod;
    int wheel;
    // new Car() is the object of Car class
    // new keyword is used to create the object
    public static void main(String[] args){
       Car a = new Car();
       Car b = new Car();
       Car s = new Car();
       a.mod=2018;
       a.wheel=4;
       b.mod=2017;
       b.wheel=4;
       s.mod=2016;
       s.wheel=4;
       System.out.println(a.mod);
       System.out.println(s.wheel);
       a=b;
       b=s;
       s=a;
       a.mod=10;
       System.out.println(a.mod);//This returns 10
       s.mod=30;
       System.out.println(a.mod);//This returns 30
    }
}

