import java.util.ArrayList;

public class ArrayListConcept {
    public static void main (String[]Args){
        ArrayList ar = new ArrayList();
        ar.add(100); //Index 0
        ar.add(300);//Index 1
        ar.add(400);//Index 2
        System.out.println("Print the size of array "+ar.size());
        ar.add("TOM");//Index 3
        ar.add("HELLO");//Index 4
        ar.add("12.23");//Index 5
        ar.remove(5);
        System.out.println("Print the size of array "+ar.size());
        System.out.println("Print the index value of array "+ar.get(4));

        for( int i=0;i<ar.size(); i++){
            System.out.println(ar.get(i));
        }
        ArrayList<Integer> ar1= new ArrayList<Integer>();
        ar1.add(700);


    }
}
