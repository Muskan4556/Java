package Java2.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

    public int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; 
            }
        }
        return -1; 
    }

    public int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == key) {
                return mid; 
            }
            
            if (array[mid] < key) {
                left = mid + 1;
            }
            
            else {
                right = mid - 1;
            }
        }
        return -1; 
    }

    public  void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Main method
    public static void main(String[] args) {
        int a[] = {5, 22, 8, 14, 9};
        int k1 = 24, k2 = 8, k3 = 9; 

        Demo obj = new Demo();
        int r1 = obj.linearSearch(a, k1);
        int r2 = obj.binarySearch(a, k2);

        if(r1 == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Found" );
        }

        if(r2 == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Found" );
        }
        
        obj.bubbleSort(a);
        System.out.println("Sorted Array: " + Arrays.toString(a));
    }
}

