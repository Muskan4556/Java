package Java2.Lab2;

import java.util.Scanner;
import java.util.Arrays;

public class Student {
    private long id;
    private String name;
    private char gender;
    private String branch;
    private static final String[] validBranches = {"ESE", "CSE", "ME", "ECSE", "CE", "BT", "EEE"};

    // Default constructor                                                                                           
    public Student() {}

    public Student(long id, String name, char gender, String branch) {
        if (isValidId(id)) {
            this.id = id;
        } else {
            this.id = -1; 
        }

        if (isValidName(name)) {
            this.name = name;
        } else {
            this.name = "Invalid";
        }

        if (isValidGender(gender)) {
            this.gender = Character.toUpperCase(gender);
        } else {
            System.out.println("Gender must be either M or F.");
            this.gender = 'I'; 
        }

        if (isValidBranch(branch)) {
            this.branch = branch.toUpperCase();
        } else {
            this.branch = "Invalid";
        }
    }

    private boolean isValidId(long id) {
        return String.valueOf(id).length() == 9;
    }

    // Method to check if the name is valid
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z ]+");
    }

    // Method to check if the gender is valid
    private boolean isValidGender(char gender) {
        char upperCaseGender = Character.toUpperCase(gender);
        return upperCaseGender == 'M' || upperCaseGender == 'F';
    }

     // Method to check if the branch is valid
     private boolean isValidBranch(String branch) {
        String normalizedBranch = branch.toUpperCase();
        return Arrays.asList(validBranches).contains(normalizedBranch);
    }

    public void setId(long id) {
        if (isValidId(id)) {
            this.id = id;
        } else {
            System.out.println("ID should be a 9-digit number.");
        }
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        if (isValidName(name)) {
            this.name = name;
        } else {
            System.out.println("Name should not contain special characters or digits.");
        }
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        if (isValidGender(gender)) {
            this.gender = Character.toUpperCase(gender);
        } else {
            System.out.println("Gender must be either M or F.");
            this.gender = 'I'; // Invalid gender
        }
    }

    public char getGender() {
        return gender;
    }

    public void setBranch(String branch) {
        if (isValidBranch(branch)) {
            this.branch = branch.toUpperCase();
        } else {
            this.branch = "Invalid";
        }
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + "\n" +
               "Name: " + name + "\n" +
               "Gender: " + gender + "\n" +
               "Branch: " + branch;
    }

    // Method to create a Student object from user input
    public static Student createFromInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        long id = sc.nextLong();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter Student Branch: ");
        String branch = sc.next();

        return new Student(id, name, gender, branch); 
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(987654321, "Alice Johnson", 'M', "CSE");
        System.out.println(student1.toString());
        System.out.println();
        System.out.println(student2.toString());
       
    }
}

