package Java2.Lab1.inLab.MyMathematics;

public class MyIntegerMath {
    public  int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public  boolean isStrong(int number) {
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
}
