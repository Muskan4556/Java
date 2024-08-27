package Java2;

public class SumAndAverageCalculator {

    public static void main(String[] args) {
        // Check if there are command line arguments
        if (args.length == 0) {
            System.out.println("Usage: java SumAndAverageCalculator <num1> <num2> ... <numN>");
            return;
        }

        // Initialize variables to store the sum and count of numbers
        int sum = 0;
        int count = args.length;

        // Iterate through command line arguments using a for loop to calculate the sum
        for (int i = 0; i < args.length; i++) {
            try {
                // Parse the argument to an integer
                int number = Integer.parseInt(args[i]);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Error: All arguments must be integers.");
                return;
            }
        }

        // Calculate the average
        double average = (double) sum / count;

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

/*
┌──(muskan㉿LENOVO)-[/mnt/d/Complete Java/Java2]
└─$ javac SumAndAverageCalculator.java

┌──(muskan㉿LENOVO)-[/mnt/d/Complete Java/Java2]
└─$ java SumAndAverageCalculator.java 10 20 30 40 50
Sum: 150
Average: 30.0
 */