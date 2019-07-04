package Java;
import java.sql.*;
import java.util.Scanner;

public class UpdateInfo
{
    public static void main(String args[])
    {  Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID to update:");
        String user_id = sc.nextLine();
        System.out.println("Enter Address to update");
        String user_address = sc.nextLine();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/CURD", "root", "new-password");
            Statement stmt = con.createStatement();
            String q1 = "UPDATE user_info set user_address = '" + user_address +
                    "' WHERE user_id = '" +user_id+ "'";
            int x = stmt.executeUpdate(q1);

            if (x > 0)
                System.out.println("Address Updated Successfully Updated");
            else
                System.out.println("ERROR OCCURED :(");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
