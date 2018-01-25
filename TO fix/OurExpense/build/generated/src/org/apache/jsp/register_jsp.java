package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/ico/favicon.png\">\n");
      out.write("\n");
      out.write("    <title>Our Expense (Sreeja Residency 402)</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"assets/css/main.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"assets/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <script src=\"assets/js/modernizr.custom.js\"></script>\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("\t<!-- Menu -->\n");
      out.write("\t<nav class=\"menu\" id=\"theMenu\">\n");
      out.write("\t\t<div class=\"menu-wrap\">\n");
      out.write("\t\t\t<h1 class=\"logo\"><a href=\"index.jsp#home\">HOME</a></h1>\n");
      out.write("\t\t\t<i class=\"fa fa-arrow-right menu-close\"></i>\n");
      out.write("\t\t\t<a href=\"login.jsp\">Login</a>\n");
      out.write("\t\t\t<a href=\"mailto:ibwelcomesyouall@gmail.com\"><i class=\"fa fa-envelope\"></i></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Menu button -->\n");
      out.write("\t\t<div id=\"menuToggle\"><i class=\"fa fa-bars\"></i></div>\n");
      out.write("\t</nav>\n");
      out.write("\t\n");
      out.write("\t<!-- MAIN IMAGE SECTION -->\n");
      out.write("\t<div id=\"portwrap\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("\t\t\t\t\t<h2>Update Your Profile</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div><!-- row -->\n");
      out.write("\t\t</div><!-- /container -->\n");
      out.write("\t</div><!-- /portrwrap -->\n");
      out.write("\n");
      out.write("\t<!-- WELCOME SECTION -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row mt\">\n");
      out.write("      \t<div class=\"col-lg-8\">\n");
      out.write("\t        <h1>Update your profile here !!</h1>\n");
      out.write("\t        <p>By updating your profile, this site will look smart and handsome. So Proceed.</p>\n");
      out.write("      \t</div>\n");
      out.write("      \t<div class=\"col-lg-4\">\n");
      out.write("            <p class=\"pull-right\"><br><button type=\"button\" class=\"btn btn-green\">Click on any of the Photo</button></p>\n");
      out.write("      \t</div>\n");
      out.write("      </div><!-- /row -->\n");
      out.write("    </div><!-- /.container -->\n");
      out.write("    \n");
      out.write("    <!-- PORTFOLIO SECTION -->\n");
      out.write("    <div id=\"portfolio\">\n");
      out.write("    \t<div class=\"container\">\n");
      out.write("\t    \t<div class=\"row mt\">\n");
      out.write("\t\t\t\t<ul class=\"grid effect-2\" id=\"grid\">\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/1.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/2.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/3.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/4.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/5.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/6.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/7.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/8.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/9.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/10.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/11.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/12.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/13.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/14.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"profileupdate.jsp\"><img src=\"assets/img/Register/15.JPG\" alt=\"Image Not Found\"></a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("            </div><!-- row -->\n");
      out.write("\t    </div><!-- container -->\n");
      out.write("    </div><!-- portfolio -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<!-- CALL TO ACTION -->\n");
      out.write("\t<div id=\"call\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<h3>Sreeja Residency, 402</h3>\n");
      out.write("\t\t\t\t<div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("\t\t\t\t\t<p>A Place where we do innovations/craziness/fun etc.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div><!-- row -->\n");
      out.write("\t\t</div><!-- container -->\n");
      out.write("\t</div>\n");
      out.write("<div id=\"cf\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-4\">\n");
      out.write("                                    <h4><u>Home Address</u></h4>\n");
      out.write("\t\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t402, 8th Cross, Sreeja Residency<br/>\n");
      out.write("\t\t\t\t\t\tBellandur.\n");
      out.write("                                                PIN: 560103<br/>\n");
      out.write("\t\t\t\t\t\tP: +91 8971378176<br/>\n");
      out.write("\t\t\t\t\t\tE: <a href=\"mailto:#\">ibwelcomesyouall@gmail.com</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div><!-- row -->\n");
      out.write("\t\t</div><!-- container -->\n");
      out.write("\t</div><!-- Contact Footer -->\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\t\tnew AnimOnScroll( document.getElementById( 'grid' ), {\n");
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
