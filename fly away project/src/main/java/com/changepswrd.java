package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class changepswrd
 */
public class changepswrd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public changepswrd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String psd =request.getParameter("upswrd");
		
		PrintWriter out=response.getWriter();
		if (psd!="") {
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");                                                         
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","root"); 
				PreparedStatement smt =con.prepareStatement("update admin set Password=? where EmailId=?");  //updating db
				
				smt.setString(1,psd);
				smt.setString(2,"admin@flyaway.com");
				smt.execute();
				
			}
			catch (Exception e){
				System.out.println(e);
				
			}
			
			
			
			RequestDispatcher rd =request.getRequestDispatcher("AdminLogin.jsp");
			rd.include(request, response);
			out.println("<center> <span style = 'color:green'> password changed sucessfully </span> </center>");
			
		}
		
		if (psd=="") {
			
			RequestDispatcher rd =request.getRequestDispatcher("changepassword.jsp");
			rd.include(request, response);
			out.println("<center> <span style = 'color:red'> Missing Inputs </span> </center>");	
			
		}
		
			
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
