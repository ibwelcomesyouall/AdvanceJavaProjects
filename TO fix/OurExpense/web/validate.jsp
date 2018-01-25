<%-- 
    Document   : validate
    Created on : Aug 16, 2016, 5:36:04 PM
    Author     : user
--%>

<%@page import="java.sql.*"%>
<%
String tid=request.getParameter("tid");
String price=request.getParameter("price");
String roomID=request.getParameter("roomID"); // validator
String authentic=request.getParameter("authentic");
String validID=request.getParameter("validID"); //to be validated

if (authentic.equals("Accept"))
{
try {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","OurExpenseAdmin","OurExpenseAdmin");
    CallableStatement cStmt = connection.prepareCall("{call TotalExpense_update('"+tid+"','"+validID+"','"+roomID+"','"+price+"')}");
    cStmt.execute();
    //session.setAttribute("msg1","Success");
    //response.sendRedirect("summary.jsp?msg=Purchase validated successfully");
    cStmt.close();
    }
    catch(Exception e) {
    out.println("SQLException: " + e.getMessage() + "<BR>");
}
}
else
{
    try {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","OurExpenseAdmin","OurExpenseAdmin");
    CallableStatement cStmt = connection.prepareCall("{call Expense_Rejection('"+tid+"','"+validID+"','"+roomID+"')}");
    cStmt.execute();
    //session.setAttribute("msg","Reject");
    //response.sendRedirect("summary.jsp?msg=Purchase rejected");  
    cStmt.close();
    }
    catch(Exception e) {
    out.println("SQLException: " + e.getMessage() + "<BR>");
}
}
response.sendRedirect("summary.jsp");
    %>