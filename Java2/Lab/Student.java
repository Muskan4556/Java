package Java2.Lab;
import java.util.Arrays;
import java.util.Scanner;

public class Student {  
    
    private String name;
    private long id;
    private char gender;
    private String department;
    private final String  validDepartment[] = {"BT","CE", "CSE", "ECE", "EEE", "ECS", "ME", "PE"};

    Student(){
        this.name = "Muskan";
        this.id = 100000000;
        this.gender = 'M';
        this.department = "";
    }

    Student (String name, long id, char gender, String department){
        if(IsValidName(name)){
            this.name = name;
        }else{
            throw new IllegalArgumentException ("Name should string only");
        }
        
        if(IsValidId(id)){
            this.id = id;
        }else{
            throw new IllegalArgumentException ("Id should be positive 9-digit value");
        }

        if(IsValidGender(gender)){
            this.gender = gender;
        }else{
            throw new IllegalArgumentException ("Gender must be M/m or F/f");
        }

        if(IsValidDepartment(department)){
            this.department = department;
        }else{
            throw new IllegalArgumentException ("Department must be one of the following: BT, CE, CSE,ECE, EEE, ECS, ME, PE");
        }
    }

    private boolean  IsValidName(String name){
       return name.matches("[a-zA-Z]+");
    }
    private boolean IsValidId(long id){
        return id > 0 && String.valueOf(id).length()== 9;
    }
    private boolean IsValidDepartment(String dept){
        return Arrays.asList(validDepartment).contains(dept.toUpperCase());
    }
    private boolean IsValidGender(char gender){
        char g = Character.toUpperCase(gender);
        return g=='M' || g=='F';
    }

    @Override
    public String toString(){
        return "Student ID: " + id + "\n" +
               "Name: " + name + "\n" +
               "Gender: " + Character.toUpperCase(gender) + "\n" +
               "Department: " + department.toUpperCase();
    }

    public static Student createFromInput(){
        Scanner sc = new Scanner(System.in);
      
            System.out.println("Enter your id: ");
            long id = sc.nextLong();
    
            sc.nextLine();  
    
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
    
            System.out.println("Enter your gender: ");
            char gender = sc.next().charAt(0);
            sc.nextLine(); 
    
            System.out.println("Enter your department: ");
            String department = sc.nextLine();
    
            return new Student(name, id, gender, department);
    
    }
    

    public static void main(String args[]){
        System.out.println("Enter the number of student you want to create: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student students [] = new Student[n];
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Enter info of student " + (i+1));
            students[i] = Student.createFromInput();
        }

        for(int i = 0; i < n; i++){
            System.out.println(students[i].toString());
            
        }

    }
}

// throw new IllegalArgumentException("ID cannot be a negative number.");