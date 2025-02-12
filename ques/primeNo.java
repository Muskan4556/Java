import java.util.*;
public class primeNo {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n=41;
        int c = 0;

        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                c++;
            }
        }

        if(c == 2){
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

        // OR 

        boolean isPrime = true;

        for (int i = 2; i<=Math.sqrt(n);i++ ){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }


    }
}
