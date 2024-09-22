package classess.abstractClass;

public class Audi extends LuxuryCar {
    
    public Audi(int mileaga){
        super(mileaga);
    }

    public int getMileaga() {return mileaga;}

    @Override
    public void pressCluch(){
        // its implementation
    }

    @Override
    public void pressDualBreak(){
        // its implementation
        System.out.println("press break");
    }

    @Override
    public String toString(){
        return "Audi";
    }
}

