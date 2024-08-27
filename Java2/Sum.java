package Java2;

// 

public class Sum {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++ ){
            System.out.println(args[i]);
        }
        
        // Write a java program to add 2 integer through CLA. --> Wrapper Class
        // System.out.println(args[0]+args[1]); // input 2,4 o/p - 24
        if(args.length == 2){
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int sum = a + b;

            System.out.println("Sum: " + sum);
        }
        else{
            System.out.println("Wrong number of args");
        }
    }
}


/*
 D:\Java College\Java\JavaCollege>javac Sum.java

D:\Java College\Java\JavaCollege>java Sum.java welcome Amity
welcomeAmity

D:\Java College\Java\JavaCollege>java Sum.java welcome Amity patna              
welcome
Amity
patna

D:\Java College\Java\JavaCollege>java Sum.java "Amity University" patna 
Amity University
patna


Or cmd
C:\Users\muska\Downloads>javac Sum.java

C:\Users\muska\Downloads>java Sum welcome Amity
welcomeAmity


 */