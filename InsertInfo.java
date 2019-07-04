package Java;

import java.sql.*;
import java.util.Scanner;

public class InsertInfo {
    public static void insert()
    {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Details:\n Enter User ID");
            String user_id = sc.nextLine();
            System.out.println("Enter User Name:");
            String user_name = sc.nextLine();
            System.out.println("Enter Address:");
            String user_address = sc.nextLine();

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/CURD", "root", "new-password");
                Statement stmt = con.createStatement();

                // Inserting data in database
                String q1 = "insert into user_info values('" + user_id + "', '" + user_name +
                        "', '" + user_address + "')";
                int x = stmt.executeUpdate(q1);
                if (x > 0)
                    System.out.println("Successfully Inserted");
                else
                    System.out.println("Insert Failed");

                con.close();
            } catch (Exception e) {
                System.out.println(e);

            }

    }
}