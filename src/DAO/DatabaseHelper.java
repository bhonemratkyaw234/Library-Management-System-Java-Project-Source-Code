package DAO;

import java.sql.*;
public class DatabaseHelper {
    public static Connection getConnection(){
        try {
            // Correct driver class for MySQL 8+
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Make sure database name is correct
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/library_management","root","selena007gomax");
            return con;
        } catch (Exception e) {
            System.err.println("Connection error: " + e.getMessage());
            return null;
        }
    }
}