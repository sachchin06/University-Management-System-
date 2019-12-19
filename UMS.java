import java.util.Scanner;

public class UMS {

    public static void main(String[] args) {

        System.out.println("Select, [1] Sign up, [2] Sign in.");
        Scanner input=new Scanner(System.in);
        int option=input.nextInt();
        if(option==1) {
            SignUp sin=new SignUp();
            sin.Dataentry();
        }else if(option==2) {
            SignIn sin=new SignIn();
            sin.Datareview();
        }else {
            System.out.println("Please Ennter a valid input\n");
            main(args);
        }


    }

}
