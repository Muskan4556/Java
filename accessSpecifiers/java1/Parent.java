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

    static void print(){
        System.out.println("I am in Parent class");
    }

    public void sum(){System.out.println(5+12);}
}
