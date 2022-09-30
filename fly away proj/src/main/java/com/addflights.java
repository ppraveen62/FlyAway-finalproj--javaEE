package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.flightdto;

/**
 * Servlet implementation class addflights
 */
public class addflights extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addflights() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fno =request.getParameter("flightno");
		String airlinename=request.getParameter("airline");
		String fsource=request.getParameter("source");
		String fdestination=request.getParameter("destination");
		String dtime =request.getParameter("departuretime");
		String atime =request.getParameter("arrivaltime");
		String tfare =request.getParameter("tripfare");
		
		PrintWriter out=response.getWriter();
		
		if (fno=="") {
			fno = "0";
		}
		if (tfare=="") {
			tfare = "0";
		}
		
		int flightno=Integer.parseInt(fno);
		double tripfare=Double.parseDouble(tfare);
		
		
		boolean control=Pattern.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]", dtime);
		boolean control2=Pattern.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]", dtime);
		
		if (flightno!=0 && airlinename!="" && fsource!="" && fdestination!="" && dtime!="" &&control!=false && atime!="" &&control2!=false && tripfare!=0) {
			try {
				
				Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
				
				SessionFactory factory=cfg.buildSessionFactory();
				Session session=factory.openSession();
				Transaction trx=session.beginTransaction();
				
				flightdto obj= new flightdto(flightno,airlinename, fsource,fdestination, dtime,atime,tripfare);
				
				session.save(obj);
				trx.commit();
				session.close();
				
			}
			catch (Exception e){
				e.printStackTrace();
			
				
			}
		}
	
		
		if (flightno!=0 && airlinename!="" && fsource!="" && fdestination!="" && dtime!=""  && control!=false && atime!="" &&control2!=false && tripfare!=0) {
			
		RequestDispatcher rd =request.getRequestDispatcher("flights.jsp");
		rd.include(request, response);
		out.println("<center> <span style = 'color:green'> Flight No "+flightno+" is added </span> </center>");
		
		}
		
		if (flightno==0 || airlinename=="" || fsource=="" || fdestination=="" || dtime==""|| control==false || atime==""|| control==false|| tripfare==0) {
			
			RequestDispatcher rd =request.getRequestDispatcher("flights.jsp");
			rd.include(request, response);
			out.println("<center> <span style = 'color:red'> check Inputs </span> </center>");	
			
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
