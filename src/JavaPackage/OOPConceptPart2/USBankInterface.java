package OOPConceptPart2;
//Interface will only have method declaration with No method body and No static method
//In interface we can declare the variables, cars are the default static in nature
//Interface will not have main method
//Interface is abstract in nature
//we can't create the object of interface
//variable value can't be changed. Its final in nature.
public interface USBankInterface {
    int min_bal=100;
    public void credit();
    public void debit();
    public void transfermoney();
}
