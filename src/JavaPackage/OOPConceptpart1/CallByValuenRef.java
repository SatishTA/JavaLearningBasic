package OOPConceptpart1;
//Call by value and call by reference concept
public class CallByValuenRef {
    //Declair global variables
    int p;
    int q;
    public static void main (String[] Args){
        CallByValuenRef obj = new CallByValuenRef();
        int x=10;
        int y=20;
        //obj.testSum(x,y);//Call by value or pass by value
        System.out.println(obj.testSum(x,y));
        obj.p=500;
        obj.q=600;
        obj.Swap(obj);//Call Swap function with passing obj as reference
        System.out.println(obj.p); //value of p will be 600
        System.out.println(obj.q);//value of q will be 500
    }
    public int testSum(int a, int b){
        a=30;
        b=40;
        int c = a+b;
        return c;
    }
    //call by reference
    public void Swap(CallByValuenRef t) {
        int temp; //creating temp var
        temp=t.p;//assgign 500 to temp
        t.p=t.q;//assign 600 to t.p
        t.q=temp;//assign 500 to t.q
    }
}
