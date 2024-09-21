package Java2.Lab1.inLab.MyPackage1;

public class MyDemo {
    public static void main(String[] args) {
        MyIntegerMath obj = new MyIntegerMath();
        int number = 145; 
        
        if (obj.isStrong(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }
}
