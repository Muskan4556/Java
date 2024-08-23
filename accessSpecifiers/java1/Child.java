package accessSpecifiers.java1;

public class Child extends Parent {
    void getHello(){
        // printHello(); // error - printHello - private(access - only within Parent class)
        callPrintHello(); // protected (access within same package(java1) + child class in same package / different 
        againCallPrintHello(); // default
        callPrintHelloWithPublic(); // public 
    }
    static void print(){
        System.out.println("I am in Child class");
    }
}
