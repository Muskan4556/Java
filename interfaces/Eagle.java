package interfaces;

public class Eagle implements Bird  {
    
    public void fly(){
        System.out.println("Eagle is flying");
    }

    public void display(){
        System.out.println("Eagle Class");
    }

    @Override
    public String toString(){
        return "Eagle";
    }
}
