package classess.nestedClass.nonStaticNestedClassOrInnerClass.localInnerClass;

public class OuterClass {
    int instanceVar = 10;
    static int classVar = 200;

    public void display(){
        int methodLocalVar = 88;
        // Local Inner Class
        class LocalInnerClass {
            int localInnerVar = 99;

            public void print(){
                System.out.println("Local Inner Class");
                System.out.println("Instance Variable of Outer Class: "+instanceVar);
                System.out.println("Class Variable of Outer Class: "+classVar);
                System.out.println("Method Local Variable: "+methodLocalVar);
                System.out.println("Local Variable of Inner Class: "+localInnerVar);
            }
        }

        LocalInnerClass obj = new LocalInnerClass();
        obj.print();
    }  
}
/**
 * These are those classes which are defined in any block like for loop, while loop block, If condition block, method etc.
 * It can not be declared as private, protected, public. Only default(not defined explicit) access modifier is used.
 * It can not be initiated outside of this block.
 */