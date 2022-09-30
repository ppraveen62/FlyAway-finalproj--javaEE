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
 * Servlet implementation class flightsmod
 */
public class flightsmod extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public flightsmod() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<body style=\"background:url(pic2.jpg.jpg)  no-repeat;background-size:100% auto; \">");
		out.println("<div align=\"center\"><i><h1>FlyAway</h1></i></div><br><br><br><br>");
		out.println("<b><a href='adminHome'>Dashboard</a><br></b>");
		out.println("<h3>Flights Trip Details Modification  </h3><br>");
		out.println("<h3>Menu</h3><br>");
		
		out.println("<b><a href='flights.jsp'>Add Flight Details</a><br>");
		out.println("<b><a href='flights2.jsp'>Delete Flight Details</a><br><br>");
		
		
		
		out.println("<table><tr><th><u>Flight No</u></th><th><u>Airline</u>	&nbsp;</th><th>	&nbsp;<u>Depature Time</u>	&nbsp;</th><th>	&nbsp;<u>Source</u>	"
				+ "&nbsp;</th><th>	&nbsp;<u>Destination</u>	&nbsp;</th><th>	&nbsp;<u>Arrival Time</u>	&nbsp;</th><th>	&nbsp;<u>Trip Fare</u></th></tr><br>");
		try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");                                                         
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","root"); 
					Statement smt=con.createStatement();
					ResultSet rs=smt.executeQuery("select * from flightdto");
					
					while(rs.next()) {
						out.println("<tr><th>"+rs.getInt(1) +"	&nbsp;</th><th>	&nbsp;"+rs.getString(2) +"	&nbsp;</th><th>	&nbsp;"+rs.getString(4) +"	&nbsp;</th><th>	&nbsp;"+rs.getString(6) 
						                      +"	&nbsp;</th><th>	&nbsp;"+rs.getString(5) +"	&nbsp;</th><th>	&nbsp;"+rs.getString(3) +"	&nbsp;</th><th>	&nbsp;"+rs.getDouble(7) +"</th></tr>");
						
					}
					out.println("</table><br>");
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
