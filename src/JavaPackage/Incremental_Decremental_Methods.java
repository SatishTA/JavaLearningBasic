package JavaPackage;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
public class Incremental_Decremental_Methods {
    public static void main(String[] args){
        int i=1;
        int j=i++; //post increment

        System.out.println(i);
        System.out.println(j);
    int a=1;
    int b=++a;//pre increment
    System.out.println(a);
    System.out.println(b);

    int m=5;
    int n=m--; // post decrement
    System.out.println(m);
    System.out.println(n);

        int p=4;
        int q=--p; // pre decrement
        System.out.println(p);
        System.out.println(q);

    }
}
