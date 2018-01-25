<%-- 
    Document   : registration1
    Created on : Aug 7, 2016, 12:02:54 PM
    Author     : user
--%>
<%@page import="java.sql.*"%>
<%
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
                         HttpSession sessr = request.getSession(); 
                         sessr.setAttribute("roomID", roomID);
                         sessr.setAttribute("fname", fname);
                         sessr.setAttribute("dob", dob);
                         sessr.setAttribute("phno", phno);
                         sessr.setAttribute("email", email);
                         sessr.setAttribute("action", action);
                        response.sendRedirect("profilesummary.jsp");
                     }
                     else
                     {
                         session.setAttribute("msg","Failure");
                         response.sendRedirect("profileupdate.jsp");
                     }
                     check.close();
                     
                    }
                    catch(Exception e) {
    out.println("SQLException: " + e.getMessage() + "<BR>");
                    }
%>
