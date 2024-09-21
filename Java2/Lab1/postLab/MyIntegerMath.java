package Java2.Lab1.postLab;

public class MyIntegerMath {

    public int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public boolean isArmstrong(int number) {
        int numDigits = countDigits(number);
        int sum = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        MyIntegerMath math = new MyIntegerMath();
        int number = 153;

        System.out.println("Number of digits in " + number + ": " + math.countDigits(number));

        if (math.isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

