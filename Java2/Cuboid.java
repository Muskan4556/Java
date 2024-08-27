package Java2;

import java.util.Scanner;

public class Cuboid {
    private double length;
    private double breadth;
    private double height;

    // Default constructor
    public Cuboid() {
        this.length = 0;
        this.breadth = 0;
        this.height = 0;
    }

    // Parameterized constructor
    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to set dimensions
    public void setDimensions(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to get volume
    public double getVolume() {
        return length * breadth * height;
    }

    // Method to get dimensions as a string
    @Override
    public String toString() {
        return "Cuboid [length=" + length + ", breadth=" + breadth + ", height=" + height + ", volume=" + getVolume() + "]";
    }

     // Static method to create a Cuboid object from user input
    public static Cuboid createFromInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        return new Cuboid(length, breadth, height);
    }
}
