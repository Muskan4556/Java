package Java2;

public class Student1 {
    private long id;
    private String name;
    private double marks1;
    private double marks2;
    private double marks3;
     double total; 

    Student1(){
        this.id = 0;
        this.name = "";
        this.marks1 = 0.0;
        this.marks2 = 0.0;
        this.marks3 = 0.0;
        this.total = 0.0;
    }

    Student1(long id, String name, double m1,double m2, double m3){
        this.id = id;
        this.name = name;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
        this.total = totalMarks();
    }

    public double totalMarks(){
        return this.marks1 + this.marks2 + this.marks3;
    }


    public void setId(long id){
        this.id = id;
    }

    public long getId(){return this.id;}

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setMarks1(double m1){
        this.marks1 = m1;
    }
    public void setMarks2(double m2){
        this.marks2 = m2;
    }
    public void setMarks3(double m2){
        this.marks2 = m2;
    }

    public double getMarks1(){return this.marks1;}
    public double getMarks2(){return this.marks2;}
    public double getMarks3(){return this.marks3;}

    

    public String toString(){
        return (
            "ID: " + this.id + "\n" +
            "Name: " + this.name + "\n" +
            "Marks1: " + this.marks1 + "\n" +
            "Marks2: " + this.marks2 + "\n" +
            "Marks3: " + this.marks3 + "\n" +
            "Total:" + this.total + "\n"
        );
    }

    public static void main(String[] args) {
        // Student1 s1 = new Student1();
        Student1 s1 = new Student1(1234567890,"abc",77.57,90.25,98.48);
        System.out.println(s1.toString());
        System.out.println(s1.totalMarks());

    }
}
