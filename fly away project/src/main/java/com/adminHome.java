package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class adminHome
 */
public class adminHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<body style=\"background:url(pic2.jpg.jpg)  no-repeat;background-size:100% auto; \">");
		out.println("<div align=\"center\"><i><h1>FlyAway</h1></i></div><br><br>");
		out.println("<h3> welcome to your Dashbaord </h3><br>");
		
		
		out.println("<b><a href='changepassword.jsp'>Change password</a></b><br>");
		out.println("<b><a href='listsourcedestination'>List of Source and Destination</a></b><br>");
		out.println("<b><a href='listairlines'>List of Airlines </a></b><br>");
		out.println("<b><a href='listflights'>List of Flights</a><br></b><br>");
		out.println("<b><a href='flightsmod'>Flights Trip Details Modification</a><br></b><br><br>");
		out.println("<b><a href='Home.jsp'>Logout</a><br>");	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
