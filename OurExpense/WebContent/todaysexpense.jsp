<%-- 
    Document   : todaysexpense
    Created on : Aug 16, 2016, 3:52:44 PM
    Author     : user
--%>

<%@page import="java.sql.*"%>
<%
String roomID=request.getParameter("roomID");
int roomIDi=Integer.parseInt(roomID);
String pdate=request.getParameter("pdate");
String idel=request.getParameter("idel");
String tcost=request.getParameter("tcost");
try {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","OurExpenseAdmin","OurExpenseAdmin");
    Statement stmt = connection.createStatement();
    stmt.executeUpdate("insert into ExpenseLog (RoommateID,TransactionID ,Purchasedate,ExpenseLogDetail,Price,Valid) values("+roomIDi+",FLOOR(RAND()*POWER(CAST(10 as BIGINT),10)),'"+pdate+"','"+idel+"',"+tcost+",'N')");
    response.sendRedirect("summary.jsp");
    stmt.close();
    }
    catch(Exception e) {
    out.println("SQLException: " + e.getMessage() + "<BR>");
}
    %>
