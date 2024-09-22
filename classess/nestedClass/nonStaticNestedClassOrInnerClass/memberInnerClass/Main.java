package classess.nestedClass.nonStaticNestedClassOrInnerClass.memberInnerClass;

public class Main {
   public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();

        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.print();
   }
}
