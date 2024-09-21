package Java2.Lab1.inLab.MyPackage3;

import Java2.Lab1.inLab.MyMathematics.MyIntegerMath;

public class MyDemo {
    public static void main(String[] args) {
        int number = 145; 
        MyIntegerMath obj = new MyIntegerMath();
        
        if (obj.isStrong(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }
}
