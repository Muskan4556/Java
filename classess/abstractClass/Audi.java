package classess.abstractClass;

public class Audi extends LuxuryCar {
    
    public Audi(int mileaga){
        super(mileaga);
    }

    @Override
    public void pressCluch(){
        // its implementation
    }

    @Override
    public void pressDualBreak(){
        // its implementation
        System.out.println("press break");
    }
}

