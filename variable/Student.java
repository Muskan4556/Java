package variable;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee empObj = new Employee();
        empObj.setId(10);
        System.out.println(empObj.getId()); // 10
        empObj.empId = 22;
        System.out.println(empObj.getId()); // 22 
        modifyId(empObj);
        System.out.println(empObj.getId()); // 1001

        Employee obj = empObj;
        // now obj and empObj both point to the same Employee object in memory.
        obj.setId(0);
        System.out.println(obj.getId()); // 0
        System.out.println(empObj.getId()); // 0

        // -----------------------------------------------------------------------------------

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1 == s2); // check if they are pointing to the sam memory in heap// true - same memory location because of String constant pool / they referring to the same String object in the String pool.

        System.out.println(s1.equals(s2)); // check values equal or not // true

        System.out.println(s1 == s3); // false - because -> "new" keyword -> creates a new object in the heap, even if the content is the same.
        System.out.println(s1.equals(s3)); // true - check values(content) equal or not // true

        // --------------------------------------------------------------------------------------

        Person softwareEngineer = new Engineer();
        Person teacher = new Teacher();
        Teacher teacher1 = new Teacher();
        Engineer engineer = new Engineer();
        // In interface, we cannot create a object of an interface
            // Interface - define blueprint, that must be implemented by child classes
        // Engineer eg1 = new Person(); // error

        // -------------------------------------------------------------------------------------
        
        // int [] arr = new int[5];
        int arr [] = new int[5];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // System.out.println(arr[0]);

        // Input from user 
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // print 
        for(int i=0; i<arr.length; i++){
            System.out.println("array value at index - " + i + ": " + arr[i]);
        }

        int arr1 [] = {20,45,77,98};
        for(int i=0; i<arr1.length;i++){
            System.out.println("array value at index - " + i + ": " + arr1[i]);
        }

        // 2D array
        int rows = 3;
        int columns = 2;
        int arr2 [][] = new int[rows][columns];
        arr2[0][0] = 10;
        arr2[0][1] = 20;
        arr2[1][0] = 30;
        arr2[1][1] = 40;
        arr2[2][0] = 50;
        arr2[2][1] = 60;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.println("array value at index - " + i + "," + j + ": " + arr2[i][j]);
            }
        }

        int arr3[][] = {{20,40,30},{60,77,88} };
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.println("array value at index: - " + i + "," + j + ": " + arr3[i][j]);
            }
        }
    }

    private static void modifyId(Employee emp){
        emp.empId = 1001;
    }
}

/*

In Java, everything is pass by a value. So with the help of reference variable, we are achieving the functionality of pointers in c++.

*/