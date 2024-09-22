package classess.nestedClass.staticNestedClass;

class OuterClass {
    int instanceVar = 10;
    static int classVar = 200;
    public static NestedClass NestedClass;

    static class NestedClass{
        public void print(){
            System.out.println("This is a static nested class");
            System.out.println("We can access classVar of OuterClass directly using classVar: " + classVar);
            System.out.println("We can access classVar of OuterClass using OuterClass.classVar: " + OuterClass.classVar);
            System.out.println("We can access not instanceVar of OuterClass");

        }
    }
    // Nested class can be created with any access modifiers i.e public,private,protected and default
    private static class InnerClass {
        public void print(){
            System.out.println("This is a private static Inner class");
            System.out.println("We can access classVar of OuterClass directly : " + OuterClass.classVar);
        }
    }

    public static void display(){
        InnerClass obj = new InnerClass();
        obj.print();
    } 

}
