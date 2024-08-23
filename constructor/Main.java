package constructor;

public class Main {
    public static void main(String[] args) {
        // no-arguments
        // Employee emp = new Employee();

        // parametrized 
        // Employee emp = new Employee(77);

        // Overloading
        // Employee emp = new Employee(77, "Muskan");
        // emp.display();

        // private Constructor
        // Employee emp1 = new Employee(); // error

        // Singleton pattern usage
        // Employee object = Employee.getInstance();
        // object.display();

        // Demonstrating constructor chaining with inheritance
        Child c = new Child(1001,"abc",457.875); // Parent constructor is called first, then Child constructor.
        c.display();
    }
    
}
