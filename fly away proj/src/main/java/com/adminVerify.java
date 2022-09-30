package com;

import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class adminVerify
 */
public class adminVerify extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private String psd;
	private String eml;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public adminVerify() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub

		String email=request.getParameter("emailid");
	
		String Password=request.getParameter("pswrd");
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");                                                          
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","root");
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from admin");
			
			while(rs.next()) {
				
				if (rs.getString(1).equals(email)) {
					eml=rs.getString(1);
					psd=rs.getString(2);	
					}
				}
		
			
		
			RequestDispatcher rd = null;
			if(Password.equals(psd)&& email.equals(eml)) {
				rd=request.getRequestDispatcher("adminHome");
				rd.forward(request, response);
			}
			else {
				rd=request.getRequestDispatcher("AdminLogin.jsp");
				PrintWriter writer=response.getWriter();
				rd.include(request, response);
				writer.println(("<center> <span style = 'color:red'> Invalid Credentials </span> </center>"));
			}


		}
		catch (Exception e){
			System.out.println(e);

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
