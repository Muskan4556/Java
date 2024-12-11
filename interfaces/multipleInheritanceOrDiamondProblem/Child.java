package interfaces.multipleInheritanceOrDiamondProblem;

public class Child implements Parent1,Parent2 {
    @Override
    public void print(){
        System.out.println("Hello from child class");
    }
}
