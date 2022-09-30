package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class listairlines
 */
public class listairlines extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listairlines() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<body style=\"background:url(pic2.jpg.jpg)  no-repeat;background-size:100% auto; \">");
		out.println("<div align=\"center\"><i><h1>FlyAway</h1></i></div><br><br>");
		out.println("<br><br><b><a href='adminHome'>Dashboard</a></b><br><br>");
		out.println("<h3>List of Airlines  </h3>");
		out.println("<table><tr><th><u>Airline</u></th></tr><br>");
		try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");                                                         
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","root"); 
					Statement smt=con.createStatement();
					ResultSet rs=smt.executeQuery("select distinct airline from flightdto");
					
					while(rs.next()) {
						out.println("<th>"+rs.getString(1)+"</th></tr>");
						
					}
					out.println("</table>");
					smt.close();
					con.close();
					
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
