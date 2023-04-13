package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>RSAC-UP Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                border: 1px solid black;\n");
      out.write("                background: #ccccff;\n");
      out.write("                /*background-image: url(\"h.jpg\");*/\n");
      out.write("                /*display: flex;*/\n");
      out.write("            }\n");
      out.write("            .main{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                height: 100vh;\n");
      out.write("                width:100%;\n");
      out.write("                background-image: url(\"H.jpg\");\n");
      out.write("                background-size:100% 100%;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                /*background: #aaffcc;*/\n");
      out.write("            }\n");
      out.write("            header{\n");
      out.write("                border: 1px solid black;\n");
      out.write("                background: #133b00;\n");
      out.write("                color: white;\n");
      out.write("                /*font-size: 50px;*/\n");
      out.write("                /*font-family: robo,sans-serif,calibri;*/\n");
      out.write("                /*z-index: 10;*/\n");
      out.write("                /*position: sticky;*/\n");
      out.write("                /*height: 200px;*/\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            header img{\n");
      out.write("                height: 15vh;\n");
      out.write("                width:100vh;\n");
      out.write("            }\n");
      out.write("            .table1{\n");
      out.write("                height: 200px;\n");
      out.write("                width: 500px;\n");
      out.write("                border: 1px solid black;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            footer{\n");
      out.write("                border-top: 1px solid black;\n");
      out.write("                /*font-size: 30px;*/\n");
      out.write("                font-family: Robo,sans-serif;\n");
      out.write("                /*text-align: center;*/\n");
      out.write("                background:#133b00;\n");
      out.write("                display: flex-block;\n");
      out.write("                color: white;\n");
      out.write("                /*position: relative;*/\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .footerNav{\n");
      out.write("                /*display: block;*/\n");
      out.write("            }\n");
      out.write("            .footer_menu{\n");
      out.write("                display: inline;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <header>\n");
      out.write("                <img src=\"logo.png\">\n");
      out.write("            </header>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <center>\n");
      out.write("                <h2>Login Page</h2><br>\n");
      out.write("                <form action=\"loginConf\" method=\"get\">\n");
      out.write("                    <table class=\"table table1\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>User Type</td>\n");
      out.write("                            <td><select name=\"utype\" id=\"utype\">\n");
      out.write("                                    <option value=\"select user\">Select user type</option>\n");
      out.write("                                    <option value=\"Admin\">Admin</option>\n");
      out.write("                                    <option value=\"User\">User</option>\n");
      out.write("                                </select>    \n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>User Name</td>\n");
      out.write("                            <td><input type=\"text\" name=\"user\" class=\"form-control\" required=\"1\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Password</td>\n");
      out.write("                            <td><input type=\"password\" name=\"pswd\" class=\"form-control\" required=\"1\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input class=\"btn-danger\" type=\"reset\" ></td>\n");
      out.write("                            <td><input class=\"btn-primary\" type=\"submit\" value=\"Submit\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"footerNav\">\n");
      out.write("                <ul class=\"footer_menu\">\n");
      out.write("                    <li class=\"\"><a class=\"\" href=\"./en/page/terms-conditions\">Terms &amp; Conditions</a></li>\n");
      out.write("                    <li class=\"\"><a class=\"\" href=\"./en/page/copyright-policy\">Copyright Policy</a></li>\n");
      out.write("                    <li class=\"\"><a class=\"\" href=\"./en/page/privacy-policy\">Privacy Policy</a></li>\n");
      out.write("                    <li class=\"\"><a class=\"\" href=\"./en/page/hyperlinking-policy\">Hyperlinking Policy</a></li>\n");
      out.write("                    <li class=\"\"><a class=\"\" href=\"./en/page/disclaimer\">Disclaimer</a></li>\n");
      out.write("                    <li class=\"\"><a class=\"\" href=\"./en/page/help\">Help</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!--<div class=\"clearfix\"></div>-->\n");
      out.write("            <div>\n");
      out.write("                <div>\n");
      out.write("                    <p>Copyright &copy; 2017 Remote Sensing Applications Center , Uttar Pradesh<br>\n");
      out.write("                        This is the official Website of Remote Sensing Applications Centre,Uttar Pradesh.\n");
      out.write("                        <br>Content on this website is published and managed by Remote Sensing Applications Centre, Uttar Pradesh.\n");
      out.write("                        <br>For any query regarding this website, Please contact the \"\n");
      out.write("                        <a href=\"article/en/web-information-manager\" title=\"Web Information Manager\" class=\"external none\" style=\"color: #fff;\">Web Information Manager</a>\".</p>\n");
      out.write("                </div>\n");
      out.write("                <div >Last Updated on : Thursday, Mar 31 2022  2:51PM<br> \n");
      out.write("                    Visitor No. : <img class=\"statcounter\" src=\"https://c.statcounter.com/12026135/0/08d95c8d/0/\" alt=\"Web Analytics Made Easy\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
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
