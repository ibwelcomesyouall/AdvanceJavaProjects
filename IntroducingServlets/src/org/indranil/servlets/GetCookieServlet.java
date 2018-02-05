package org.indranil.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetCookieServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		Cookie[] cookies = request.getCookies();
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<B>");
		
		for(int i=0; i<cookies.length;i++) {
			String name = cookies[i].getName();
			String value = cookies[i].getValue();
			
			pw.println("name = "+ name +"; value = "+ value );
		}
		pw.close();
	}

}
