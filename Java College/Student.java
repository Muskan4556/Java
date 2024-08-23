import java.util.Scanner;
import java.util.Arrays;

public class Student {
    private long id;
    private String name;
    private char gender;
    private String branch;
    private String[] validBranches  = {"ESE", "CSE", "ME","ECSE","CE","BT","EEE"};

    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID:");
        this.id = sc.nextInt();
        System.out.println("Enter Student Name:");
        this.name = sc.next();
        System.out.println("Enter Student Gender:");
        char gender = sc.next().charAt(0);
        if(gender == 'M' ||gender == 'm' || gender == 'F' || gender == 'f' ){
            this.gender = gender;
        }
        else{
            System.out.println("Gender should be M/m or F/f");
        }
        System.out.println("Enter Student Branch:");
         String branch = sc.next();
         if (Arrays.asList(validBranches).contains(branch)) {
            this.branch = branch;
        } else {
            System.out.println("Invalid Branch");
            this.branch = "Invalid";
        }
    }


    public Student(long id, String name, char gender, String branch) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        if(branch == "ESE" || branch == "CSE" ||branch == "ME"||branch == "ECSE" || branch == "CE"||branch == "BT"||branch == "EEE") {
            this.branch = branch;
        }else{
            this.branch = "invalid";
        }
        
    }

    public void setId(long id) {
        this.id = id;	    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
            this.name = name;
    }

    public String getName() {
        return name;
    }
   
    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.out.println("Gender must be either M or F.");
        }
    }

    public char getGender() {
        return gender;
    }

    public void setBranch(String branch) {
        
        if(branch == "ESE" || branch == "CSE" ||branch == "ME"||branch == "ECSE" || branch == "CE"||branch == "BT"||branch == "EEE") {
            this.branch = branch;
        }else {
            System.out.println("Branch Invalid");
        }
    }

    public String getBranch() {
        return branch;
    }

 
    public String toString() {
        return "Student ID: " + id + "\n" +
               "Name: " + name + "\n" +
               "Gender: " + gender + "\n" +
               "Branch: " + branch;
    }

public static void main(String[] args) {
    // TODO Auto-generated method stub
         Student student1 = new Student();
        Student student2 = new Student(987654321, "abc", 'M', "CSE");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
}

}
