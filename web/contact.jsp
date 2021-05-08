
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel="shortcut icon" type="image/png" href="img/favicon.png">
    <link rel="stylesheet" type="text/css" href="https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/bootstrap-3.3.5.min.css"/>
      <link rel="stylesheet" type="text/css" href="https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/font-awesome-4.6.3.min.css"/>
      <link rel="stylesheet" type="text/css" href="https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/systemv2.css?fb47c41a31603799213" />
      <link rel="stylesheet" type="text/css" href="https://cdn.powered-by-nitrosell.com/public_html/9/2091/themes/stylesheet.css?fb47c41a31603799213" />
      <script src="https://cdn.powered-by-nitrosell.com/assets/beta/assets/js/systemv2.js?fb47c41a31603799213"></script>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us / Feedback</title>
        <style>
            .container .row .col-sm-6{
                background-color: white;
                margin-top: 20px;
                border-radius: 20px;
            }
            .container .row .col-sm-5{
                background-color: white;
                margin-top: 20px;
                border-radius: 20px;
                margin-left: 20px;
            }
            .container .row .col-sm-6 p{
                margin-top: 10px;
            }
            input[type=text], select, textarea {
                width: 100%;
                padding: 12px;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
                margin-top: 6px;
                margin-bottom: 16px;
                resize: vertical;
            }

            input[type=submit] {
                background-color: #4CAF50;
                color: white;
                padding: 12px 20px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                margin-bottom: 20px;
            }

            input[type=submit]:hover {
                background-color: #45a049;
            }
            .container .row .col-sm-5 i{
                margin: 20px 20px 20px 80px;
            }
            .account a:hover{
                opacity: 0.5;
            }
            .account a{
                padding-right: 25px;
                text-decoration: none;
                opacity: 1;
            }
            footer .container .row a{
                text-decoration: none;
            }
            /* Drop down */
            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f9f9f9;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
                list-style-type: none;
            }
            .dropdown:hover .dropdown-content {
                display: block;
            }
            .dropdown-content a {
                color: black;
                padding: 10px;
                text-decoration: none;
                display: block;
                text-align: left;
                font-size: 15px;
            }
            .dropdown-content a:hover{
                color: chocolate;
            }
        </style>
    </head>
    <body>
        <%
            HttpSession s = request.getSession(true);
            String us = (String)s.getAttribute("username");
            String admin = (String) s.getAttribute("admin");
        %>
        <!-- start Header-->
                <% if (us != null){%>
                <p style="text-transform: uppercase; color: red"><img src="img/user.png" style="height: 25px; width: 25px">Hello <%=us%>!</p>
                <%} else if(admin != null){%>
                <p style="text-transform: uppercase; color: red"><img src="img/admin.jpg" style="height: 25px; width: 25px">Welcome back admin!</p>
                <%}%>
        <header>
            <div class="container">
                <div class="search">
               <div class="form-inline hidden-xs findPanel">
                      <form method="post" action="search" >
                     <input type="text" name="txtSearch" class="form-control typeahead" placeholder="Search"> 
                     <input type="submit" value="Go" class="btn btn-default" />  
                     </form>
                  </div>
                  <!--findPanel-->
                  <!--END FIND-->
               </div>
                <div class="image">
                    <a href="home" role="button">
                    <img src="img/logo5.png" style="height:100px;padding: 0 160px 0 160px" alt="Drinkstore logo">
                    </a>
                </div>
                <div class="account">
                    <a  href="shop" style="color:cyan;">Shop</a>
                    <% if (us != null) {%>
                    <li class="dropdown">
                       <a href="javascript:void(0)" class="dropbtn"> Profile</a>
                       <div class="dropdown-content">
                           <a href="profile" role="button">Update Profile</a>
                           <a  href="myorder?username=<%=us%>" role="button">My Order</a>
                       </div>
                    </li>
                   <a  href="logout" role="button">Logout</a>
                   <%} else if (admin != null) {%>
                   <li class="dropdown">
                       <a href="javascript:void(0)" class="dropbtn">Manage</a>
                       <div class="dropdown-content">
                           <a href="managercategory">Manage Category</a>
                           <a href="managerproduct">Manage Product</a>
                           <a href="manageruser">Manage User</a>
                           <a href="managerorder">View All Orders</a>
                           <a href="feedback">View Feedback</a>
                       </div>
                   </li> 
                   <a  href="logout" role="button">Logout</a>
                    <%} else {%>
                    <a href="login" role="button">Login</a>
                    <a href="register.jsp" role="button">Register</a>
                    <%}%>
                </div>
            </div>
         </header>
        <!-- end Header-->
        <!-- start Body-->
        <div class="container">
            <h1>Contact Us / Feedback</h1>
            <%
                    if (request.getAttribute("errMess") != null) {
            %>
            <h3 style="color: red"><%= request.getAttribute("errMess")%></h3>
            <%
                    }
            %>
            <div class="row">
                <div class="col-sm-6">
                    <p>Please use the form below to contact us or to send us feedback, for alternative methods our telephone, address and mailing address are also given. Fields marked * are mandatory.</p>
                    <form action="contact" method="post">
                        <label>Your Name</label><label style="font-style: italic; margin-left: 5px">*</label>
                        <input type="text"name="name" required placeholder="Your name..">

                        <label>Email</label><label style="font-style: italic; margin-left: 5px">*</label>
                        <input type="text" name="email" required placeholder="Your email..">

                        <label>Phone</label><label style="font-style: italic; margin-left: 5px">*</label>
                        <input type="text" name="phone" required placeholder="Your phone..">

                        <label>Content</label><label style="font-style: italic; margin-left: 5px">*</label>
                        <textarea  name="content" required placeholder="Write something.." style="height:200px"></textarea>

                        <input type="submit" value="Send">
                    </form>
                </div>
                <div class="col-sm-5">
                    <p style="text-align: center; font-size: 20px">More details about us:</p>
                    <i class="fa fa-phone"></i>(+84) 379855340<br>
                    <i class="fa fa-envelope"></i>1801040181@s.hanu.edu.vn<br>
                    <i class="fa fa-address-book"></i>Hanoi University, Ha Noi, Viet Nam<br>
                </div>
                
            </div>
        </div>
        <!-- end Body-->
        <!-- start Footer-->
        <footer>
        <div class="container">
            <div class="row">
                <div class="col-sm-4 hidden-xs sslCertified">
                    <h6>Help</h6>
                    <a href="about.jsp">About Us</a></br>
                    <a href="contact.jsp">Contact Us / Feedback</a></br>
                </div>
                <div class="col-sm-4 hidden-xs sslCertified" id="social">
                    <h6>Connect</h6>
                    <h6>
                    <a href=""> <i class="fa fa-facebook"></i></a>   
                    <a href=""> <i class="fa fa-twitter"></i></a>    
                    <a href=""> <i class="fa fa-instagram"></i></a>   
                    </h6>
                </div>
                <div class="col-sm-4">
                     <h6>Payment</h6>
                     <i class='fa fa-cc-visa fa-2x '></i> 
                     <i class='fa fa-cc-mastercard fa-2x '></i> 
                     <i class='fa fa-cc-amex fa-2x '></i> 
                     <i class='fa fa-cc-discover fa-2x '></i> 
                     <i class='fa fa-cc-diners-club fa-2x '></i> 
                     <i class='fa fa-cc-jcb fa-2x '></i>  
                </div>
            </div>
        </div>
            <div class="smallprint">
               <a href="trangchu.jsp" class="footerLogo" style="background:url(img/logo5.png);"></a> 
               <p class="pull-right"><a href="#" class="btn btn-default btn-backToTop"><i class="fa fa-chevron-up"></i></a></p>
               <p class = "footerCredits" style="color: red;"> <span class="current-year" style="margin-left: 50px">©2021</span> Drinkstore <i>·</i> <a href=''>Powered by Viet-Son-Huyen-Dung-Hang-Chung</a></p>
            </div>
        </footer>
        <script src="https://kit.fontawesome.com/e06505cf69.js" crossorigin="anonymous"></script>
        <!-- end Footer-->
    </body>
    </body>
</html>
