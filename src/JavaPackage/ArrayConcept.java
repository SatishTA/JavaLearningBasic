import java.util.Arrays;
public class ArrayConcept {
public static void main (String[]Args){
// Array to store similar type of data
        //one dimensional integer array
        int i[]=new int[5];
        i[0]=10;
        i[1]=20;
        i[2]=30;
       System.out.println(i[0]);
        //System.out.println(4); will give Array out of bound index exception
        for (int j=0;j<i.length;j++){ //priting array value defined as integer
            System.out.println(i[j]);
        }
        //Double array
        double m[]=new double[5];
        m[0]=11.11;
        m[1]=12.11;
        m[2]=13.14;
        System.out.println(m[1]);
        for (int k=0;k<m.length;k++){ //printing array values defined as double
            System.out.println(m[k]);
        }
        //String array
        String c[]=new String[5];
        c[0]="Testing";
        c[1]="String Array";
        c[2]="for Learning";
        System.out.println(m[1]);
        for (int l=0;l<c.length;l++){ //printing string values defined as string
            String [] array= new String[] {c[l]};
           //System.out.println(Arrays.toString(array));// this will print string values
            System.out.println(Arrays.toString(array)); // this will print string values in array format
        }
        System.out.println(c.length);

//object array class-- this hold any type of data
    Object obj[]=new Object[6];
    obj[0]="TOm";
    obj[1]=252;
    obj[2]=10.23;
    obj[3]="1/19/1990";
System.out.println(obj[3]);
System.out.println(obj.length);

    }
}
/*disadvantage of array
* it hold similar data types-- to overcome this issue we use object array
* size is fixed i.e. static array--to overcome this problem we use arraylist or hashtable--use dynamic array
* */