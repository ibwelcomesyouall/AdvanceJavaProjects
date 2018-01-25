<%-- 
    Document   : profilesummary
    Created on : Aug 26, 2016, 8:43:56 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                        HttpSession sessr = request.getSession(); 
                         sessr.getAttribute("roomID");
                         sessr.getAttribute("fname");
                         sessr.getAttribute("dob");
                         sessr.getAttribute("phno");
                         sessr.getAttribute("email");
                         
                         
                         if(sessr.getAttribute("action").toString().equals("Add"))
                         {
                             
                         }
                         else if(sessr.getAttribute("action").toString().equals("Modify"))
                         {
                             
                         }
                         else if(sessr.getAttribute("action").toString().equals("Remove"))
                         {
                             
                         }
                         else if(sessr.getAttribute("action").toString().equals("Suggest"))
                         {
                             
                         }
                         else
                             out.println("Issue");
                         %>
    </body>
</html>
