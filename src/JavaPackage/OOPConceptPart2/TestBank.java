package OOPConceptPart2;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class TestBank {

    public static void main(String[] args){
        HSBCBank hs= new HSBCBank();
        hs.credit();
        hs.debit();
        hs.carloan();
        hs.educationloan();
        //Dynamic polymorphism
        //Child class object like HSBCBank can be referred by parent interface reference object
        USBankInterface b =new HSBCBank();
        ((HSBCBank) b).carloan();
        b.debit();
        System.out.println(USBankInterface.min_bal); // to call the variable from interface then call that with interfacename

    }
}
