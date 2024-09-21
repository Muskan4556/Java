package accessSpecifiers.java1;

public class Main {
    public static void main(String[] args) {
        Parent p = new Child(); // Here, you are creating an object of type Child, but you are storing the reference to this object in a variable of type Parent. This is allowed because Child is a subclass of Parent, so it can be treated as a Parent object.
        Parent.print(); // will be call Parent one because static methods are resolved based on the class name and not the instance.

        p.sum(); // It will call sum() of child class
    }
}

