package CollectionSession;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static void main (String[]Args){

        /*Dynamic array --ArrayList
          * 1. Can contain duplicate values/elements
          * 2. it maintains insertion order
          * 3. Synchronized
          * 4. allows random access to fetch the element because it stores the values on the basis of indexes
        */
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(20);
        ar.add(300);
        ar.add(400);
        ar.add(450);
        ar.add(56);
        System.out.println(ar.size());
        ar.add("test");
        ar.add(10.12);
        System.out.println(ar.size());
        //Generic vs Non Generic array
        ArrayList<Integer> ar1= new ArrayList<Integer>(); //allow only adding integers
        ar1.add(100);
        ArrayList<String> ar2= new ArrayList<String>(); //allow only adding strings
        ar2.add("Satish");
       // ArrayList<E> ar3= new ArrayList<E>();

        //Employee class object
        Employee e1= new Employee("Satish", 34, "QA");
        Employee e2= new Employee("TOM", 28, "Dev");
        Employee e3= new Employee("PETER", 29, "Admin");
        //Create Array list as Employee object
        ArrayList<Employee> ar4= new ArrayList<Employee>();
        ar4.add(e1); //employee object to be added in arraylist
        ar4.add(e2);
        ar4.add(e3);
        //Iterator to traverse the values
        Iterator<Employee> it= ar4.iterator();
        while (it.hasNext()){
            Employee emp= it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }
// IMP above code shows how to store specific user defined object in array list
        System.out.println("*******************");
//*******************
        //addAll() method to merge 2 array list
        ArrayList<String> ar5= new ArrayList<String>(); //allow only adding strings
        ar5.add("Superman");
        ar5.add("JumpMan");
        ArrayList<String> ar6= new ArrayList<String>(); //allow only adding strings
        ar6.add("Satish");
        ar6.add("Testing one");
        ar5.addAll(ar6); //this will add all the array 6 values to array5
        for(int i=0;i<ar5.size();i++)
        {
            System.out.println(ar5.get(i));
        }
System.out.println("*********************");
        //remove all method
        ar5.removeAll(ar6);
        for(int i=0;i<ar5.size();i++)
        {
            System.out.println(ar5.get(i));
        }
        System.out.println("*********************");
        //Retain all method in ArrayList will retain only common values
        ArrayList<String> ar7= new ArrayList<String>(); //allow only adding strings
        ar7.add("Test");
        ar7.add("Selenium");
        ArrayList<String> ar8= new ArrayList<String>(); //allow only adding strings
        ar8.add("Test");
        ar8.add("Karate");
        ar7.retainAll(ar8);
        for(int i=0;i<ar7.size();i++)
        {
            System.out.println(ar7.get(i));
        }
    }
}
