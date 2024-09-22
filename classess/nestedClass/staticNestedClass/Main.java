package classess.nestedClass.staticNestedClass;

public class Main {
    public static void main(String[] args) {
        // Object of Nested class
        OuterClass.NestedClass obj = new OuterClass.NestedClass();
        obj.print();
        
        OuterClass.display(); // Access print method private Inner Class
        
    }
}
