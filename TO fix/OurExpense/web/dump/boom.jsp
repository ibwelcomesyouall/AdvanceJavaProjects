<%-- 
    Document   : boom
    Created on : Aug 24, 2016, 10:23:19 PM
    Author     : user
--%>

<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        //String fileName=request.getParameter("file"); 
        //File file = new File(request.getAttribute("FILES_DIR")+File.separator+fileName);
        //FileInputStream input = null;
        File theFile = new File(request.getParameter("file"));
        //input = new FileInputStream(theFile);
        out.println("FullPathname" + " " + theFile.getAbsolutePath());
        //out.println(file.getAbsolutePath());
        %>
    </body>
</html>
