import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

class WhatIsJdbc{
    public static void main(String args[]) {
        System.out.println("Hello InfoWorld");

        Class.forName("com.mysql.cj.jdbc.Driver"); 
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
    }
}