package OOPConceptPart2;
//If a class is implementing any interface then its mandatory to define/override all the method of interface
public class HSBCBank implements USBankInterface,BrazilBank { //here we are acheiving multiple inheritance
    //Is-a relationship
    //below 3 methods overridding from USBankInterface.java interface
    public void credit() {
        System.out.println("HSBC ******Credit method");
    }
    public void debit() {
        System.out.println("HSBC ******Debit method");
    }

    public void transfermoney() {
        System.out.println("HSBC ******Transfermoney method");
    }
    //Only HSBC methods
    public void educationloan(){
        System.out.println("HSBC education loan");
    }
    public void carloan(){
        System.out.println("HSBC Car loan");
    }
    //below mehtod Implements Brazil bank
    public void mutualfund(){
        System.out.println("HSBC implements Brazil bank mutual funds");
    }
}
