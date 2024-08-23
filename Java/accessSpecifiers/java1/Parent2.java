package accessSpecifiers.java1;

public class Parent2 {
    
   public static void main(String[] args) {
    Parent p = new Parent();
    p.callPrintHello(); // - protected (access within same package(java1) + child class in same package / different package )
    p.againCallPrintHello(); // - default (access within same package(java1) )
    p.callPrintHelloWithPublic();
    // p.printHello(); // error - private visibility
   }
}
