package constructor;

public class Child extends Parent {
    double salary;

    // No-argument constructor
    Child(){
        super(); // super() is by default present and it will invoke the parent constructor first. It is not necessary to write it with no args parent constructor as it is automatically added. 
        System.out.println("Child constructor called with no args");
        this.salary = 0.0;
    }

    // Child(double salary){
    //     this.salary = salary;
    // }

    // Use parent constructor args /  Parametrized Constructor  - writing super() is necessity
    Child(int id, String name, double salary){
        super(id, name); // id and name belongs to parent, super(id, name) is necessary here to call the parameterized constructor of Parent.
        this.salary = salary;
    }

    @Override
    public void display(){
        System.out.println("id: " +id + "\n" + "name: "+ name);
        System.out.println("salary: " + salary);
    }
}
