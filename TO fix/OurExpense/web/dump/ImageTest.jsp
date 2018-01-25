<%-- 
    Document   : registration1
    Created on : Aug 7, 2016, 12:02:54 PM
    Author     : user
--%>
<form action ="boom.jsp" method ="get">
<input type="file" name="file"/>
<input type="file" accept="image/*" capture="camera">

<input type="submit"/>
</form>
<%@page import="java.io.ByteArrayInputStream"%>
<%@page import="com.sun.org.apache.xerces.internal.impl.dv.util.Base64"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.io.File"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.sql.*"%>
<%
    
try {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","OurExpenseAdmin","OurExpenseAdmin");
    String query = "SELECT Image FROM FEMALE";
             PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){


                 byte[]imagedata = rs.getBytes("Image");
                 String dirName="F:\\";
		BufferedImage imag=ImageIO.read(new ByteArrayInputStream(imagedata));
		ImageIO.write(imag, "jpg", new File(dirName,"snap.jpg"));


             }
    
    stmt.close();
    }
    catch(Exception e) {
    out.println("SQLException: " + e.getMessage() + "<BR>");
}
    %>
