package com.jlcindia.servlets;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import com.jlcindia.jdbc.UserService;
public class ForgotPWServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        UserService userService = new UserService();
        String em=req.getParameter("email");
        String pw=userService.getPasswordByEmail(em);
        String result="";
        if (pw!=null)
        {
            result="pwstatus.jsp";
            req.setAttribute("PASSWORD",pw);
        }
        else
        {
            String msg = "Invalid Email - Try Again";
            req.setAttribute("MSG",msg);
            result= "forgotpw.jsp";
        }
        RequestDispatcher rd = req.getRequestDispatcher(result);
        rd.forward(req,res);
    }
    
}
