package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Category;
import java.util.ArrayList;

public final class trangchu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/bootstrap-3.3.5.min.css\"/>\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/font-awesome-4.6.3.min.css\"/>\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/systemv2.css?fb47c41a31603799213\" />\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.powered-by-nitrosell.com/public_html/9/2091/themes/stylesheet.css?fb47c41a31603799213\" />\n");
      out.write("      <script src=\"https://cdn.powered-by-nitrosell.com/assets/beta/assets/js/systemv2.js?fb47c41a31603799213\"></script>\n");
      out.write("      <script>\n");
      out.write("         nsc(document).ready(function() {\n");
      out.write("         setCarouselTriggers();});\n");
      out.write("         setCarouselTriggers = function() {nsc('.product-carousel-specialoffer').owlCarousel({\"title\":\"Special Offers\"});\n");
      out.write("         nsc('.product-carousel-promotion').owlCarousel({\"title\":\"Promotions\"});\n");
      out.write("         nsc('.product-carousel-newproduct').owlCarousel({\"title\":\"New Products\"});\n");
      out.write("         nsc('.product-carousel-itemrelatedbytheme').owlCarousel({\"title\":\"Related Items\"});\n");
      out.write("         nsc('.product-carousel-recentlyvieweditems').owlCarousel({\"title\":\"Recently Viewed Items\"});\n");
      out.write("         nsc('.product-carousel-homepageslider').owlCarousel({\"title\":\"Home Page Slider\",\"singleItem\":true,\"navigation\":true,\"navigationText\":[\"&amp;amp;amp;amp;amp;lt;i class=&amp;amp;amp;amp;amp;quot;fa fa-chevron-left&amp;amp;amp;amp;amp;quot;&amp;amp;amp;amp;amp;gt;&amp;amp;amp;amp;amp;lt;\\/i&amp;amp;amp;amp;amp;gt;\",\"<i class=\\\"fa fa-chevron-right\\\"><\\/i>\"],\"autoPlay\":true});\n");
      out.write("         nsc('.product-carousel-Brands').owlCarousel({\"navigation\":true,\"autoPlay\":true,\"items\":7,\"itemsMobile\":0});\n");
      out.write("         };nsc(document).on('matrixupdated', function(){  setCarouselTriggers();});\n");
      out.write("      </script>\n");
      out.write("    <head>\n");
      out.write("        <title>PRJ321</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .container .para1{\n");
      out.write("                padding-left: auto;\n");
      out.write("            }\n");
      out.write("            .container .para1 a{\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("            .container .para1 h5{\n");
      out.write("                font-family: sans-serif;\n");
      out.write("            }\n");
      out.write("            .container .para2{\n");
      out.write("                float: right;\n");
      out.write("                height: 400px;\n");
      out.write("                width: 400px;\n");
      out.write("                margin-top: -300px;\n");
      out.write("            }\n");
      out.write("            .container .para2 img{\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("            .container .category h3{\n");
      out.write("                font-family: Aria;\n");
      out.write("                margin-left: auto;\n");
      out.write("                padding-top: 50px;\n");
      out.write("            }\n");
      out.write("            .slider h3{\n");
      out.write("                font-family: Aria;\n");
      out.write("                margin-left: 175px;\n");
      out.write("                padding-bottom: 20px;\n");
      out.write("                margin-top: -60px;\n");
      out.write("            }\n");
      out.write("            .container .category .image img{\n");
      out.write("                border: black;\n");
      out.write("                border-style: solid;\n");
      out.write("                margin-right: 30px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                height: 150px;\n");
      out.write("                width: 150px;\n");
      out.write("            }\n");
      out.write("            .container .category .image img:hover{\n");
      out.write("                transform: translateY(-10px);\n");
      out.write("                box-shadow: 0 15px 15px #000;\n");
      out.write("                border: #32CD32;\n");
      out.write("                border-style: solid;\n");
      out.write("            }\n");
      out.write("            #image{\n");
      out.write("                background-color: #EAE9E5;\n");
      out.write("                margin: 15px;\n");
      out.write("            }\n");
      out.write("            #image h5{\n");
      out.write("                text-align: center;\n");
      out.write("                font-family: Aria;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .account a{\n");
      out.write("                padding-right: 25px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("            .account a:hover{\n");
      out.write("                opacity: 0.5;\n");
      out.write("            }\n");
      out.write("           .page-home p{\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("            .dropdown-content {\n");
      out.write("                display: none;\n");
      out.write("                position: absolute;\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("                min-width: 160px;\n");
      out.write("                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("                z-index: 1;\n");
      out.write("                list-style-type: none;\n");
      out.write("            }\n");
      out.write("            .dropdown:hover .dropdown-content {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("            .dropdown-content a {\n");
      out.write("                color: black;\n");
      out.write("                padding: 10px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("                text-align: left;\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("            .dropdown-content a:hover{\n");
      out.write("                color: chocolate;\n");
      out.write("            }\n");
      out.write("            footer .container .row a{\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            HttpSession s = request.getSession(true);
            String us = (String)s.getAttribute("username");
            String admin = (String) s.getAttribute("admin");
            String pid = (String) request.getAttribute("pid");
            String price = (String) request.getAttribute("price");
            List<Category> listcategory = (List<Category>) request.getAttribute("listcategory");
        
      out.write("\n");
      out.write("        <div class=\"wholepage page-home\">\n");
      out.write("        <!-- start Header-->\n");
      out.write("                ");
 if (us != null){
      out.write("\n");
      out.write("                <p style=\"text-transform: uppercase;\"><img src=\"img/user.png\" style=\"height: 25px; width: 25px\">Hello ");
      out.print(us);
      out.write("!</p>\n");
      out.write("                ");
} else if(admin != null){
      out.write("\n");
      out.write("                <p style=\"text-transform: uppercase;\"><img src=\"img/admin.jpg\" style=\"height: 25px; width: 25px\">Welcome back admin!</p>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("               <div class=\"search\">\n");
      out.write("                  <!--START FIND-->\n");
      out.write("                  <div class=\"form-inline hidden-xs findPanel\">\n");
      out.write("                      <form method=\"post\" action=\"search\" >\n");
      out.write("                     <input type=\"text\" name=\"txtSearch\" class=\"form-control typeahead\" placeholder=\"Search\"> \n");
      out.write("                     <input type=\"submit\" value=\"Go\" class=\"btn btn-default\" />  \n");
      out.write("                     </form>\n");
      out.write("                  </div>\n");
      out.write("                  <!--findPanel-->\n");
      out.write("                  <!--END FIND-->\n");
      out.write("               </div>\n");
      out.write("                <div class=\"image\">\n");
      out.write("                    <a href=\"home\" role=\"button\">\n");
      out.write("                    <img src=\"img/logo5.png\" style=\"height:100px;padding: 0 160px 0 160px\" alt=\"Drinkstore logo\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"account\">\n");
      out.write("                    <a  href=\"shop\" style=\"color:cyan;\">Shop</a>\n");
      out.write("                    ");
 if (us != null) {
      out.write("\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                       <a href=\"javascript:void(0)\" class=\"dropbtn\"> Profile</a>\n");
      out.write("                       <div class=\"dropdown-content\">\n");
      out.write("                           <a href=\"profile\" role=\"button\">Update Profile</a>\n");
      out.write("                           <a  href=\"myorder?username=");
      out.print(us);
      out.write("\" role=\"button\">My Order</a>\n");
      out.write("                       </div>\n");
      out.write("                    </li>\n");
      out.write("                    <a  href=\"logout\" role=\"button\">Logout</a>\n");
      out.write("                   ");
} else if (admin != null) {
      out.write("\n");
      out.write("                   <li class=\"dropdown\">\n");
      out.write("                       <a href=\"javascript:void(0)\" class=\"dropbtn\"> Manager</a>\n");
      out.write("                       <div class=\"dropdown-content\">\n");
      out.write("                           <a href=\"managerproduct\">Manager Product</a>\n");
      out.write("                           <a href=\"manageruser\">Manager User</a>\n");
      out.write("                           <a href=\"feedback\">View Feedback</a>\n");
      out.write("                       </div>\n");
      out.write("                   </li>\n");
      out.write("                   <a  href=\"logout\" role=\"button\">Logout</a>\n");
      out.write("                    ");
} else {
      out.write("\n");
      out.write("                    <a href=\"login\" role=\"button\">Login</a>\n");
      out.write("                    <a href=\"register.jsp\" role=\"button\">Register</a>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("         </header>\n");
      out.write("        <!-- end Header-->\n");
      out.write("        <!-- start Body-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"para1\">\n");
      out.write("                <h2 style=\"color: red\"><span style=\"color:#32CD32\">Welcome to my Shop!</span></br><h4 style=\"color:red\">The best drink shop website of Viet Nam</h4></br></h2></br>\n");
      out.write("                <h5>We keep up to date with the latest products on the market <br>for drinking and make sure our products are the best!\n");
      out.write("                    </br></br>Browse our signature products and get your<br> next order at your door now.\n");
      out.write("                </h5>\n");
      out.write("                <p><a href=\"about.jsp\"> More about us </a></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"para2\">\n");
      out.write("                <img src=\"img/drink3.jpg\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"slider\" class=\"slider\">\n");
      out.write("            <h3>Special offer</h3>\n");
      out.write("            <div class=\"carousel-slideshow image-carousel\">\n");
      out.write("               <div class=\"product-carousel-homepageslider\">\n");
      out.write("                  <div class=\"slide\">  <a href=\"product?pid=SP07\"> <img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/BuffaloTraceOffer.jpg\"></a></div>\n");
      out.write("                  <div class=\"slide\">  <a href=\"product?pid=SP05\"> <img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Sierrabanner.jpg\"> </a></div>\n");
      out.write("                  <div class=\"slide\">  <a href=\"product?pid=SP08\"> <img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/dalymount.jpg\"> </a></div>\n");
      out.write("                  <div class=\"slide\">  <a href=\"product?pid=SP09\"> <img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/BannerNosingglasses.jpg\"></a></div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("        <div id=\"brands-carousel\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("               <div class=\"carousel-slideshow image-carousel\">\n");
      out.write("                  <div class=\"product-carousel-Brands\">\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/BrewDog.jpg\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Ska.png\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/WhiteHag.jpg\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/SierraNevada.png\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Founders.png\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/OdellBrewing.png\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Kinnegar.png\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Metalman.png\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/TroubleBrewing.jpg\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/GalwayHooker.png\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Yellowbelly.png\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/8degrees1.png\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Teelings.jpg\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Craigies.jpg\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/GalwayBay.jpg\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Jameson.png\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/OHaras.jpg\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Hendricks.jpg\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Weihenstephan.png\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Dungarvan.jpg\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Dingle.jpg\" alt=\"\"> </a>   </div>\n");
      out.write("                     <div class=\"slide\"><img src=\"https://cdn.powered-by-nitrosell.com/store_images/9/2091/image_carousel/Lagunitas.png\" alt=\"\"> </a>   </div>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"category\">\n");
      out.write("                <h3>Drink Category</h3><br>\n");
      out.write("                ");
 for (Category c : listcategory) {
                
      out.write("\n");
      out.write("                <div class=\"image col-xs-6 col-sm-4 col-md-2\" id=\"image\">\n");
      out.write("                    <a href=\"category?id=");
      out.print(c.getCatID());
      out.write("\">\n");
      out.write("                        <img class = \"img-thumbnail img-responsive preview img-circle\" src = \"img/");
      out.print(c.getDescription());
      out.write("\"></a>\n");
      out.write("                    <h5>");
      out.print(c.getCatname());
      out.write("</h5>\n");
      out.write("                </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- start Footer-->\n");
      out.write("        <footer>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4 hidden-xs sslCertified\">\n");
      out.write("                    <h6>Help</h6>\n");
      out.write("                    <a href=\"about.jsp\">About Us</a></br>\n");
      out.write("                    <a href=\"contact.jsp\">Contact Us</a></br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4 hidden-xs sslCertified\" id=\"social\">\n");
      out.write("                    <h6>Connect</h6>\n");
      out.write("                    <h6>\n");
      out.write("                    <a href=\"https://www.facebook.com/tunglam.hoang.9275/\"> <i class=\"fa fa-facebook\"></i></a>   \n");
      out.write("                    <a href=\"https://www.facebook.com/tunglam.hoang.9275/\"> <i class=\"fa fa-twitter\"></i></a>    \n");
      out.write("                    <a href=\"https://www.instagram.com/lam_ht13/\"> <i class=\"fa fa-instagram\"></i></a>   \n");
      out.write("                    </h6>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                     <h6>Payment</h6>\n");
      out.write("                     <i class='fa fa-cc-visa fa-2x '></i> \n");
      out.write("                     <i class='fa fa-cc-mastercard fa-2x '></i> \n");
      out.write("                     <i class='fa fa-cc-amex fa-2x '></i> \n");
      out.write("                     <i class='fa fa-cc-discover fa-2x '></i> \n");
      out.write("                     <i class='fa fa-cc-diners-club fa-2x '></i> \n");
      out.write("                     <i class='fa fa-cc-jcb fa-2x '></i>  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"smallprint\">\n");
      out.write("               <a href=\"trangchu.jsp\" class=\"footerLogo\" style=\"background:url(img/logo5.png);\"></a> \n");
      out.write("               <p class=\"pull-right\"><a href=\"#\" class=\"btn btn-default btn-backToTop\"><i class=\"fa fa-chevron-up\"></i></a></p>\n");
      out.write("               <p class = \"footerCredits\"> <span class=\"current-year\" style=\"margin-left: 50px\">©2020</span> From my store with love <i>·</i> <a href=''>Hoang Tung Lam Drink Store</a></p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/e06505cf69.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- end Footer-->\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
