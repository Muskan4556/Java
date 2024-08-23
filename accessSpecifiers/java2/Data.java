package accessSpecifiers.java2;

import accessSpecifiers.java1.Parent;

public class Data extends Parent {
    
    public void getFunc(){
        // printHello(); // error - private
        callPrintHello(); // protected 
        // againCallPrintHello(); // error  different package - default visibility
        callPrintHelloWithPublic();
    }
    
    public static void main(String[] args) {
        Data data = new Data();
        data.callPrintHello();
        data.callPrintHelloWithPublic();
        
    }
}
