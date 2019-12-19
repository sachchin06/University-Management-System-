public class Course {

    String s1="SENG 11111-Introduction to programming";
    String s2="SENG 11112-Fundamentals of Engineering";
    String s3="SENG 11113-Data Structures and Algorithem";


    public void Courseno(int x){
        switch(x){
            case 1:
                System.out.println("Subject:"+s1);
                break;
            case 2:
                System.out.println("Subject:"+s2);
                break;
            case 3:
                System.out.println("Subject:"+s3);
                break;
        }
    }

}