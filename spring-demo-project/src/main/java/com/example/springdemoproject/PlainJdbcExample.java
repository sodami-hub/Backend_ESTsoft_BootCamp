package com.example.springdemoproject;

import java.sql.*;

public class PlainJdbcExample {
    static final String DB_URL = "jdbc:mysql://localhost:3306/jpa_lecture";
    static final String USER = "root";
    static final String PASS = "admin";
    static final String QUERY = "SELECT * FROM student";

    public static void main(String[] args) {
        //Open & Get a connection
        try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            //Extract data from result set after execute query
            while(rs.next()) {
                // Retrieve by column name
                System.out.print("ID : "+rs.getLong("id"));
                System.out.print(", name : " + rs.getString("name"));
                System.out.print(", Age : " + rs.getInt("age"));
                System.out.println(", dec : " + rs.getString("desc"));
            }
        }catch(SQLException e) {
            System.out.println(e.getErrorCode());
            System.out.println(e.getMessage());
        }
    }
}