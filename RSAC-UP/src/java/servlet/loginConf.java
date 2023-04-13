/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import beans.Admin;
import beans.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author india
 */
public class loginConf extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          String utype=request.getParameter("utype");
          if(utype.equals("Admin")){
              Admin admin=new Admin();
              String user=request.getParameter("user");
              String pswd=request.getParameter("pswd");              
              admin.setUser(user);
              admin.setPswd(pswd);
              ResultSet rs=admin.login();
              if(rs.next()){
                  HttpSession session=request.getSession();
                  session.setAttribute("admin_user", user);
                  session.setAttribute("admin_pswd", pswd);
                  response.sendRedirect("AdminHome.jsp");
              }
              else{
                  response.sendRedirect("index.html?msg=Inccorect userName or Password");
              }
          }
          else if(utype.equals("User")){
              String user1=request.getParameter("user");
              String pswd=request.getParameter("pswd");
              User user=new User();
              user.setUser(user1);
              user.setPswd(pswd);
              ResultSet rs=user.login();
              if(rs.next()){
                   HttpSession session=request.getSession();
                  session.setAttribute("user_user", user1);
                  session.setAttribute("user_pswd", pswd);
                  response.sendRedirect("UserHome.jsp");
              }
              else{
                  response.sendRedirect("index.html?msg=Inccorect userName or Password");
              } 
          }
          else{
              response.sendRedirect("index.html?msg=Incorrect User type");
          }
        }
        catch(Exception q){
            q.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
