package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin Home Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <style>\n");
      out.write("            .container {\n");
      out.write("                max-width: 100%;\n");
      out.write("                //margin: 0px;\n");
      out.write("\n");
      out.write("                padding: 0px;\n");
      out.write("            }\n");
      out.write("            .logo{\n");
      out.write("                height: 100px;\n");
      out.write("                width: 1370px;\n");
      out.write("                background-image: url('logo-bg.jpg');\n");
      out.write("                background-size: 100% 100%;\n");
      out.write("                padding-left: 150px;\n");
      out.write("                padding-top: 15px;\n");
      out.write("            }\n");
      out.write("            .socile {\n");
      out.write("                float: none;\n");
      out.write("                display: table;\n");
      out.write("                margin: 10px auto;\n");
      out.write("                padding-left: 325px;\n");
      out.write("                padding-top: 8px;\n");
      out.write("            }\n");
      out.write("            .organization-logo {\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            .a1{\n");
      out.write("                height: 520px;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("            .a2{\n");
      out.write("                height: 60px;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #043211;\n");
      out.write("                color: white;\n");
      out.write("                padding-left: 150px;\n");
      out.write("                padding-top: 20px;\n");
      out.write("            }\n");
      out.write("            .a3{\n");
      out.write("                height: 1px;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: greenyellow;   \n");
      out.write("            }\n");
      out.write("            .a4{\n");
      out.write("                height: 130px;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #043211;\n");
      out.write("                color: white;\n");
      out.write("                padding-left: 150px;\n");
      out.write("                padding-top: 20px;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            .menuitem{\n");
      out.write("                font-size: 2vw;\n");
      out.write("                background: #043211;\n");
      out.write("            }\n");
      out.write("            .joinBtn {\n");
      out.write("                background-color: #043211;\n");
      out.write("                border: 2px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .joinBtn:hover {\n");
      out.write("                background-color: green;\n");
      out.write("            }\n");
      out.write("            .bg-text {\n");
      out.write("                background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("                background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */\n");
      out.write("                color: white;\n");
      out.write("                font-weight: bold;\n");
      out.write("                border: 3px solid #f1f1f1;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 60%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                z-index: 2;\n");
      out.write("                width: 70%;\n");
      out.write("                padding: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                backdrop-filter:blur(4px);\n");
      out.write("            }\n");
      out.write("            .bg-image {\n");
      out.write("                height: 700px;\n");
      out.write("                width: 100%;\n");
      out.write("                color: white;\n");
      out.write("                background-image: url('remote-sensing.jpg');\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: 100% 100%;\n");
      out.write("                filter: blur(0px);\n");
      out.write("            }\n");
      out.write("            .b0 {\n");
      out.write("                width: 20em;\n");
      out.write("                height: 10ex;\n");
      out.write("                background-color: transparent ;                \n");
      out.write("                border: 2px solid firebrick;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                cursor: pointer;\n");
      out.write("                padding: 25px 10px 10px 10px;\n");
      out.write("                backdrop-filter:blur(4px);\n");
      out.write("                tansition:all 10s;\n");
      out.write("            }\n");
      out.write("            .b0 a{\n");
      out.write("                text-decoration:none;\n");
      out.write("                color: white;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .b0 a:hover{\n");
      out.write("                text-decoration:none;\n");
      out.write("                color:black;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .b0:hover {\n");
      out.write("                background-color: #22ff88;\n");
      out.write("                box-shadow: 2px 2px 2px 2px red;\n");
      out.write("                width: 22em;\n");
      out.write("            }\n");
      out.write("            ul{\n");
      out.write("                list-style-type:none;\n");
      out.write("            }\n");
      out.write("            .table1{\n");
      out.write("                height: 300px;\n");
      out.write("                width: 600px;\n");
      out.write("                border: 2px solid white;\n");
      out.write("                text-align: center;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body onload=display_ct();>\n");
      out.write("    <header>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div id=\"container\"  style=\"width:100%; background-color: black; color: white\">                            \n");
      out.write("            <div>\n");
      out.write("                <span id='ct' ></span></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <section class=\"organization-logo\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-7 col-sm-7 col-xs-12\">\n");
      out.write("                    <div class=\"logo\"><a href=\"en\" class=\"external none\"> <img src=\"logo.png\" alt=\"Remote Sensing Applications Centre , Uttar Pradesh\" title=\"Remote Sensing Applications Centre , Uttar Pradesh\" class=\"img-responsive\"> </a></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-5 col-sm-5 col-xs-12\">\n");
      out.write("                    <ul class=\"socile\">\n");
      out.write("                        <li><img src=\"up-logo1.png\" title=\"Uttar Pradesh, Government\" alt=\"Uttar Pradesh, Government\"></li></ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("</header>\n");
      out.write("<section class=\"container menuitem\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        ");

        session=request.getSession();
        String user=session.getAttribute("admin_user").toString();
        
      out.write("\n");
      out.write("        <div class=\"col-3\" style=\"padding-left:100px;color:white;\"><h1>Hello ");
      out.print(user);
      out.write("</h1></div>\n");
      out.write("        <!--<div class=\"col-1 joinBtn\"><a href=\"\" style=\"text-decoration:none;color: white;\">LOGIN</a></div>-->\n");
      out.write("        <div class=\"col-7\"></div>\n");
      out.write("        <div class=\"col-1 joinBtn\"><a href=\"index.html\" style=\"text-decoration:none;color: white;\">LOGOUT</a></div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<section id=\"main-content\">\n");
      out.write("    <div class=\"bg-image\">\n");
      out.write("        <br><center><h1>Admin Page</h1></center><br><br>\n");
      out.write("        <div>\n");
      out.write("            <center>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"b0\"><a href=\"userReg.jsp\" title=\"Add User\" >Add User</a></li><br>\n");
      out.write("                    <li class=\"b0\"><a href=\"userSearch.jsp\" title=\"Search User\" >Search User</a></li><br>\n");
      out.write("                    <li class=\"b0\"><a href=\"userEdit.jsp\" title=\"Edit User\" >Edit User</a></li><br>\n");
      out.write("                    <li class=\"b0\"><a href=\"userDelete.jsp\" title=\"Delete User\">Delete User</a></li>\n");
      out.write("               </ul>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<footer>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"a2\">\n");
      out.write("            <a class=\"external none\" href=\"#\" style='text-decoration:none;color: white;'>Terms &amp; Conditions |</a>\n");
      out.write("            <a class=\"external none\" href=\"#\" style='text-decoration:none;color: white;'>Copyright Policy | </a>\n");
      out.write("            <a class=\"external none\" href=\"#\" style='text-decoration:none;color: white;'>Privacy Policy | </a>\n");
      out.write("            <a class=\"external none\" href=\"#\" style='text-decoration:none;color: white;'>Hyperlinking Policy | </a>\n");
      out.write("            <a class=\"external none\" href=\"#\" style='text-decoration:none;color: white;'>Disclaimer | </a>\n");
      out.write("            <a class=\"external none\" href=\"#\" style='text-decoration:none;color: white;'>Help</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"a3\"></div>\n");
      out.write("            <div class=\"a4\">\n");
      out.write("                <p>© 2017 Remote Sensing Applications Center , Uttar Pradesh<br> This is the official Website of Remote\n");
      out.write("                Sensing Applications Center,Uttar Pradesh.<br>Content on this Website is published and managed by Remote\n");
      out.write("                Sensing Applications Center, Uttar Pradesh.<br>For any query regarding this Website, Please contact the\n");
      out.write("                \"<a href=\"#\" title=\"Web Information Manager\" class=\"external none\"\n");
      out.write("                style=\"color: #fff;\">Web Information Manager</a>\".</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function display_c() {\n");
      out.write("            var refresh = 1000; // Refresh rate in milli seconds\n");
      out.write("            mytime = setTimeout('display_ct()', refresh)\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function display_ct() {\n");
      out.write("            var x = new Date()\n");
      out.write("            document.getElementById('ct').innerHTML = x;\n");
      out.write("            display_c();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>");
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