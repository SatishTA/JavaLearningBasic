package JavaPackage;

public class DataTypes {

    public static void main(String[] args) {
        //integer
        int i = 10;
        int j=20;
        System.out.println(i);
        //double
        double d = 100.00;
        System.out.println(d);
        //char should have single digit value
        char f = 'w';
        System.out.println(f);
        //boolean
        boolean b1 = false;
        boolean b2 = true;
        System.out.println(b1);
        //String
        String s = "this is string";
        String s2 = "Hello World";
        System.out.println(s);
        System.out.println(s2);
        if (i<j) {
        System.out.println("value of j "+ j + " Greater than value of i "+i);
        int k=100;
        int l=200;
        int m=300;
            if (k<l & k>m) {
                System.out.println("value of k is lower");
            } else if (m > l & m > k) {
                System.out.println("value of M is greatest");
            } else {
                System.out.println("M is greatest");
            }
        }

    }

}


