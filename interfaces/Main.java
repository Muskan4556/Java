package interfaces;

public class Main {
    public static void main(String[] args) {

        // anonymous class
        Bird birdObj = new Bird() {
            @Override
            public void fly(){
                System.out.println("fly implementation(anonymous class)");
            }
        };
        birdObj.fly();

        // Eagle instance
        Eagle obj1 = new Eagle();
        obj1.fly();
        obj1.display();

        // Polymorphism (Bird reference, Eagle object)
        Bird obj2 = new Eagle();
        obj2.fly();
        // obj.display(); // err - Bird doesn't have display() method

         // To call display, cast to Eagle
         ((Eagle) obj2).display(); 

        // Object reference (Eagle object)
        Object obj3 = new Eagle();
        // obj1.fly(); // err
        // obj1.display(); // err
       System.out.println( obj3.toString());
    }
}

/*
 * Polymorphism: When using a superclass (or interface) reference, you can only access methods defined in the superclass (or interface).
 */