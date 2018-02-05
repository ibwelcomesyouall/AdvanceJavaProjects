package org.indranil.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddCookieServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		String data = request.getParameter("data");
		
		Cookie cookie = new Cookie("MyCookie", data);
		response.addCookie(cookie);
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<B>MyCookie has been set to ");
		pw.println(data);
		pw.close();
	}

}
