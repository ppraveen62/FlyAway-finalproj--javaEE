package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.to.user;

/**
 * Servlet implementation class homecheck
 */
public class homecheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public homecheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			PrintWriter out=response.getWriter();
			String sDate1=request.getParameter("udate");
			String from=request.getParameter("ufrom");
			String to=request.getParameter("uto");
			String person=request.getParameter("uperson");
			
		
		
			
			if(!from.equals(to) && sDate1!="") {
				RequestDispatcher rd =request.getRequestDispatcher("flightsServlet");
				rd.forward(request, response);
				
			}
			if(from.equals(to) || sDate1=="") {
				RequestDispatcher rd =request.getRequestDispatcher("Home.jsp");
				rd.include(request, response);
				out.println("<center> <span style = 'color:red'> check Inputs </span> </center>");
			}
			
			
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
