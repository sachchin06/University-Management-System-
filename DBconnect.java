import java.sql.*;
public class DBconnect {

    Connection con;
    Statement st;
    ResultSet rs;

    public DBconnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UMS","root","");
            st = con.createStatement();
        }catch(Exception ex) {
            System.out.println("Erro : "+ex);
        }
    }

    public void getData(String u, String p) {
        try {

            String query = "select * from member,course where Username=? AND Password =?";
            PreparedStatement detail = con.prepareStatement(query);
            detail.setString(1, u);
            detail.setString(2, p);
            rs = st.executeQuery(query);
            System.out.println("Records from Database");
            while(rs.next()) {
                String name = rs.getString("Name");
                String course = rs.getString("C_number");
                System.out.println("Hi"+name+ "\n");
                System.out.println("You have successfully registered for following courses :\n"+course+ "\n");
            }

        }catch(Exception ex) {
            System.out.println(ex);
        }

    }

    public void enterData(String us,String ps, String n,int age,int cn)
    {
        try
        {

            String query1 = " insert into member (Username, Password, Name, Age)" + " values (?, ?, ?, ?)";


            PreparedStatement member = con.prepareStatement(query1);
            member.setString (1, us);
            member.setString (2, ps);
            member.setString (3, n);
            member.setInt(4, age);

            member.execute();

            String query2 = " insert into member_course " + " values (?, ?)";


            PreparedStatement member_course = con.prepareStatement(query2);
            member_course.setString (1, us);
            member_course.setInt (2, cn);




            member_course.execute();

            con.close();
            System.out.println("You Successfully Register for the course");
        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }

}
