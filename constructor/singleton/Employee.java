package constructor.singleton;

public class Employee {
    private static Employee instance;

    private int id;
    private String name;

    private Employee(){
        id = 1;
        name = "John Doe";
    }

    public static Employee getInstance(){
        if(instance == null){
            instance = new Employee();
        }
        return instance;
    }
    public void display() {
        System.out.println("Singleton Instance: "+"id: "+  id+" name:  "+name);

    } 

    public static void main(String[] args) {
        Employee emp1 = Employee.getInstance();
        emp1.display();

        Employee emp2 = Employee.getInstance();
        emp2.display();

        Employee emp3 = Employee.getInstance();
        emp3.display();
    }
}
