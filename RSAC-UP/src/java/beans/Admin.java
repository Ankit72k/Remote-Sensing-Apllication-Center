/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import DB.DBConnect;
import java.sql.ResultSet;

/**
 *
 * @author india
 */
public class Admin implements java.io.Serializable{
    
String user,pswd;

    public String getUser() {
        return user;
    }

    public String getPswd() {
        return pswd;
    }
public void setUser(String user){
    this.user=user;
}
public void setPswd(String pswd){
    this.pswd=pswd;
}
public ResultSet login(){
    DBConnect db=null;
 try{
     db=new DBConnect();
     db.pstmt=db.con.prepareStatement("select * from admin where user=? and pswd=?");
     db.pstmt.setString(1, user);
     db.pstmt.setString(2, pswd);
     db.rst=db.pstmt.executeQuery();
 }
 catch(Exception q){
     q.printStackTrace();
 }
 return db.rst;
}
}