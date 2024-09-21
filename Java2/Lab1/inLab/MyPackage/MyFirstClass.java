package Java2.Lab1.inLab.MyPackage;

public class MyFirstClass {

    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isStrong(int number) {
        int sum = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10; 
            sum += factorial(digit); 
            number /= 10; 
        }

        // Check if the sum of factorial of digits is equal to the original number
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int number = 145; 
        
        if (isStrong(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }
}

