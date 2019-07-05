package Java;
import java.sql.*;
import java.util.Scanner;

public class DeleteInfo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID to delete:");
        String user_id = sc.nextLine();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/CURD", "root", "new-password");
            Statement stmt = con.createStatement();

            String q1 = "DELETE from user_info WHERE user_id = '" + user_id +
                    '\'';

            int x = stmt.executeUpdate(q1);

            if (x > 0)
                System.out.println("One User Successfully Deleted");
            else
                System.out.println("ERROR OCCURED :(");

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public void delete() {
    System.out.println("enter id which record you want to delete");
    int id1=sc.nextInt();
    try {

        Class.forName("com.mysql.jdbc.Driver");
        try (Connection conn =
                     DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata",
                             "root", "new-password")) {


            Statement st = conn.createStatement();

            int a=st.executeUpdate("DELETE FROM userinfo WHERE id="+id1+"");

            System.out.println("ajsjbdkjasnda");

        }
    } catch (Exception e) {
        System.err.println("Something went wrong!");
        e.printStackTrace();
    }
}
