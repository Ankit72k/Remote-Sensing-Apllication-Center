<%-- 
    Document   : changePwsd
    Created on : Mar 18, 2023, 2:23:19 PM
    Author     : india
--%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" class="">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>  
        
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
   
        <title>Change Password</title>
        <style>
                       .container {
                max-width: 100%;
                //margin: 0px;

                padding: 0px;
            }
            .logo{
                height: 100px;
                width: 1370px;
                background-image: url('logo-bg.jpg');
                background-size: 100% 100%;
                padding-left: 150px;
                padding-top: 15px;
            }
            .socile {
                float: none;
                display: table;
                margin: 10px auto;
                padding-left: 325px;
                padding-top: 8px;
            }
            .organization-logo {
                background-size: cover;
            }
            .a1{
                height: 520px;
                width: 100%;
                background-color: white;
            }
            .a2{
                height: 60px;
                width: 100%;
                background-color: #043211;
                color: white;
                padding-left: 150px;
                padding-top: 20px;
            }
            .a3{
                height: 1px;
                width: 100%;
                background-color: greenyellow;   
            }
            .a4{
                height: 130px;
                width: 100%;
                background-color: #043211;
                color: white;
                padding-left: 150px;
                padding-top: 20px;
                font-size: 13px;
            }
            .menuitem{
                font-size: 2vw;
                background: #043211;
            }
            .joinBtn {
                background-color: #043211;
                border: 2px;
                border-radius: 10px;
                font-weight: bold;
                cursor: pointer;
            }

            .joinBtn:hover {
                background-color: green;
            }
            .bg-text {
                background-color: rgb(0,0,0); /* Fallback color */
                background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */
                color: white;
                font-weight: bold;
                border: 3px solid #f1f1f1;
                border-radius: 10px;
                position: absolute;
                top: 60%;
                left: 50%;
                transform: translate(-50%, -50%);
                z-index: 2;
                width: 70%;
                padding: 20px;
                text-align: center;
                backdrop-filter:blur(4px);
            }
            .bg-image {
                height: 525px;
                width: 100%;
                background: black;
                color: red;
                /*background-image: url('H.jpg');*/
                /*background-repeat: no-repeat;*/
                background-size: 100% 100%;
                filter: blur(0px);
            }
            .b0 {
                width: 20em;
                height: 10ex;
                background-color: transparent ;
                border: 2px solid firebrick;
                border-radius: 10px;
                font-weight: bold;
                cursor: pointer;
                padding: 25px 10px 10px 10px;
                backdrop-filter:blur(4px);
            }
            .b0:hover {
                background-color: bisque;
            }
            ul{
                list-style-type:none;
            }
            .table1{
                height: 300px;
                width: 600px;
                /*border: 2px solid white;*/
                text-align: center;
                color:white;
            }
            .border{
                border: 2px solid red;
            }
        </style>
    </head>
    <body onload=display_ct();>
    <header>
    <div class="container">
        <div id="container"  style="width:100%; background-color: black; color: white">                            
            <div>
                <span id='ct' ></span></div>
        </div>
    </div>

    <section class="organization-logo">
        <div class="container">
            <div class="row">
                <div class="col-md-7 col-sm-7 col-xs-12">
                    <div class="logo"><a href="en" class="external none"> <img src="logo.png" alt="Remote Sensing Applications Centre , Uttar Pradesh" title="Remote Sensing Applications Centre , Uttar Pradesh" class="img-responsive"> </a></div>
                </div>
                <div class="col-md-5 col-sm-5 col-xs-12">
                    <ul class="socile">
                        <li><img src="up-logo1.png" title="Uttar Pradesh, Government" alt="Uttar Pradesh, Government"></li></ul>
                </div>
            </div>
        </div>
    </section>
</header>
<div class="middle">
<section class="container menuitem">
    <div class="row">
        <div class="col-1" style="padding-left:150px;"></div>
        <div class="col-1 joinBtn"><a href="index.html" style="text-decoration:none;color: white;">Home</a></div>
        <div class="col-4"></div>
    </div>
</section>
<section id="main-content">
    <div class="bg-image">
        <br><center><h1><u>Change Password</u></h1></center><br><br>
        <div class="login">
            <center>
                <form action="changePswdConf" method="post">
                    <table class=" table1">
                        <tr>
                            <td><input type="text" name="old_pswd" placeholder="Enter old Password" class="border form-control" >
                            </td>
                        </tr>
                        <tr>
                            <td><input type="text" name="new_pswd" placeholder="Enter new Password" class="border form-control" >
                            </td>
                        </tr>
                        <tr>
                            <td><input type="text" name="con_pswd" placeholder="Confirm new Password" class="border form-control" >
                            </td>
                        </tr>  
                        <tr>
                            <td><input class="btn-danger form-control border" type="submit" value="Change Password"></td>
                        </tr>
                    </table>
                </form>
            </center>
        </div>
    </div>
</section>
</div>
<footer>
    <div class="container">
        <div class="a2">
            <a class="external none" href="#" style='text-decoration:none;color: white;'>Terms &amp; Conditions |</a>
            <a class="external none" href="#" style='text-decoration:none;color: white;'>Copyright Policy | </a>
            <a class="external none" href="#" style='text-decoration:none;color: white;'>Privacy Policy | </a>
            <a class="external none" href="#" style='text-decoration:none;color: white;'>Hyperlinking Policy | </a>
            <a class="external none" href="#" style='text-decoration:none;color: white;'>Disclaimer | </a>
            <a class="external none" href="#" style='text-decoration:none;color: white;'>Help</a>
        </div>
        <div class="a3"></div>
            <div class="a4">
                <p>© 2017 Remote Sensing Applications Center , Uttar Pradesh<br> This is the official Website of Remote
                Sensing Applications Center,Uttar Pradesh.<br>Content on this Website is published and managed by Remote
                Sensing Applications Center, Uttar Pradesh.<br>For any query regarding this Website, Please contact the
                "<a href="#" title="Web Information Manager" class="external none"
                style="color: #fff;">Web Information Manager</a>".</p>
            </div>
        </div>
    </footer>
    <script type="text/javascript">
        function display_c() {
            var refresh = 1000; // Refresh rate in milli seconds
            mytime = setTimeout('display_ct()', refresh)
        }
            function display_ct() {
            var x = new Date()
            document.getElementById('ct').innerHTML = x;
            display_c();
        }
    </script>
</body>
</html>