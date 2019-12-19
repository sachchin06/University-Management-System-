import java.util.Scanner;

public class SignUp {

    public static void Dataentry() {

        System.out.println("Please Select your registration role [1] Student, [2] Lecture");
        Scanner input=new Scanner(System.in);


        while(input.hasNextInt()){
            int option=input.nextInt();
            if(option==1){
                System.out.println("Student Registration Form\n");
                System.out.println("Username : ");
                String un=input.next();
                System.out.println("Password : ");
                String ps=input.next();
                System.out.println("Name :");
                String s=input.next();
                System.out.println("Age :");
                int age=input.nextInt();
                System.out.println("please select course");
                System.out.println("[1]-SENG 11111-Introduction to programming");
                System.out.println("[2]-SENG 11112-Fundamentals of Engineering");
                System.out.println("[3]-SENG 11113-Data Structures and Algorithem");
                int c=input.nextInt();
                DBconnect ct = new DBconnect();
                ct.enterData(un,ps,s,age,c);

            }
            else if (option==2){
                System.out.println("Lecturer Registration Form\n");
                System.out.println("Username : ");
                String un=input.next();
                System.out.println("Password : ");
                String ps=input.next();
                System.out.println("Name:");
                String s=input.next();
                System.out.println("Age:");
                int age=input.nextInt();
                System.out.println("please select course");
                System.out.println("[1]-SENG 11111-Introduction to programming");
                System.out.println("[2]-SENG 11112-Fundamentals of Engineering");
                System.out.println("[3]-SENG 11113-Data Structures and Algorithem");
                int c=input.nextInt();
                DBconnect ct = new DBconnect();
                ct.enterData(un,ps,s,age,c);

            }
            else {
                System.out.println("Please Ennter a valid input\n");
                Dataentry();
            }
        }
    }

}
