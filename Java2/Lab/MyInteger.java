package Java2.Lab.notes;

import java.math.BigInteger;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public boolean equals(int num) {
        return this.value == num;
    }

    public boolean equals(MyInteger obj) {
        return this.value == obj.getValue();
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger obj) {
        return obj.isEven();
    }
    public static boolean isOdd(MyInteger obj) {
        return obj.isOdd();
    }

    public static boolean isPrime(MyInteger obj) {
        return obj.isPrime();
    }

    public static int parseInt(char[] chars) {
        String numStr = new String(chars);
        return Integer.parseInt(numStr);
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        MyInteger num = new MyInteger(7);

        System.out.println("Value: " + num.getValue());
        System.out.println("Is Even: " + num.isEven());
        System.out.println("Is Odd: " + num.isOdd());
        System.out.println("Is Prime: " + num.isPrime());

        System.out.println("\nStatic Methods:");
        System.out.println("Is 14 even: " + MyInteger.isEven(14));
        System.out.println("Is 15 odd: " + MyInteger.isOdd(15));
        System.out.println("Is 29 prime: " + MyInteger.isPrime(29));

        MyInteger anotherNum = new MyInteger(7);
        System.out.println("\nIs num equal to 7: " + num.equals(7));
        System.out.println("Is num equal to anotherNum: " + num.equals(anotherNum));

        char[] charArray = {'1', '2', '3'};
        System.out.println("\nParsed char array '123' to int: " + MyInteger.parseInt(charArray));

        String strNum = "456";
        System.out.println("Parsed string '456' to int: " + MyInteger.parseInt(strNum));

        int factorialInput = 5;
        BigInteger factorialResult = MyInteger.factorial(factorialInput);
        System.out.println("\nFactorial of " + factorialInput + ": " + factorialResult);
    }
}

