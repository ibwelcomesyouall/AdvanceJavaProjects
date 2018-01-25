package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.sql.*;

public final class summary_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  \n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/ico/favicon.png\">\n");
      out.write("\n");
      out.write("    <title>Our Expense (Sreeja Residency 402)</title>\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"assets/css/main.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"assets/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/modernizr.custom.js\"></script>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\t<nav class=\"menu\" id=\"theMenu\">\n");
      out.write("\t\t<div class=\"menu-wrap\">\n");
      out.write("\t\t\t<h1 class=\"logo\"><a href=\"index.jsp#home\">LINK</a></h1>\n");
      out.write("\t\t\t<i class=\"fa fa-arrow-right menu-close\"></i>\n");
      out.write("\t\t\t<a href=\"about.jsp\">About</a>\n");
      out.write("                        <a href=\"logout.jsp\">Log Out</a>\n");
      out.write("\t\t\t<a href=\"mailto:ibwelcomesyouall@gmail.com\"><i class=\"fa fa-envelope\"></i></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Menu button -->\n");
      out.write("\t\t<div id=\"menuToggle\"><i class=\"fa fa-bars\"></i></div>\n");
      out.write("\t</nav>\n");
      out.write("                        <div id=\"sp\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<h2>Hello ");

                                    HttpSession sess = request.getSession(); 
                         out.println(sess.getAttribute("fname"));
      out.write("!</h2>\n");
      out.write("\t\t\t</div><!-- row -->\n");
      out.write("\t\t</div><!-- /container -->\n");
      out.write("\t</div>\n");
      out.write("        \t<!-- WELCOME SECTION -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row mt centered\">\n");
      out.write("      \t<div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("            ");

                       Calendar now = Calendar.getInstance();
                       int year=now.get(Calendar.YEAR);
                       int month=now.get(Calendar.MONTH)+1;
                       String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
                       String monthname=monthNames[month-1];
                       String formattedmonth = String.format("%02d", month);
                         try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","OurExpenseAdmin","OurExpenseAdmin");
                         Statement vcheck = connection.createStatement();
                       ResultSet rsetv = vcheck.executeQuery("select * from ExpenseLog where Valid='N' and RoommateID not in ('"+sess.getAttribute("roomID")+"')");
                       if(rsetv.next())
                       {
      out.write("\n");
      out.write("                       <h1><b> One of your friend has recently inserted expense detail. Please validate it ..</b></h1>\n");
      out.write("                       <br/>\n");
      out.write("                       <p>To validate simply click on Accept!! </p><br/>  \n");
      out.write("                      ");
 }
                       ResultSet rsetv1 = vcheck.executeQuery("select b.*,a.FirstName from ExpenseLog b,Roommates a where b.Valid='N' and b.RoommateID not in ('"+sess.getAttribute("roomID")+"') and a.RoommateID=b.RoommateID");
                       
      out.write("\n");
      out.write("                     \n");
      out.write("                           ");

                       while (rsetv1.next())
                       {
                           out.println(rsetv1.getString(7)+" has claimed that he purchased "+rsetv1.getString(4)+" costs "+rsetv1.getString(5)+". Are you OK??");
      out.write("\n");
      out.write("                           <form action =\"validate.jsp\" method=\"get\">\n");
      out.write("                               <tr><input type=\"hidden\" name=\"tid\" value=\"");
out.print(rsetv1.getString(2));
      out.write("\"/>\n");
      out.write("                               <input type=\"hidden\" name=\"validID\" value=\"");
out.print(rsetv1.getString(1));
      out.write("\"/>\n");
      out.write("                               <input type=\"hidden\" name=\"price\" value=\"");
out.print(rsetv1.getString(5));
      out.write("\"/>\n");
      out.write("                               <input type=\"hidden\" name=\"roomID\" value=\"");
sess.getAttribute("roomID");
      out.write("\"/>\n");
      out.write("                               <input type=\"submit\" name=\"authentic\" value=\"Y\"/>\n");
      out.write("                           <input type=\"submit\" name=\"authentic\" value=\"N\"/>\n");
      out.write("                           </form>\n");
      out.write("                           \n");
      out.write("                      ");
 }
                           
      out.write("\n");
      out.write("                           <h1><b>\n");
      out.write("                               For ");
out.print(monthname);
      out.write(", you have to Pay (till date): Rs.\n");
      out.write("                                            ");

                        Statement stmt = connection.createStatement(); 
                        Statement stmt1 = connection.createStatement();
                        Statement stmtsum = connection.createStatement();
                        Statement stmt2 = connection.createStatement();
                        Statement stmtsum1 = connection.createStatement();
                        ResultSet rset1 = stmt.executeQuery("select * from TotalExpense where RoommateID='"+sess.getAttribute("roomID")+"'" );
                        if (rset1.next()) {
                        out.print (rset1.getString(2)); // Print col 1
                        }
                        else
                        {
                           out.print ("0"); 
                        }
                    
      out.write("\n");
      out.write("                               </b></h1>\n");
      out.write("      \t</div>\n");
      out.write("      </div><!-- /row -->\n");
      out.write("    </div><!-- /.container -->\n");
      out.write(" <div id=\"lg\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-5 col-lg-offset-1 desc\">\n");
      out.write("\t\t\t\t\t<h3>Your Expenditure Log :</h3>\n");
      out.write("                    ");

                    ResultSet rset2 = stmt1.executeQuery("select * from ExpenseLog where RoommateID='"+sess.getAttribute("roomID")+"' and Purchasedate like '"+year+"-"+formattedmonth+"-%'");
                    ResultSet rsetsum=stmtsum.executeQuery("select SUM(Price) from ExpenseLog where RoommateID='"+sess.getAttribute("roomID")+"' and Purchasedate like '"+year+"-"+formattedmonth+"-%'");
                    
      out.write("\n");
      out.write("                    <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th> Purchase Date</th>\n");
      out.write("                <th> Item Detail</th>\n");
      out.write("                <th> Price</th>\n");
      out.write("            </tr>\n");
      out.write("                    ");

                    while (rset2.next()) {
                     
      out.write("\n");
      out.write("              <tr>      \n");
      out.write("            <td>  ");
out.println (rset2.getString(3));
      out.write(" </td>\n");
      out.write("            <td>  ");
out.println (rset2.getString(4));
      out.write(" </td>\n");
      out.write("            <td>  ");
out.println (rset2.getString(5));
      out.write(" </td></tr>\n");
      out.write("        \n");
      out.write("                    ");

                    }
                    rsetsum.next();
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                    <td colspan=\"3\">");
out.println("Total:"+rsetsum.getString(1));
      out.write("\n");
      out.write("                    </td></tr>\n");
      out.write("                    </table>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-lg-5 col-lg-offset-1 desc\">\n");
      out.write("                                    ");

                    //ResultSet rset3 = stmt2.executeQuery("select * from ExpenseLog where Purchasedate like '"+year+"-"+formattedmonth+"-%' ");
                    ResultSet rset3=stmt2.executeQuery("select a.Purchasedate,a.ExpenseLogDetail,a.Price,a.Valid,y.FirstName, (select x.FirstName from Roommates x where x.RoommateID =CASE WHEN EXISTS ( SELECT b.ValidatorID FROM Validator b where a.TransactionID=b.TransactionID )THEN ( SELECT b.ValidatorID FROM Validator b where a.TransactionID=b.TransactionID )ELSE ( SELECT c.RejectorID FROM Rejector c where a.TransactionID=c.TransactionID )END) as 'Validator/Rejector' from ExpenseLog a, Roommates y where y.RoommateID=a.RoommateID and a.Purchasedate like '"+year+"-"+formattedmonth+"-%'");
                    ResultSet rset4=stmtsum1.executeQuery("select SUM(Price) from ExpenseLog where Purchasedate like '"+year+"-"+formattedmonth+"-%'");
                    
      out.write("\n");
      out.write("                    <h3>Global Expenditure Log:</h3>\n");
      out.write("                    <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th> Purchase Date</th>\n");
      out.write("                <th> Item Detail</th>\n");
      out.write("                <th> Price</th>\n");
      out.write("                <th> Status</th>\n");
      out.write("                <th> Expense Of</th>\n");
      out.write("                <th> Validated/Rejected By</th>\n");
      out.write("            </tr>\n");
      out.write("                      ");

                    while (rset3.next()) {
                        
      out.write("       \n");
      out.write("             <tr>      \n");
      out.write("            <td>  ");
out.println (rset3.getString(1));
      out.write(" </td>\n");
      out.write("            <td>  ");
out.println (rset3.getString(2));
      out.write(" </td>\n");
      out.write("            <td>  ");
out.println (rset3.getString(3));
      out.write(" </td>\n");
      out.write("            <td>  ");
out.println (rset3.getString(4));
      out.write(" </td>\n");
      out.write("            <td>  ");
out.println (rset3.getString(5));
      out.write(" </td>\n");
      out.write("            <td>  ");
out.println (rset3.getString(6));
      out.write(" </td></tr>\n");
      out.write("                    ");

                    }
                    rset4.next();
                    
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                    <td colspan=\"6\">");
out.println("Total:"+rset4.getString(1));
      out.write("\n");
      out.write("                    </td></tr>\n");
      out.write("                    </table>\n");
      out.write("                    <br/>\n");
      out.write("                    ");

                        stmt.close();
                        stmt1.close();
                        stmt2.close();

}catch(Exception e) {
    out.println("SQLException: " + e.getMessage() + "<BR>");
}
                         

      out.write("\n");
      out.write("                                </div>\n");
      out.write("\t\t\t</div><!-- row -->\n");
      out.write("\t\t</div><!-- container -->\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"call\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("                            <h3>  Want to input your expense for today, then fill the form as below:-</h3>\n");
      out.write("                            <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("        <form action=\"todaysexpense.jsp\" method=\"get\">\n");
      out.write("            <input type=\"hidden\" name=\"roomID\" value=\"");
out.print(sess.getAttribute("roomID"));
      out.write("\"/>\n");
      out.write("            <p>\n");
      out.write("                Purchase Date: <input type=\"date\" name=\"pdate\" required/>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Item Details: <input type=\"text\" name=\"idel\" required/>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Total Cost: <input type=\"text\" name=\"tcost\" required/>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("             <button class=\"btn btn-green\"><input type=\"submit\"/></button>\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div><!-- row -->\n");
      out.write("\t\t</div><!-- container -->\n");
      out.write("\t</div>\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("\t<script src=\"assets/js/masonry.pkgd.min.js\"></script>\n");
      out.write("\t<script src=\"assets/js/imagesloaded.js\"></script>\n");
      out.write("    <script src=\"assets/js/classie.js\"></script>\n");
      out.write("\t<script src=\"assets/js/AnimOnScroll.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\tnew AnimOnScroll( document.getElementById( 'process' ), {\n");
      out.write("\t\t\tminDuration : 0.4,\n");
      out.write("\t\t\tmaxDuration : 0.7,\n");
      out.write("\t\t\tviewportFactor : 0.2\n");
      out.write("\t\t} );\n");
      out.write("\t</script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
