package classess.nestedClass.nonStaticNestedClassOrInnerClass.anonymousInnerClass;

public class Main {
    public static void main(String[] args) {
        // Creating an anonymous inner class of Car and overriding pressBreak method
        Car audiCarObj = new Car() {
            @Override
            public void pressBreak() {
                System.out.println("audi specific break changes");
            };
        };
    
        audiCarObj.pressBreak();
    }
}
