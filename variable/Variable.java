package variable;

public class Variable {
    // instance variable
    int instanceVar = 40; // property
    double instanceVar1;
    
    // static variable
    static int staticVar = 50; // AKS class variable

    // local variable
    public void func(){ // method
        int localVar = 60;
        System.out.println("Local variable: " + localVar);
    }

    // Constructor 
    Variable(){}
    // parametrized constructor
    Variable(int y){
        int constructorVar = y;
        System.out.println("Constructor var: "+ constructorVar);
    }
    public static void main(String args[]){
        // Variable obj = new Variable();
        Variable obj = new Variable(70);

        System.out.println("Instance var: " + obj.instanceVar);
        System.out.println("Instance var without initialization(default val): " + obj.instanceVar1);

        System.out.println("Static var: " + Variable.staticVar); // with className
        System.out.println("Static var: " + staticVar); // without className
        
        obj.func();

        float f = 0.7f;
        System.out.println((double)f); // expected value - 0.7 but answer - 0.699999988079071 
    }
    
}

/*

Reference datatype
    1. class
    2. string
    3. array
    4. interface
*/