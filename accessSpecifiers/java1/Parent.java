package accessSpecifiers.java1;

public class Parent {
    private void printHello(){
        System.out.println("Hello world");
    }

    protected void callPrintHello(){
        printHello();
    }

    void againCallPrintHello(){
        printHello();
    }

    public  void callPrintHelloWithPublic(){
        printHello();
    }

    
}
