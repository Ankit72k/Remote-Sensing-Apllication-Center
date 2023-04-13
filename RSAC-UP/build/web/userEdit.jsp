<%-- 
    Document   : userReg
    Created on : Feb 23, 2023, 1:06:12 AM
    Author     : india
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Updation</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
        <style>
            td{
                font-size:30px;
                font-weight: bold;
            }
            td input{
                font-size:30px;
                color: black;
                font-weight: bold;
            }
            body{
                background-image: url("d.jpeg");
                background-size: 100% 100%;
                background-repeat: no-repeat;                
                opacity: 1.5;
            }
            .form{
                background:transparent;
                color: white;
            }
        </style>
    </head>
    <body >
        <div class="container mt-4 form">
            <center>    
                <!--user, pswd, email, mobile, addr, city, valid;-->
                <h1> User Updation</h1>
                <form action="userAcConf" method="post" class="m-4">
                    <table  width="800" height=600 border=1 cellspacing=0 cellpadding=10>
                        <tr><td>User Name</td><td><input type=text name=user required class="form-control"></td></tr>
                        <tr><td>Password</td><td><input type=password name=pswd required class="form-control" ></td></tr>
                        <tr><td>Email</td><td><input type=email name=email required class="form-control"></td></tr>
                        <tr><td>Mobile</td><td><input type=number name=mobile required class="form-control"></td></tr>
                        <tr><td>Address</td><td><input type=text name=addr required class="form-control"></td></tr>
                        <tr><td>City</td><td><input type=text name=city required class="form-control"></td></tr>
                        <tr><td>Validity</td><td><input type=date name=valid required class="form-control"></td></tr>
                        <tr><td><input type=reset></td><td><input type="submit" value="Edit" name="opr" ></td></tr>
                    </table>
                </form>
            </center>
        </div>
    </body>
</html>

