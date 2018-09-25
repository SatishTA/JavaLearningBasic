import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Hashtable;

public class HashTableConcept {
    public static void main (String[]Args){
        Hashtable h = new Hashtable();
        h.put("A", "Test");
        h.put("B", "Kenil");
        h.put("C", "Pune");
        h.put("D", "Bhopal");
        h.put("E", "Kanpur");
        h.put("F", "Patna");
        System.out.println("print size of hashtable "+h.size());
        h.put(1, 100);
        h.put(2, 300);
        System.out.println("print size of hashtable "+h.size());
        System.out.println(h.get(2));
        System.out.println(h.get("C"));
        Hashtable<Integer,Integer> h1 = new Hashtable<Integer, Integer>(); //only accepts integer values
        h1.put(1,100);





    }
}
