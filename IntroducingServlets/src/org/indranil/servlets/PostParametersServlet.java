package org.indranil.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;


@SuppressWarnings("serial")
public class PostParametersServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		Enumeration<String> e = request.getParameterNames();
		
		while(e.hasMoreElements()) {
			String pname = e.nextElement();
			pw.print(pname + " = ");
			String pvalue = request.getParameter(pname);
			pw.println(pvalue);
		}
		pw.close();
		
		
	}

}
