package org.indranil.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DateServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
		HttpSession hs = request.getSession(true);
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<B>");
		
		Date date = (Date)hs.getAttribute("date");
		if(date != null) {
			pw.println("Last access: "+ date + "<br/>");
		}
		
		date = new Date();
		hs.setAttribute("date", date);
		pw.println("Current date: "+ date);
		
		pw.close();
		
	}

}
