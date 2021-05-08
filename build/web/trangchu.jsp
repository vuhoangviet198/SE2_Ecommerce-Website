<%@page import="java.util.List"%>
<%@page import="model.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <link rel="stylesheet" type="text/css" href="https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/bootstrap-3.3.5.min.css"/>
      <link rel="stylesheet" type="text/css" href="https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/font-awesome-4.6.3.min.css"/>
      <link rel="stylesheet" type="text/css" href="https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/systemv2.css?fb47c41a31603799213" />
      <link rel="stylesheet" type="text/css" href="https://cdn.powered-by-nitrosell.com/public_html/9/2091/themes/stylesheet.css?fb47c41a31603799213" />
      <link rel="shortcut icon" type="image/png" href="img/favicon.png">
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
        <title>Home | Drink Store</title>
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
            .container .para2 img{
                border-radius: 10px;
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
            footer .container .row a{
                text-decoration: none;
            }
        </style>
        
    </head>

    <body>
        <%
            HttpSession s = request.getSession(true);
            String us = (String)s.getAttribute("username");
            String admin = (String) s.getAttribute("admin");
            String pid = (String) request.getAttribute("pid");
            String price = (String) request.getAttribute("price");
            List<Category> listcategory = (List<Category>) request.getAttribute("listcategory");
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
                  <!--START FIND-->
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
            <div class="para1">
                <h2 style="color: red"><span style="color:#32CD32">Welcome to our Shop!</span></br><h4 style="color:red">The leading distributor of premium drinks in Vietnam</h4></br></h2></br>
                <h5>We keep up to date with the latest products on the market <br>for drinking and make sure our products are the best!
                    </br></br>Browse our signature products and get your<br> next order at your door now.
                </h5>
                <p><a href="about.jsp"> More about us ... </a></p>
            </div>
            <div class="para2">
                <img src="img/drink3.jpg">
            </div>
        </div>
        <div id="slider" class="slider">
            <h3>Special offer</h3>
            <div class="carousel-slideshow image-carousel">
               <div class="product-carousel-homepageslider">
                  <div class="slide">  <a href="product?pid=SP07"> <img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/BuffaloTraceOffer.jpg"></a></div>
                  <div class="slide">  <a href="product?pid=SP05"> <img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Sierrabanner.jpg"> </a></div>
                  <div class="slide">  <a href="product?pid=SP08"> <img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/dalymount.jpg"> </a></div>
                  <div class="slide">  <a href="product?pid=SP09"> <img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/BannerNosingglasses.jpg"></a></div>
               </div>
            </div>
         </div>
        <div id="brands-carousel">
            <div class="container">
               <div class="carousel-slideshow image-carousel">
                  <div class="product-carousel-Brands">
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/BrewDog.jpg" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Ska.png" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/WhiteHag.jpg" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/SierraNevada.png" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Founders.png" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/OdellBrewing.png" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Kinnegar.png" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Metalman.png" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/TroubleBrewing.jpg" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/GalwayHooker.png" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Yellowbelly.png" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/8degrees1.png" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Teelings.jpg" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Craigies.jpg" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/GalwayBay.jpg" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Jameson.png" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/OHaras.jpg" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Hendricks.jpg" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Weihenstephan.png" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Dungarvan.jpg" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Dingle.jpg" alt=""> </a>   </div>
                     <div class="slide"><img src="https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Lagunitas.png" alt=""> </a>   </div>
                  </div>
               </div>
            </div>
         </div>
        <div class="container">
            <div class="category">
                <h3>Drink Category</h3><br>
                <% for (Category c : listcategory) {
                %>
                <div class="image col-xs-6 col-sm-4 col-md-2" id="image">
                    <a href="category?id=<%=c.getCatID()%>">
                        <img class = "img-thumbnail img-responsive preview img-circle" src = "img/<%=c.getDescription()%>"></a>
                    <h5><%=c.getCatname()%></h5>
                </div>
                <%
                    }
                %>
            </div>
        </div>

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
                    <a href="https://www.facebook.com/son.triplelift.1309/"> <i class="fa fa-facebook"></i></a>   
                    <a href="https://www.facebook.com/son.triplelift.1309/"> <i class="fa fa-twitter"></i></a>    
                    <a href="https://www.instagram.com/sontriplelift13/"> <i class="fa fa-instagram"></i></a>   
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