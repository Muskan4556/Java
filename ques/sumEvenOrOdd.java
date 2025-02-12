public class sumEvenOrOdd {
    /*
     Calculate and display the sum of even and odd numbers in an array.
        Input : [1, 2 , 3, 4, 5, 6]
    Output :
        Sum of even numbers: 12
        Sum of odd numbers: 9
     */

     public static void main(String[] args) {

        int sumOdd = 0;
        int sumEven = 0;

        int arr[] = {1, 2 , 3, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0){
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }

        System.out.println("odd: " + sumOdd );
        System.out.println("even: " + sumEven );
     }
}
