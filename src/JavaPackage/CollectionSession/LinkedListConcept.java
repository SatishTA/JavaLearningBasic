package CollectionSession;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main (String[] Args){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Testing");
        ll.add("Selenium");
        ll.add("TestNG");
        ll.add("RPA");
        ll.add("RFT");
        
        System.out.println("Print all the values from linkedList" + ll);
        //add first
        ll.addFirst("Satish");
        ll.addLast("Last comment");
        System.out.println("Print all the values from linkedList" + ll);

        //get from linkedlist
        System.out.println(ll.get(0));
        //set in linkedlist
        ll.set(0,"TestComplete");
        System.out.println(ll.get(0));
        //remove first and last element
        ll.removeFirst();
        ll.removeLast();
        System.out.println("remaining Content for LL" + ll);

        // Print all the values from linked list
        //using for loop
        System.out.println("Print all the values using for loop");
        for (int i=0; i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }
        System.out.println("Print all the values using advance for loop");
        for (String str : ll){
            System.out.println(str);
        }
        // Print all the values from linked list
        //using iterator
        System.out.println("*******Using iterator");
        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // Print all the values from linked list
        //using while loop
        System.out.println("Print all the values using while loop");
        int num=0;
        while(ll.size()>num){
            System.out.println(ll.get(num));
            num++;
        }

    }


}