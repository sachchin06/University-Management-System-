public class Lecturer {

    String name;
    int age;
    int course;
    int i=0;


    public Lecturer(String s1,int AGE,int Course){
        this.name=s1;
        this.age=AGE;
        this.course=Course;

    }
    public void printdata(){
        System.out.println("Welcome to university registration System");
        System.out.printf("\n\n....");
        System.out.println("lecture Registration completed");
        System.out.printf("Name   :%s\n",name);
        System.out.printf("Age    :%d\n",age  );
        Course my=new Course();
        my.Courseno(course);

    }

}