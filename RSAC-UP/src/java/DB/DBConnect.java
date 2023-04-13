/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;
import java.sql.*;

/**
 *
 * @author india
 */
public class DBConnect {
 public Connection con;
 public PreparedStatement pstmt;
 public Statement stmt;
 public ResultSet rst;
 
 public DBConnect(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rsac-up","root","root");
         
     }
     catch(Exception q)
     {
         q.printStackTrace();
     }
 }
}
