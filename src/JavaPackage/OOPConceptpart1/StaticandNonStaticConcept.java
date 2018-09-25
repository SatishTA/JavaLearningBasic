package OOPConceptpart1;

public class StaticandNonStaticConcept {
    String name= "Satish"; //non static global var
    static int k=97; //static global var

    public static void main(String[] args){
        /**
         * how to call static methods and var
         * 1. by direct calling
         * 2. calling by class name
         */
        Sum();
        StaticandNonStaticConcept.Sum();
        //System.out.println();
        System.out.println(StaticandNonStaticConcept.k);
        //how to call non static methods and obj is by creating obj
        StaticandNonStaticConcept obj = new StaticandNonStaticConcept();
        obj.sendmail();
        System.out.println(obj.name);
        // Can i access static method by using object reference
        obj.Sum(); //warning will be given

      }
      public void sendmail(){ //Non static method
        System.out.println("send mail method");
      }

    public static void Sum(){ //Static method
        System.out.println("Printing SUM");

    }
}
