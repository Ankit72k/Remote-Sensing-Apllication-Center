

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Home Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
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
                height: 700px;
                width: 100%;
                color: white;
                background-image: url('background2.jpg');
                background-repeat: no-repeat;
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
                tansition:all 10s;
            }
            .b0 a{
                text-decoration:none;
                color: white;
                
            }
            .b0 a:hover{
                text-decoration:none;
                color:black;
                
            }
            .b0:hover {
                background-color: #22ff88;
                box-shadow: 2px 2px 2px 2px red;
                width: 22em;
            }
            ul{
                list-style-type:none;
            }
            .table1{
                height: 300px;
                width: 600px;
                border: 2px solid white;
                text-align: center;
                color:white;
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
<section class="container menuitem">
    <div class="row">
        <%
        session=request.getSession();
        String user=session.getAttribute("user_user").toString();
        %>
        <div class="col-6" style="padding-left:100px;color:white;"><h1>Hello <%=user%></h1></div>
        <!--<div class="col-1 joinBtn"><a href="" style="text-decoration:none;color: white;">LOGIN</a></div>-->
        <div class="col-4"></div>
        <div class="col-1 joinBtn"><a href="index.html" style="text-decoration:none;color: white;">LOGOUT</a></div>
    </div>
</section>
<section id="main-content">
    <div class="bg-image">
        <br><center><h1 style="color:black;">User Home</h1></center><br><br>
        <div>
            <center style="color:black;">
                <h2>Welcome in User Home Page<br>RSAC-UP</h2>
            </center>
        </div>
    </div>
</section>
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
