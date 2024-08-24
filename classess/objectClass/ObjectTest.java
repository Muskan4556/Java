package classess.objectClass;
import classess.abstractClass.Audi;

public class ObjectTest {
    
    public static void main(String[] args) {
        
        ObjectTest obj = new ObjectTest();

        // Object is the topmost class in Java and the root of the class hierarchy.
        // Every class in Java is a descendant of Object.
        Object obj1 = new Person(44);
        Object obj2 = new Audi(10);

        System.out.println(obj.getClass()); // class classess.objectClass.ObjectTest
        System.out.println(obj1.getClass()); // class classess.objectClass.Person
        System.out.println(obj2.getClass()); // class classess.abstractClass.Audi

        System.out.println(obj1.toString()); // classess.objectClass.Person@1f32e575
    }
}
