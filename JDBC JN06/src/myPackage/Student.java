package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

    // connection establish

    public void createDatabase() {
        // Code for creating database
    	
    	// connection establish

        try {
            String url = "jdbc:mysql://localhost:3306/";
            String userName = "root";
            String password = "Manu*9922";

            Connection conn = DriverManager.getConnection(url, userName, password);

            // Create Statement
            Statement stm = conn.createStatement();

            // create query
            String query = "create database myDatabase";

            // execute query

            // boolean bl = stm.execute(query);

            stm.execute(query);

            System.out.println("Database Created Successfully");

            // connection closed
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    
    public void createData() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String userName = "root";
            String password = "Manu*9922";

            Connection conn = DriverManager.getConnection(url, userName, password);

            // create query
            String query = "INSERT INTO students VALUES(?, ?, ?)";

            // Create PreparedStatement
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, 1); // assuming the first parameter is the roll
            pstm.setString(2, "Manoj Avhad");
            pstm.setString(3, "manoj@gmail.com");
            
            pstm.setInt(1, 2); 
            pstm.setString(2, "Gaurav Pawar");
            pstm.setString(3, "gaurav@gmail.com");
            
            pstm.setInt(1, 3); 
            pstm.setString(2, "Bhushan Harpade");
            pstm.setString(3, "bhushan@gmail.com");
            
            pstm.setInt(1, 4); 
            pstm.setString(2, "Aakash Gorase");
            pstm.setString(3, "aakash@gmail.com");
           

            // execute query
            pstm.executeUpdate(); // Use executeUpdate() for INSERT, UPDATE, DELETE

            System.out.println("Data Inserted Successfully");

            // connection closed
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

	public void readData() {
		 try {
	            String url = "jdbc:mysql://localhost:3306/mydatabase";
	            String userName = "root";
	            String password = "Manu*9922";

	            Connection conn = DriverManager.getConnection(url, userName, password);

	            // create query
	            String query = "select * from students";

	            // Create Statement
	            Statement stm = conn.createStatement();
	            
	            
	           

	            // execute query
	            ResultSet rs = stm.executeQuery(query); 
	            while(rs.next()) {
	            	System.out.println("Id: "+rs.getInt(1));
	            	System.out.println("Name: "+rs.getString(2));
	            	System.out.println("EmailId: "+rs.getString(3));
	            }

	            System.out.println("Read Data Successfully");

	            // connection closed
	            conn.close();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	    }

	public void updateData() {
		try {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String userName = "root";
            String password = "Manu*9922";

            Connection conn = DriverManager.getConnection(url, userName, password);

            // create query
            String query = "UPDATE students set roll = ? where stud_name = ?";

            // Create PreparedStatement
            PreparedStatement pstm = conn.prepareStatement(query);
            
            pstm.setInt(1, 5); 
            pstm.setString(2, "Aakash Gorase");
           

            // execute query
            pstm.executeUpdate(); // Use executeUpdate() for INSERT, UPDATE, DELETE

            System.out.println("Data Updated Successfully");

            // connection closed
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

	public void deleteData() {
		// connection establish

        try {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String userName = "root";
            String password = "Manu*9922";

            Connection conn = DriverManager.getConnection(url, userName, password);

            // Create Statement
            Statement stm = conn.createStatement();

            // create query
            String query = "delete from students where roll = 5 ";

            // execute query

            // boolean bl = stm.execute(query);

            stm.execute(query);

            System.out.println("Data Deleted Successfully");

            // connection closed
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
	}
		
	

