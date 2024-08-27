package Java2;

import java.util.Scanner;

public class CuboidArray {
    public static void main(String[] args) {
        // Cuboid arr[]; // declaration
        // arr = new Cuboid[5]; // array creation

        // // Create an array of Cuboid objects
        // Cuboid[] cuboids = new Cuboid[3];

        // // Initialize each Cuboid object with dimensions
        // cuboids[0] = new Cuboid(3, 4, 5);
        // cuboids[1] = new Cuboid(6, 7, 8);
        // cuboids[2] = new Cuboid();

        // // Print the details of each Cuboid
        // for (int i = 0; i < cuboids.length; i++) {
        //     System.out.println("Cuboid " + (i + 1) + ": " + cuboids[i]);
        // }

         Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of cuboids: ");
        int n = sc.nextInt();
        
        // Create an array to hold Cuboid objects
        Cuboid cuboids[] = new Cuboid[n];

        // Read data and create Cuboid objects
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Cuboid " + (i + 1) + ":");
            cuboids[i] = Cuboid.createFromInput();
        }

        // Print details of all Cuboid objects
        System.out.println("\nCuboid Details:");
        for (int i = 0; i < cuboids.length; i++) {
            System.out.println("Cuboid " + (i + 1) + ": " + cuboids[i]);
        }
    }
}

/*
package Java2;

import java.util.Scanner;

public class CuboidArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of cuboids: ");
        int n = sc.nextInt();
        
        // Create an array to hold Cuboid objects
        Cuboid[] cuboids = new Cuboid[n];

        // Method to create a Cuboid object from user input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Cuboid " + (i + 1) + ":");
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter breadth: ");
            double breadth = sc.nextDouble();
            System.out.print("Enter height: ");
            double height = sc.nextDouble();
            cuboids[i] = new Cuboid(length, breadth, height);
        }

        // Print details of all Cuboid objects
        System.out.println("\nCuboid Details:");
        for (int i = 0; i < cuboids.length; i++) {
            System.out.println("Cuboid " + (i + 1) + ": " + cuboids[i]);
        }
        
        sc.close(); // Close the Scanner
    }
}

*/