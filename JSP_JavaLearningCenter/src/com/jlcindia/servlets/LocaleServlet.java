package com.jlcindia.servlets;

import java.io.IOException;
import java.util.Locale;
import javax.servlet.*;
import javax.servlet.http.*;

public class LocaleServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        String lan = req.getParameter("language");
        Locale loc= new Locale(lan);
        res.setLocale(loc);
        req.getSession().setAttribute("LAN", lan);
        req.getRequestDispatcher("I8NProject.jsp").forward(req, res);
        System.out.println(lan);
    }
    
}
