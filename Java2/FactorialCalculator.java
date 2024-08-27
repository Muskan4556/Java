package Java2;

public class FactorialCalculator {

    public static void main(String[] args) {
        // Check if the number of arguments is correct
        if (args.length != 1) {
            System.out.println("Usage: java FactorialCalculator <number>");
            return;
        }

        // Parse the argument to an integer
        int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: The argument must be an integer.");
            return;
        }

        // Check if the number is negative
        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
            return;
        }

        // Calculate the factorial
        long factorial = calculateFactorial(number);

        // Print the result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Method to calculate the factorial of a given number
    private static long calculateFactorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}


/*
┌──(muskan㉿LENOVO)-[/mnt/d/Complete Java/Java2]
└─$ javac FactorialCalculator.java

┌──(muskan㉿LENOVO)-[/mnt/d/Complete Java/Java2]
└─$ java FactorialCalculator.java 4 55
Usage: java FactorialCalculator <number>

┌──(muskan㉿LENOVO)-[/mnt/d/Complete Java/Java2]
└─$ java FactorialCalculator.java 0
Factorial of 0 is: 1

┌──(muskan㉿LENOVO)-[/mnt/d/Complete Java/Java2]
└─$ java FactorialCalculator.java -1
Error: Factorial is not defined for negative numbers.

┌──(muskan㉿LENOVO)-[/mnt/d/Complete Java/Java2]
└─$ java FactorialCalculator.java 5
Factorial of 5 is: 120

┌──(muskan㉿LENOVO)-[/mnt/d/Complete Java/Java2]
└─$
 */