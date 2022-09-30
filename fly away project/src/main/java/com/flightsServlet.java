package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class flightsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String person;
	

	

    /**
     * @see HttpServlet#HttpServlet()
     */
    public flightsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out =response.getWriter();
			String sDate1=request.getParameter("udate");
			Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
			String from=request.getParameter("ufrom");
			String to=request.getParameter("uto");
			person=request.getParameter("uperson");
			
			
		
	
			out.println("<body style=\"background:url(pic2.jpg.jpg)  no-repeat;background-size:100% auto; \">");
			out.print("<div align=\"center\"><i><h1>FlyAway</h1></i></div><br>");
			out.print("<div align=\"center\"><b>From : </b>"+from+"    &#8594;   <b>To : </b>"+to+"<br><br><b>Depature Date : </b>"+date1 +"</div><br>   ");
			
		
			
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");                                                         
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","root"); 
				Statement smt=con.createStatement();
				
				ResultSet rs=smt.executeQuery("select * from flightdto where source=\""+from+"\" and destination=\""+to+"\";");
				
				out.println("<div align=\"center\"><table>");
				out.println("<table><tr><th><u>Flight No</u></th><th>&nbsp;<u>Airline</u>	&nbsp;</th><th>	&nbsp;<u>Depature Time</u>	&nbsp;</th><th>	&nbsp;<u>Source</u>	"
						+ "&nbsp;</th><th>	&nbsp;<u>Destination</u>	&nbsp;</th><th>	&nbsp;<u>Arrival Time</u>	&nbsp;</th><th>	&nbsp;<u>Trip Fare</u>&nbsp;</th></tr><br><br>");
				
				
				while(rs.next()) {
					
					
					out.println("<tr><th>"+rs.getInt(1) +"	&nbsp;</th><th>	&nbsp;"+rs.getString(2) +"	&nbsp;</th><th>	&nbsp;"+rs.getString(4) +"	&nbsp;</th><th>	&nbsp;"+rs.getString(6) 
					              +"	&nbsp;</th><th>	&nbsp;"+rs.getString(5) +"	&nbsp;</th><th>	&nbsp;"+rs.getString(3) +"	&nbsp;</th><th>	&nbsp;"+rs.getDouble(7) 
					              		+ "&nbsp;</th><th>&nbsp;&nbsp;&nbsp;&nbsp; "
					              		+ "<form action=\"flightsServlet2\" method =\"post\"><input type=\"hidden\" id=\"flightId\" name=\"flightId\" value=\""+rs.getString(1)+"\">"
					              				+ "<input type=\"submit\" value=\"BOOK NOW\" ></form>"
					              		+ "</th></tr>");

				}
				out.println("</table></div>");
			
				
				
				smt.close();
				con.close();
				
			}
			catch (Exception e){
				System.out.println(e);
				
			}

	
					
		
				
				
			} catch (Exception e) {
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
