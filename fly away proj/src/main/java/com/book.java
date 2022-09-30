package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class book
 */
public class book extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String price;
	public static int  ran;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public book() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		int flightno=Integer.parseInt(flightsServlet2.flightId);
		int person1=Integer.parseInt(flightsServlet.person);
		
		Random rand=new Random(); 
		ran=rand.nextInt(120001 ,122000);
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");                                                         
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","root"); 
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from flightdto;");
			while(rs.next()) {
							
				if (rs.getInt(1)==flightno) {
					
					double amount= Double.parseDouble(rs.getString(7))*person1;
					price=String.valueOf(amount);
					
					out.println("<body style=\"background:url(pic2.jpg.jpg)  no-repeat;background-size:100% auto; \">");
					out.print("<div align=\"center\"><i><h1>FlyAway</h1></i></div><br>");
					out.print("<div align=\"center\"><b>From : </b>"+rs.getString(6)+"   &#8594;   <b>To : </b>"+rs.getString(5)+"<br><br></div><br>   ");
					out.println("<div align=\"center\"><table>");
					out.println("<tr><th><b>Flight No :</b>"+rs.getInt(1) +"&nbsp;</th><th>	&nbsp;<b>Departure Time :</b>"+rs.getString(4) +"&nbsp;</th><th>&nbsp;<b>Arrival Time :</b>"+rs.getString(3) +"</th></tr>");
					out.print("<div align=\"center\"><b>Price : Rs </b>"+rs.getString(7)+"/-"+"</div><br>   ");
					out.print("<div align=\"center\"><b>No of Person : </b>"+person1+"</div><br>   ");	
					out.print("<div align=\"center\"><b>Total Price : Rs </b>"+amount+"/-"+"</div><br>   ");
					out.println("</table><br>");
					out.println("<form action=\"payment.jsp\"  ><input type=\"submit\" value=\"Conifrm\" ></form></div>");
					
					
					
					
					
				}
			}
			smt.close();
			con.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
