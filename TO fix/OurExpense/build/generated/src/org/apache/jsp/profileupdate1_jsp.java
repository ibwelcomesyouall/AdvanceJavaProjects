package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class profileupdate1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

String fname=request.getParameter("fname");
String pwd=request.getParameter("pass");
String dob=request.getParameter("dob");
String phno=request.getParameter("phno");
String email=request.getParameter("email");
String action=request.getParameter("action");
try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","OurExpenseAdmin","OurExpenseAdmin");
                        Statement check = connection.createStatement(); 
                        int roomID=0;
                        ResultSet rset = check.executeQuery("select * from Roommates where FirstName='"+fname+"' and Password='"+pwd+"'");
                     if (rset.next()) 
                     {
                         roomID=rset.getInt(1);
                         HttpSession sess = request.getSession(); 
                         sess.setAttribute("roomID", roomID);
                         sess.setAttribute("fname", fname);
                        // response.sendRedirect("profilesummary.jsp");
                     }
                     else
                     {
                         session.setAttribute("msg","Failure");
                         //response.sendRedirect("profileupdate.jsp");
                     }
                     check.close();
                     
                    }
                    catch(Exception e) {
    out.println("SQLException: " + e.getMessage() + "<BR>");
                    }

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
