
<%@page import="model.Category"%>
<%@page import="dao.ProductDAO"%>
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
        <title>All Products</title>
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
                height:100%;
                margin: 40px auto;
                padding: 20px 5px;
                background: #f1f1f1;
                boder:10px solid black;
            }

            div.about {
                boder: 10px solid brown;
                text-align: center;
            }
            footer .container .row a{
                text-decoration: none;
            }
            /* shop */
            .product {
                top: 50%;
                left: 50%;
                transform: translate(0,0);
                width: 300px;
                height: 400px;
                background: #fff;
                box-shadow: 0 5px 15px rgba(0,0,0,.25);
                border-radius: 5px;
                overflow: hidden;
                margin: 30px;
            }
            .product .imgbox {
                height: 100%;
                box-sizing: border-box;
            }
            .product .imgbox img {
                display: block;
                width: 99%;
                margin: 20px auto 0;
            }
            .details {
                position: absolute;
                width: 100%;
                bottom: -50px;
                background: #fff; 
                padding: 10px;
                box-sizing: border-box;
                box-shadow: 0 0 0 rgba(0,0,0,0);
                transition: .5s;
            }            
            .product:hover .details {
                bottom: 0;
            }
            .details h2 {
                margin: 0;
                padding: 0;
                font-size: 16px;
                width: 100%;
                font-weight: bold;
            }
            .details h2 span {
                font-size: 13px;
                color: #ccc;
                font-weight: normal;
            }
            .details .price {
                top: 10px;
                right: 10px;
                font-weight: bold;
                color: brown;
                font-size: 15px;  
            }
            .details a{
                display: block;
                padding: 5px;
                color: #fff;
                margin: 15px 0 0;
                background: burlywood;
                text-align: center;
                text-decoration: none;
                transition: .3s;
                cursor: pointer;
            }
            .details a:hover {
                background: sienna; 
            }

            .products ul,.products ul li {
                list-style: none;
                display: inline-block;
            }
            .page a{
                color: brown;
                padding: 10px;
                background-color: #fff;
                text-decoration: none;
            }
            .page a:hover{
                color: white;
                background-color: red;
            }
            .para1{
                padding-left: 10%;
            }
            #mainContainer .detail p{
                font-size: 15px;
                color: black;
                border-color: black;
                border-style: solid;
                border-width: 1px;
            }
            #mainContainer .detail{
                background-color: #fff;
                float: left;
                margin-right: -150px;
            }
            #mainContainer .detail h4{
                color: red;
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
            String us = (String) s.getAttribute("username");
            String admin = (String) s.getAttribute("admin");
            List<Product> list = (ArrayList<Product>) request.getAttribute("listProduct");
            List<Category> listcategory = (List<Category>) request.getAttribute("listcategory");
            ProductDAO pdao = new ProductDAO();
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
        <div class="para1">
                <a href="home" >Home</a>&nbsp/
                <a href="shop">All Products</a>
        </div>
        <section id="mainContainer">
            <div class="detail">
                <h4>Categories</h4>
                <% for (Category c : listcategory) {
                %>
                <a href="category?id=<%=c.getCatID()%>">
                <p><%=c.getCatname()%> (<%=pdao.getCountbyCatId(c.getCatID())%>)</p></a>
                 <%
                    }
                %>
            </div>
            <div class="about" >
                <h2 style="font-size:45px;font-family:Time New Roman">ALL PRODUCTS</h2>
                <div class="products">
                    <% for (Product p : list) {%>
                    <ul>
                        <li>
                            <div class="product">
                                <div class="imgbox">
                                    <img src="img/<%=p.getImage()%>">
                                </div>
                                <div class="details">
                                    <h2> <%=p.getName()%><br><span>Product ID: <%=p.getId()%></span></h2>
                                    <div class="price">Price: <%=p.getPrice()%>đ</div>
                                    <% if (us != null) {%>
                                     <a href="product?pid=<%=p.getId()%>&price=<%=p.getPrice()%>đ"> View Details </a>
                                    <%} else if (admin != null) {%>
                                     <a href="product?pid=<%=p.getId()%>&price=<%=p.getPrice()%>đ"> View Details </a>
                                    <a href="updateproduct?pid=<%=p.getId()%>" style="text-decoration: none;">Update</a>
                                    <a href="managerproduct?pname=<%=p.getId()%>" style="text-decoration: none;">Delete</a>
                                    <%} else {%>
                                    <a href="product?pid=<%=p.getId()%>&price=<%=p.getPrice()%>đ"> View Details </a>
                                    <%}%>                                   
                                </div>
                            </div>
                        </li>
                    </ul>
                    <% }%>
                     <div class="page">
                        <p><c:forEach begin="1" end="${maxPage}" var="i">
                                <a href="shop?txtPage=${i}">${i}</a>
                            </c:forEach></p>
                    </div>
                </div>
            </div>
        </section>
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
