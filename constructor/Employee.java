package constructor;

public class Employee {
    int id;
    String name;

    // // no args
    // Employee(){
    //     id = 0;
    //     name="";
    // }

    // // parametrized
    // Employee(int id){
    //     this.id = id;
    // }

    // // overloading
    // Employee(int id , String name){
    //     this.id = id;
    //     this.name = name;
    // }

    void display(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
    }

    // This private constructor ensures that objects cannot be created from outside this class.
    private Employee(){
        id = 0;
        name = "";
    } 

    // getInstance() provides a controlled way to access the Employee instance (Singleton pattern)
    public static Employee getInstance(){ // Employee return type
        return new Employee();
    }


} 
