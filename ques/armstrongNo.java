public class armstrongNo {
    public static void main(String[] args) {
        int n = 153;
        /*
         * A number is called an Armstrong number (or narcissistic number) if the sum of its own digits each raised to the power of the number of digits equals the number itself.
         eg - 153  --- to digit = 3
         1^3 + 5^3 + 3^3 == 153 → Armstrong Number
         */

         int originalNo = n;
         double sum = 0;

         // convert integer → String
         int totalDigits = Integer.toString(n).length();

         while (n > 0){
            int lastDigit = n%10;
            sum = sum + Math.pow(lastDigit, totalDigits);
            n = n/10; // remaining no 
         }

           // Check if the sum is equal to the original number
        if (sum == originalNo) {
            System.out.println(originalNo + " is an Armstrong number.");
        } else {
            System.out.println(originalNo + " is not an Armstrong number.");
        }
    }
}
