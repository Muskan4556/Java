package classess.nestedClass.nonStaticNestedClassOrInnerClass.memberInnerClass;

class OuterClass {
    int instanceVar = 10;
    static int classVar = 200;

    // Member inner class can be public, private, protected and default
    class InnerClass {
        public void print(){
            System.out.println("Instance variable of outer class: " + instanceVar);
            System.out.println("Class variable of outer class: " + classVar);
        } 
    }
}
