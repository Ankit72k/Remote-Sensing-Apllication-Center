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
public class User implements java.io.Serializable {

    String user, pswd, email, mobile, addr, city, valid;

    public void setUser(String user) {
        this.user = user;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getUser() {
        return user;
    }

    public String getPswd() {
        return pswd;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddr() {
        return addr;
    }

    public String getCity() {
        return city;
    }

    public String getValid() {
        return valid;
    }

    public ResultSet login() {
        DBConnect db = null;
        try {
            db = new DBConnect();
            db.pstmt = db.con.prepareStatement("select * from user where user=? and pswd=?");
            db.pstmt.setString(1, user);
            db.pstmt.setString(2, pswd);
            db.rst = db.pstmt.executeQuery();
        } catch (Exception q) {
            q.printStackTrace();
        }
        return db.rst;
    }

    public int addUser() {
        int i=0;
        try {
            DBConnect db = new DBConnect();
            db.pstmt = db.con.prepareStatement("insert into user(user, pswd, email, mobile, addr, city, valid) value(?,?,?,?,?,?,?)");
            db.pstmt.setString(1, user);
            db.pstmt.setString(2, pswd);
            db.pstmt.setString(3, email);
            db.pstmt.setString(4, mobile);
            db.pstmt.setString(5, addr);
            db.pstmt.setString(6, city);
            db.pstmt.setString(7, valid);
            i=db.pstmt.executeUpdate();
            
        }
        catch(Exception q){
            q.printStackTrace();
        }
        return i; 
    }
    public int deleteUser(){
        int i=0;
    try{
        DBConnect db=new DBConnect();
        db.pstmt=db.con.prepareStatement("delete from user where user=?");
        db.pstmt.setString(1, user);
        i=db.pstmt.executeUpdate();
    }
    catch(Exception q){
        q.printStackTrace();
    }
    return i;
    }
    
    public ResultSet searchUser(){
         DBConnect db=null;
    try{
        db=new DBConnect();
        db.pstmt=db.con.prepareStatement("select * from user where user=?");
        db.pstmt.setString(1, user);
        db.rst=db.pstmt.executeQuery();
    }
    catch(Exception q){
        q.printStackTrace();
    }
    return db.rst;
    }
     public int editUser(){
        int i=0;
    try{
        DBConnect db=new DBConnect();
        db.pstmt=db.con.prepareStatement("update user set pswd=?, email=?, mobile=?, addr=?, city=?, valid=? where user=?");
        db.pstmt.setString(1, pswd);
        db.pstmt.setString(2, email);
        db.pstmt.setString(3, mobile);
        db.pstmt.setString(4, addr);
        db.pstmt.setString(5, city);
        db.pstmt.setString(6, valid);
        db.pstmt.setString(7, user);
        i=db.pstmt.executeUpdate();
    }
    catch(Exception q){
        q.printStackTrace();
    }
    return i;
    }
}
