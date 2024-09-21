package Java2;

public class Overloading {
    
    static void sum(){
        System.out.println("method_1");
    }  

    static void sum(int a){
        System.out.println("method_2 and value of a is: " + a);
    }
    
    static void sum(double a){
        System.out.println("method_3 and value of a is: " + a);
    }  

    static void sum(String a){
        System.out.println("method_4 and value of a is: " + a);
    } 
    
    static void sum(int a, double b){
        System.out.println("method_5 and value of a is: " + a);
    } 

    static void sum(double a, int b){
        System.out.println("method_6 and value of a is: " + a);
    } 

    // Variable number of args method
    public double sum (double x, double ...a){
        double sum = 0.0;
        for(int i=0; i<a.length;i++){
            sum += a[i];
        }
        return sum + x;
    }

    public static void main(String[] args) {
        Overloading.sum();
        Overloading.sum(0);
        Overloading.sum(0.0);
        Overloading.sum("Hello");
        Overloading.sum(0, 0.0);
        Overloading.sum(0.0, 0);

        Overloading obj = new Overloading();
        System.out.println(obj.sum(50.2,60.4,70.8));
    }
}
