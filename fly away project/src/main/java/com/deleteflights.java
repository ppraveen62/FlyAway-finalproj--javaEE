package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleteflights
 */
public class deleteflights extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteflights() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fno =request.getParameter("flightno");
		if (fno=="") {
			fno = "0";
		}
		
		int flightno=Integer.parseInt(fno);	
		PrintWriter out =response.getWriter();
		
		try {	
			Class.forName("com.mysql.cj.jdbc.Driver");                                                         
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","root"); 
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from flightdto");
			
		
			int i=0;
			
			while(rs.next()) {
				
				if (rs.getInt(1)==flightno) {
					i+=1;
					
				}	
			}
			
		
		
	
		if (flightno!=0 ) {
					
				PreparedStatement stmt=con.prepareStatement("delete from flightdto where flightno =?");
				
				stmt.setInt(1,flightno);
			
				stmt.execute();
				
				stmt.close();
				con.close();
			
			}
		
	
		if (flightno!=0 && i!=0) {
			
			RequestDispatcher rd =request.getRequestDispatcher("flights2.jsp");
			rd.include(request, response);
			out.println("<center> <span style = 'color:green'> Flight No "+flightno+" is deleted </span> </center>");
			
			}
			
			if (flightno==0 || i==0) {
				
				RequestDispatcher rd =request.getRequestDispatcher("flights2.jsp");
				rd.include(request, response);
				out.println("<center> <span style = 'color:red'> check Inputs </span> </center>");	
				
			}
			
		}
		
		catch(Exception e){
			e.printStackTrace();
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
