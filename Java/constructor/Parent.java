package constructor;

public class Parent {
    int id;
    String name;

    Parent(){
        System.out.println("Parent class constructor called with no args");
        this.name = "";
        this.id =0;
    }

    Parent(int id, String name){
        this.name = name;
        this.id =id;
    }

    public void display(){
        System.out.println("Parent class id: "+id+" name: "+name);
    }
}
