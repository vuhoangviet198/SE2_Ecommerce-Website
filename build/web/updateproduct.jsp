
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <title>Update Product</title>
        <style>
            .container .para1{
                padding-left: auto;
            }
            .container .para1 a{
                color: red;
            }
            .container .para1 h5{
                font-family: sans-serif;
            }
            .container .para2{
                float: right;
                height: 400px;
                width: 400px;
                margin-top: -300px;
            }
            .account a{
                padding-right: 25px;
                text-decoration: none;
                opacity: 1;
            }
            .account a:hover{
                opacity: 0.5;
            }
            p{
                color: red;
            }  
            /* Content */

            #mainContainer {
                width: 1200px;
                height:600px;
                margin: 40px auto;
                padding: 20px 5px;
                background: #fff;
                boder:10px solid black;
            }
            #mainContainer .about .imgbox img{
                width: 300px;
                height: 300px;
                padding-bottom: 50px;
            }
            #mainContainer .about .imgbox p{
                color: black;
                border: black;
                border-style: solid;
            }
            div.about {
                boder: 10px solid brown;
                text-align: left;
            }
            .imgbox{
                float: left;
                margin-left: 50px;
                border: #000;
                border-right-style: solid;
            }         
            .detail{
                float: right;
                text-align: right;
                margin-right: 120px;               
            }
            input[type=file]{
                border-style: solid;
                border-width: 1px;
                font-size: 15px;
                margin-left: 1000px;
            }
            .detail input{
                margin: 5px;
            }
            .detail h2 {
                color: maroon;
                font-size: 30px;
            }
            .detail p{
                color: black;
                border: #000;
                border-style: solid;
                padding: 10px;
                border-width: 1px;
            }
            .detail label{
                color: black;
                font-weight: normal;
                margin-right: 210px;
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
            .file{
                position: absolute;
                left: 360px;
                width: 300px;
                margin-bottom: 5px;
                border-left: 0;
            }
            .det{
                position: relative;
                display: flex;
                margin-bottom: 12px;
            }
            .det p{
                position: absolute;
                left: 285px;
                border-style: none;
            }
            .dropdown-content a:hover{
                color: chocolate;
            }
        </style>
    </head>
    <body>
        <%
            HttpSession s = request.getSession(true);
            String us = (String) s.getAttribute("username");
            String admin = (String) s.getAttribute("admin");
            Product p = (Product)request.getAttribute("productp");
        %>
        <% if (us != null){%>
                <p style="text-transform: uppercase;"><img src="img/user.png" style="height: 25px; width: 25px">Hello <%=us%>!</p>
                <%} else if(admin != null){%>
                <p style="text-transform: uppercase;"><img src="img/admin.jpg" style="height: 25px; width: 25px">Welcome back admin!</p>
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
                           <a  href="myorder" role="button">My Order</a>
                       </div>
                    </li>
                   <a  href="logout" role="button">Logout</a>>
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
        <form method="post" action="updateproduct?pid=<%=p.getId()%>" >
        <section id="mainContainer">
            <div class="about" >
                <div class="imgbox col-sm-4">
                    <img src="img/<%=p.getImage()%>">
                    <h6>Detail</h6><br>
                    <p>Name: <%=p.getName()%></p>
                    <p>Price: <%=p.getPrice()%>đ</p>
                    <p>Description: <%=p.getDescription()%></p>
                </div>
                <div class="detail col-sm-6"> 
                    <h2>Update Information</h2>
                    Product Name: <input type="text" name="pname"><br>
                    Product Price: <input type="text" name="pprice"><br>
                    Category ID: <input type="text" name="categoryid"><br>
                    <div class="det">
                    <p>Image:</p> <input class="file"type="file" name="image" id="myfile"><br>
                    </div>                    
                    Product Description: <input type="text" name="pdescription" style="height: 150px;"><br>
                    <input type="submit" value="UPDATE" style="color: red; margin-right: 80px; margin-top: 20px"><br>
                    <%
                            if (request.getAttribute("errMess") != null) {
                    %>
                        <h5 style="color: red"><%=request.getAttribute("errMess")%></h5>
                    <%
                            }
                    %>
                </div>
            </div>
        </section>
         </form>
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
               <p class = "footerCredits"> <span class="current-year" style="margin-left: 50px">©2021</span> Drinkstore <i>·</i> <a href=''>Powered by Viet-Son-Huyen-Dung-Hang-Chung</a></p>
            </div>
        </footer>
        <script src="https://kit.fontawesome.com/e06505cf69.js" crossorigin="anonymous"></script>
        <!-- end Footer-->
    </body>
    </body>
</html>
