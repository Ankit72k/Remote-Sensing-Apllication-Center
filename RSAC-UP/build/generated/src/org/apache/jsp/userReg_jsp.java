package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userReg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Registration</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <style>\n");
      out.write("            td{\n");
      out.write("                font-size:30px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            td input{\n");
      out.write("                font-size:30px;\n");
      out.write("                color: black;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"d.jpeg\");\n");
      out.write("                background-size: 100% 100%;\n");
      out.write("                background-repeat: no-repeat;                \n");
      out.write("                opacity: 1.5;\n");
      out.write("            }\n");
      out.write("            .form{\n");
      out.write("                background:transparent;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <div class=\"container mt-4 form\">\n");
      out.write("            <center>    \n");
      out.write("                <!--user, pswd, email, mobile, addr, city, valid;-->\n");
      out.write("                <h1> User Registration</h1>\n");
      out.write("                <form action=\"userAcConf\" method=\"post\" class=\"m-4\">\n");
      out.write("                    <table  width=\"800\" height=600 border=1 cellspacing=0 cellpadding=10>\n");
      out.write("                        <tr><td>User Name</td><td><input type=text name=user required class=\"form-control\"></td></tr>\n");
      out.write("                        <tr><td>Password</td><td><input type=password name=pswd required class=\"form-control\" ></td></tr>\n");
      out.write("                        <tr><td>Email</td><td><input type=email name=email required class=\"form-control\"></td></tr>\n");
      out.write("                        <tr><td>Mobile</td><td><input type=number name=mobile required class=\"form-control\"></td></tr>\n");
      out.write("                        <tr><td>Address</td><td><input type=text name=addr required class=\"form-control\"></td></tr>\n");
      out.write("                        <tr><td>City</td><td><input type=text name=city required class=\"form-control\"></td></tr>\n");
      out.write("                        <tr><td>Validity</td><td><input type=date name=valid required class=\"form-control\"></td></tr>\n");
      out.write("                        <tr><td><input type=reset></td><td><input type=\"submit\" value=\"add\" name=\"opr\" ></td></tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
