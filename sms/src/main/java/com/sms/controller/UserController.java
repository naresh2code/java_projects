package com.sms.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Welcome to Incedo!--");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		System.out.println(request.getParameter("fname"));
		System.out.println(request.getParameter("lname"));
		System.out.println(request.getParameter("email"));
		insertEmployee(102,fname,lname,email);
		System.out.println("Record Inserted successfully");
		response.getWriter().append("Success ");
	}

	
	private final String SQL_INSERT = "INSERT INTO student (id,first_name,last_name,email) VALUES (?,?,?,?)";

    public void insertEmployee(int id,String fname,String lname,String email) {
    	Connection conn=null;
    	PreparedStatement preparedStatement=null;
        try{
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tradb", "root", "admin123");
            preparedStatement = conn.prepareStatement(SQL_INSERT);
            
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, fname);
            preparedStatement.setString(3, lname);
            preparedStatement.setString(4, email);
       
            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println(row); //1

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
        	if(preparedStatement!=null) {
        		try {
        			preparedStatement.close();
        		}catch(SQLException e) {
        			e.printStackTrace();
        		}
        	}
        	if(conn!=null) {
        		try {
        			conn.close();
        		}catch(SQLException e) {
        			e.printStackTrace();
        		}
        	}
        }

    }
}
