package classess.abstractClass;

public class Main {
    
    public static void main(String[] args) {
        // We can not create an instance of abstract class.
        // Car carObj = new Car(4); // error
        // LuxuryCar luxuryObj = new LuxuryCar(4); // error

        Audi obj1 = new Audi(45);
        System.out.println(obj1.mileaga);
        System.out.println(obj1.getNoOfWheels());
        
        Car carObj = new Audi(78);
        System.out.println(carObj.mileaga);
        System.out.println(carObj.getNoOfWheels());

        LuxuryCar luxuryCarObj =  new Audi(98);
        System.out.println(luxuryCarObj.mileaga);
        System.out.println(luxuryCarObj.getNoOfWheels());
        luxuryCarObj.pressDualBreak();

    }
}
