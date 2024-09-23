package interfaces.multipleInheritanceOrDiamondProblem;

public class Main {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.print();

        Parent1 obj1 = new Child();
        obj1.print();

        Parent1 obj2 = new Child();
        obj2.print();
    }
}

/**
 * In Java, multiple inheritance is possible only through interface. 
 */