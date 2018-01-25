package com.jlcindia.servlets;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import com.jlcindia.jdbc.UserService;

public class LoginServlet extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        UserService userService = new UserService();
        System.out.println("LoginAction-service()");
        String un=req.getParameter("username");
        String pw=req.getParameter("password");
        int x=userService.verifyUser(un,pw);
        HttpSession session = req.getSession();
        String result="";
        if(x==1)
        {
            session.setAttribute("UN", un);
            result="home.jsp";
        }
        else
        {
            String msg="Invalid Username or Password";
            req.setAttribute("MSG",msg);
            result="LoginProject.jsp";
        }
        RequestDispatcher rd= req.getRequestDispatcher(result);
        rd.forward(req, res);
    }
    
}
