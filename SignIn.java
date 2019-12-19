import java.util.Scanner;

public class SignIn {

    public static void Datareview() {


        System.out.println("Please Select your registration role [1] Student, [2] Lecture");
        Scanner input=new Scanner(System.in);
        int option=input.nextInt();
        if(option==1){
            System.out.println("Student Login Form\n");
            System.out.println("Username : ");
            String un=input.next();
            System.out.println("Password : ");
            String ps=input.next();


        }
        else if (option==2){
            System.out.println("Lectuer Login Form\n");
            System.out.println("Username : ");
            String un=input.next();
            System.out.println("Password : ");
            String ps=input.next();

        }
        else {
            System.out.println("Please Ennter a valid input\n");
            Datareview();
        }

    }

}