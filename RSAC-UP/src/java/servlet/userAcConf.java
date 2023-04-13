package servlet;

import beans.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author india
 */
public class userAcConf extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        http://localhost:8084/RSAC-UP/userAcConf?
//        name=Ankit+Kumar& pswd=12345& mail=aa%40gmail.com& phone=963258741
//        & addr=Lucknow+UP+& city=Lucknow& valid=2024-01-24
//        user, pswd, email, mobile, addr, city, valid;
        try (PrintWriter out = response.getWriter()) {
           User user=new User();
           if(request.getParameter("opr").equals("Add"))
           {
           user.setUser(request.getParameter("user"));
           user.setPswd(request.getParameter("pswd"));
           user.setEmail(request.getParameter("email"));
           user.setMobile(request.getParameter("mobile"));
           user.setAddr(request.getParameter("addr"));
           user.setCity(request.getParameter("city"));
           user.setValid(request.getParameter("valid"));
           int i=0;
           i=user.addUser();
           if(i>0){
//               response.sendRedirect("AdminHome.jsp");
               out.println("<h1><center>New User Added Successfully !!!</center></h1>");
           }
           else{
               response.sendRedirect("userReg.jsp?msg=Error in Registration/Duplicate Entry");
//               out.println("<h1><center>OOps ! Error in registration!!!</center></h1>");
               
           }
           }
           else if(request.getParameter("opr").equals("search")){
//              http://localhost:8084/RSAC-UP/userAcConf?user=wdwd&opr=search
               user.setUser(request.getParameter("user"));
               ResultSet rst=user.searchUser();
               if(rst.next()){
                   out.println("<html> <head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"        <title>User Registration</title>\n" +
"        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\n" +
"        <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n" +
"        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct\" crossorigin=\"anonymous\"></script>\n" +
"        <style>\n" +
"            td{\n" +
"                font-size:30px;\n" +
"                font-weight: bold;\n" +
"            }\n" +
"            td input{\n" +
"                font-size:30px;\n" +
"                color: black;\n" +
"                font-weight: bold;\n" +
"            }\n" +
"            body{\n" +
"                background-image: url(\"d.jpeg\");\n" +
"                background-size: 100% 100%;\n" +
"                background-repeat: no-repeat;                \n" +
"                opacity: 1.5;\n" +
"            }\n" +
"            .form{" +
"                background:transparent;" +
"                color: white;"+
"            }" +
"        </style>\n" +
"    </head><body><div class=\"container mt-4 form\">");
                   out.println("<h1>User found !!!</h1>");
//                   out.println("<input type=hidden name=user value=rst.getString(1)>");
                   out.println("<center>    \n" +
"                <!--user, pswd, email, mobile, addr, city, valid;-->\n" +
"                <h1> User Details</h1>\n" +
"                <form action=\"userAcConf\" method=\"post\" class=\"m-4\">\n" +
"                    <table  width=\"800\" height=600 border=1 cellspacing=0 cellpadding=10>\n" +
"                        <tr><td>User Name</td><td><input type=text name=user value="+rst.getString(1)+" required class=\"form-control\"></td></tr>\n" +
"                        <tr><td>Password</td><td><input type=password name=pswd value="+rst.getString(2)+" required class=\"form-control\" ></td></tr>\n" +
"                        <tr><td>Email</td><td><input type=email name=email value="+rst.getString(3)+" required class=\"form-control\"></td></tr>\n" +
"                        <tr><td>Mobile</td><td><input type=number name=mobile value="+rst.getString(4)+" required class=\"form-control\"></td></tr>\n" +
"                        <tr><td>Address</td><td><input type=text name=addr value="+rst.getString(5)+" required class=\"form-control\"></td></tr>\n" +
"                        <tr><td>City</td><td><input type=text name=city value="+rst.getString(6)+") required class=\"form-control\"></td></tr>\n" +
"                        <tr><td>Validity</td><td><input type=date value="+rst.getString(7)+" name=valid required class=\"form-control\"></td></tr>\n" +
//"                        <tr><td><input type=reset></td><td><input disabled type=\"submit\" value=\"add\" name=\"opr\" ></td></tr>\n" +
"                    </table>\n" +
"                </form>\n" +
"            </center></div></body></html>");
               }
               else{
                   out.println("<h1>User not found !!!</h1>");
               }
           }
           else if(request.getParameter("opr").equals("Edit"))
           {
           user.setUser(request.getParameter("user"));
           user.setPswd(request.getParameter("pswd"));
           user.setEmail(request.getParameter("email"));
           user.setMobile(request.getParameter("mobile"));
           user.setAddr(request.getParameter("addr"));
           user.setCity(request.getParameter("city"));
           user.setValid(request.getParameter("valid"));
           int i=0;
           i=user.editUser();
           if(i>0){
               out.println("<center><h1>User updated successfully</h1></center>");
           }
           else{
               out.println("<center><h1>User is not existed</h1></center>");
               
           }
           
        }
           else if(request.getParameter("opr").equals("Delete")){
//              http://localhost:8084/RSAC-UP/userAcConf?user=wdwd&opr=search
               user.setUser(request.getParameter("user"));
               int i=0;
               i=user.deleteUser();
               if(i>0){
               out.println("<center><h1>User Deleted successfully</h1></center>");
           }
           else{
               out.println("<center><h1>User is not existed</h1></center>");
               
           }
               
        }
           else if(request.getParameter("opr").equals("list")){
               
           }  
        }
        catch(Exception q){
            q.printStackTrace();
        }
    }
}
