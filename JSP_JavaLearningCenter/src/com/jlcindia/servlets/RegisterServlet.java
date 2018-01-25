package com.jlcindia.servlets;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import com.jlcindia.jdbc.UserService;
import com.jlcindia.to.UserTO;

public class RegisterServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        UserService userService = new UserService();
        System.out.println("RegisterAction-service()");
        String fn=req.getParameter("fname");
        String em=req.getParameter("email");
        String ph=req.getParameter("phone");
        String un=req.getParameter("username");
        String pw=req.getParameter("password");
        int uid = userService.getNextUserId();
        long ph1=Long.parseLong(ph);
        UserTO uto = new UserTO(uid,fn,em,ph1,un,pw);
        int x= userService.registerUser(uto);
        HttpSession session = req.getSession();
        String result="";
        if (x==1)
        {
            session.setAttribute("UN", un);
            result="home.jsp";
        }
        else
        {
            String msg = "Registration Failed - Try Again";
            req.setAttribute("MSG",msg);
            result= "register.jsp";
        }
        RequestDispatcher rd = req.getRequestDispatcher(result);
        rd.forward(req,res);
    }
    
}
