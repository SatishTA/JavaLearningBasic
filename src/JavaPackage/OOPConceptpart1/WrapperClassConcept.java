package OOPConceptpart1;

public class WrapperClassConcept {
    public static void main(String[] args){
        String x="100";
        String r= "Hello KENIL";
        System.out.println(r);

        String d="Hello SATISH";
        System.out.println(d);
        System.out.println(x+20);
        //Data conversion string to integer
        int i= Integer.parseInt(x);
        System.out.println(i+20);
        //String to double conversion
        String y="55.11";
        System.out.println(Double.parseDouble(y)+10);
        // String to Boolean
        String u="true";
        System.out.println(Boolean.parseBoolean(u));
        //Integer to string conversion
        int j=300;
        System.out.println(String.valueOf(j)+20);

    }
}
