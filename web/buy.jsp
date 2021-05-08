<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel="shortcut icon" type="image/png" href="img/favicon.png">
      <link rel="stylesheet" type="text/css" href="https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/bootstrap-3.3.5.min.css"/>
      <link rel="stylesheet" type="text/css" href="https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/font-awesome-4.6.3.min.css"/>
      <link rel="stylesheet" type="text/css" href="https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/systemv2.css?fb47c41a31603799213" />
      <link rel="stylesheet" type="text/css" href="https://cdn.powered-by-nitrosell.com/public_html/9/2091/themes/stylesheet.css?fb47c41a31603799213" />
      <script src="https://cdn.powered-by-nitrosell.com/assets/beta/assets/js/systemv2.js?fb47c41a31603799213"></script>
      <script>
         nsc(document).ready(function() {
         setCarouselTriggers();});
         setCarouselTriggers = function() {nsc('.product-carousel-specialoffer').owlCarousel({"title":"Special Offers"});
         nsc('.product-carousel-promotion').owlCarousel({"title":"Promotions"});
         nsc('.product-carousel-newproduct').owlCarousel({"title":"New Products"});
         nsc('.product-carousel-itemrelatedbytheme').owlCarousel({"title":"Related Items"});
         nsc('.product-carousel-recentlyvieweditems').owlCarousel({"title":"Recently Viewed Items"});
         nsc('.product-carousel-homepageslider').owlCarousel({"title":"Home Page Slider","singleItem":true,"navigation":true,"navigationText":["&amp;amp;amp;amp;amp;lt;i class=&amp;amp;amp;amp;amp;quot;fa fa-chevron-left&amp;amp;amp;amp;amp;quot;&amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;lt;\/i&amp;amp;amp;amp;amp;gt;","<i class=\"fa fa-chevron-right\"><\/i>"],"autoPlay":true});
         nsc('.product-carousel-Brands').owlCarousel({"navigation":true,"autoPlay":true,"items":7,"itemsMobile":0});
         };nsc(document).on('matrixupdated', function(){  setCarouselTriggers();});
      </script>
    <head>
        <title>Order Successfully!!!</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

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
            .container .category h3{
                font-family: Aria;
                margin-left: auto;
                padding-top: 50px;
            }
            .slider h3{
                font-family: Aria;
                margin-left: 175px;
                padding-bottom: 20px;
                margin-top: -60px;
            }
            .container .category .image img{
                border: black;
                border-style: solid;
                margin-right: 30px;
                margin-top: 20px;
                height: 150px;
                width: 150px;
            }
            .container .category .image img:hover{
                transform: translateY(-10px);
                box-shadow: 0 15px 15px #000;
                border: #32CD32;
                border-style: solid;
            }
            #image{
                background-color: #EAE9E5;
                margin: 15px;
            }
            #image h5{
                text-align: center;
                font-family: Aria;
                font-weight: bold;
            }
            .account a{
                padding-right: 25px;
                text-decoration: none;
                opacity: 1;
            }
            .account a:hover{
                opacity: 0.5;
            }
           .page-home p{
                color: red;
            }
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
            .container1 {
                text-align: center;
            }
            footer .container .row a{
                text-decoration: none;
            }
            .container1 .detail a{
                text-decoration: none;
            }
            @-webkit-keyframes my {
                0% { color: #F8CD0A; } 
                50% { color: #fff;  } 
                100% { color: #F8CD0A;  } 
            }
            @-moz-keyframes my { 
                0% { color: #F8CD0A;  } 
                50% { color: #fff;  }
                100% { color: #F8CD0A;  } 
            }
            @-o-keyframes my { 
                0% { color: #F8CD0A; } 
                50% { color: #fff; } 
                100% { color: #F8CD0A;  } 
            }
            @keyframes my { 
                0% { color: #F8CD0A;  } 
                50% { color: #fff;  }
                100% { color: #F8CD0A;  } 
            } 
            .test {
                background:#3d3d3d;
                font-size:24px;
                font-weight:bold;
                padding: 5px;
                width: 400px;
                margin: auto;
                -webkit-animation: my 700ms infinite;
                -moz-animation: my 700ms infinite; 
                -o-animation: my 700ms infinite; 
                animation: my 700ms infinite;
            }
        </style>
        
    </head>

    <body>
        <%
            HttpSession s = request.getSession(true);
            String us = (String)s.getAttribute("username");
            String admin = (String) s.getAttribute("admin");
            Product p = (Product)request.getAttribute("product");
            int quantity = (Integer)request.getAttribute("quantity");
            int totalprice = (Integer)request.getAttribute("totalprice");
        %>
        <div class="wholepage page-home">
        <!-- start Header-->
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
        <div class="container1">
            <div class="img">
                <img src="img/<%=p.getImage()%>" style="width:370px;height:400px;" class="img-thumbnail img-responsive img-circle"></img>
            </div>
            <div class="detail">
                <h6><%=p.getName()%></h6>
                <h6>Quantity:<%=quantity%> || Price:<%=p.getPrice()%></h6>
                <h5>Total Price:<%=totalprice%></h5>
                <p>Your order is successfully!!!</p>
                <h4 class="test" style="margin-top: 30px;margin-bottom: 30px;">Thank you for your order!</h4>
                <button style="margin-right: 100px;;"><a href="home">Back to Home</a></button>
                <button><a href="product?pid=<%=p.getId()%>&price=<%=p.getPrice()%>">Back to Product</a></button>
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
                    <a href="https://www.facebook.com/tunglam.hoang.9275/"> <i class="fa fa-facebook"></i></a>   
                    <a href="https://www.facebook.com/tunglam.hoang.9275/"> <i class="fa fa-twitter"></i></a>    
                    <a href="https://www.instagram.com/lam_ht13/"> <i class="fa fa-instagram"></i></a>   
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
        </div>
    </body>
</html>