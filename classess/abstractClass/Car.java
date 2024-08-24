package classess.abstractClass;;

public abstract class Car {
    int mileaga;

    Car(int mileaga){
        this.mileaga = mileaga;
    }

    public abstract void pressBreak();

    public abstract void pressCluch();

    public int getNoOfWheels(){ 
        return 4;
    }
}

/*
 * The type Car must be an abstract class to define abstract methods
 */