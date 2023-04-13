<%-- 
    Document   : userSearch
    Created on : Feb 27, 2023, 12:10:27 PM
    Author     : india
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search User</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
   
        <style>
            h1{
                text-align: center;
            }
        </style>
    </head>
    <body>
    <center>
        <h1>User search</h1>
        <form action="userAcConf" method="get">
            <table class="" width=600 height=150 bgcolor=#aaffaa>
                <tr><td>Enter User Name</td><td><input type=search name=user></tr>
                <tr><td><input type=reset value=RESET></td><td><input type=submit name="opr" value=search></td></tr>
            </table>
        </form>
    </center>
    </body>
</html>
