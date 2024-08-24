package classess.abstractClass;

public abstract class LuxuryCar extends Car {

    LuxuryCar(int mileaga){
        super(mileaga);
    }

    // add more abstract class
    public abstract void pressDualBreak();

    @Override
    public void pressBreak(){
        // implementation
    }
}
