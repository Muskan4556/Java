
import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        Set<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int uniqueArr [] = set.stream().mapToInt(Integer :: intValue).toArray();

        System.out.println(Arrays.toString(uniqueArr));
    }
}


// Fibonacci sequence
// Binary Search 