
import java.util.*;
import java.util.ArrayList;

public class UMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Welcome to University Management System");
        System.out.println("Please select option to proceed");
        System.out.println("Press [1] Register as a student");
        System.out.println("press [2] Register as a lecture ");
        Scanner input=new Scanner(System.in);        
        
        
        while(input.hasNextInt()){
        int option=input.nextInt();
        if(option==1){
             System.out.println("Name:-");
             String s=input.next();
             System.out.println("AGE:-");
             int age=input.nextInt();
             System.out.println("please select course");
             System.out.println("[1]-SENG 11233-Programming concepts");
             System.out.println("[2]-SENG 11232-Fundamentals of computer");
             System.out.println("[3]-SENG 11223-Statistics");
             int c=input.nextInt();
             Student std = new Student(s,age,c);
             std.printdata();
             
        }
        else if (option==2){
            System.out.println("Name:-");
             String s=input.next();
             System.out.println("AGE:-");
             int age=input.nextInt();
             System.out.println("please select course");
             System.out.println("[1]-SENG 11233-Programming concepts");
             System.out.println("[2]-SENG 11232-Fundamentals of computer");
             System.out.println("[3]-SENG 11223-Statistics");
             int c=input.nextInt();
             lecture lec=new lecture(s,age,c);
             lec.printdata();
            
        }
                }
        
    }
    
}
