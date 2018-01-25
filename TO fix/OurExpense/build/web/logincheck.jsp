<%--
    Document   : logincheck
    Created on : Aug 25, 2016, 6:34:02 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Check Page</title>
    </head>
    <body>
        <%
                    String fname=request.getParameter("fname");
                    String pwd=request.getParameter("pass"); 
                  try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","OurExpenseAdmin","OurExpenseAdmin");
                        Statement lcheck = connection.createStatement(); 
                        int roomID=0;
                        ResultSet rset = lcheck.executeQuery("select * from Roommates where FirstName='"+fname+"' and Password='"+pwd+"'");
                     if (rset.next()) 
                     {
                         roomID=rset.getInt(1);
                         HttpSession sess = request.getSession(); 
                         sess.setAttribute("roomID", roomID);
                         sess.setAttribute("fname", fname);
                         response.sendRedirect("summary.jsp");
                     }
                     else
                     {
                         session.setAttribute("msg","Failure");
                         response.sendRedirect("login.jsp?msg=Invalid Username or Password!!!");
                     }
                     lcheck.close();
                     
                    }
                    catch(Exception e) {
    out.println("SQLException: " + e.getMessage() + "<BR>");
                    }
    %>
                        
    </body>
</html>
