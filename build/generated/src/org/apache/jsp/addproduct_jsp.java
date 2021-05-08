package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import model.Product;

public final class addproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/bootstrap-3.3.5.min.css\"/>\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/font-awesome-4.6.3.min.css\"/>\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.powered-by-nitrosell.com/assets/beta/assets/stylesheets/systemv2.css?fb47c41a31603799213\" />\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.powered-by-nitrosell.com/public_html/9/2091/themes/stylesheet.css?fb47c41a31603799213\" />\n");
      out.write("      <script src=\"https://cdn.powered-by-nitrosell.com/assets/beta/assets/js/systemv2.js?fb47c41a31603799213\"></script>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("            .account a{\n");
      out.write("                padding-right: 25px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("            .account a:hover{\n");
      out.write("                opacity: 0.5;\n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                color: red;\n");
      out.write("            }  \n");
      out.write("            /* Content */\n");
      out.write("\n");
      out.write("            #mainContainer {\n");
      out.write("                width: 1200px;\n");
      out.write("                height:600px;\n");
      out.write("                margin: 40px auto;\n");
      out.write("                padding: 20px 5px;\n");
      out.write("                background: #fff;\n");
      out.write("                boder:10px solid black;\n");
      out.write("            }\n");
      out.write("            #mainContainer .about .imgbox img{\n");
      out.write("                width: 300px;\n");
      out.write("                height: 300px;\n");
      out.write("                padding-bottom: 50px;\n");
      out.write("            }\n");
      out.write("            #mainContainer .about .imgbox p{\n");
      out.write("                color: black;\n");
      out.write("                border: black;\n");
      out.write("                border-style: solid;\n");
      out.write("            }\n");
      out.write("            div.about {\n");
      out.write("                boder: 10px solid brown;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            .imgbox{\n");
      out.write("                float: left;\n");
      out.write("                margin-left: 50px;\n");
      out.write("                border: #000;\n");
      out.write("                border-right-style: solid;\n");
      out.write("            }         \n");
      out.write("            .detail{\n");
      out.write("                float: right;\n");
      out.write("                text-align: right;\n");
      out.write("                margin-right: 120px;               \n");
      out.write("            }\n");
      out.write("            input[type=file]{\n");
      out.write("                border-style: solid;\n");
      out.write("                border-width: 1px;\n");
      out.write("                font-size: 15px;\n");
      out.write("                margin-left: 1000px;\n");
      out.write("            }\n");
      out.write("            .detail input{\n");
      out.write("                margin: 5px;\n");
      out.write("            }\n");
      out.write("            .detail h2 {\n");
      out.write("                color: maroon;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            .detail p{\n");
      out.write("                color: black;\n");
      out.write("                border: #000;\n");
      out.write("                border-style: solid;\n");
      out.write("                padding: 10px;\n");
      out.write("                border-width: 1px;\n");
      out.write("            }\n");
      out.write("            .detail label{\n");
      out.write("                color: black;\n");
      out.write("                font-weight: normal;\n");
      out.write("                margin-right: 210px;\n");
      out.write("            }\n");
      out.write("            footer .container .row a{\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            /* Drop down */\n");
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
      out.write("            .file{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 360px;\n");
      out.write("                width: 300px;\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("                border-left: 0;\n");
      out.write("            }\n");
      out.write("            .det{\n");
      out.write("                position: relative;\n");
      out.write("                display: flex;\n");
      out.write("                margin-bottom: 12px;\n");
      out.write("            }\n");
      out.write("            .det p{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 285px;\n");
      out.write("                border-style: none;\n");
      out.write("            }\n");
      out.write("            .dropdown-content a:hover{\n");
      out.write("                color: chocolate;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            HttpSession s = request.getSession(true);
            String us = (String) s.getAttribute("username");
            String admin = (String) s.getAttribute("admin");
            Product p = (Product)request.getAttribute("productp");
        
      out.write("\n");
      out.write("        ");
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
      out.write("                     <form name=\"find\" id=\"quick-find\" method=\"post\" action=\"/store/search.jsp\">\n");
      out.write("                     <input type=\"text\" id=\"headersearchbox\" class=\"form-control typeahead\" placeholder=\"Search\"> \n");
      out.write("                     <input type=\"button\" id=\"quick_find_submit\" value=\"Go\" class=\"btn btn-default\" />  \n");
      out.write("                     </form>\n");
      out.write("                  </div>\n");
      out.write("                  <!--findPanel-->\n");
      out.write("                  <!--END FIND-->\n");
      out.write("               </div>\n");
      out.write("                <div class=\"image\">\n");
      out.write("                    <a href=\"trangchu.jsp\" role=\"button\">\n");
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
      out.write("                           <a  href=\"myorder\" role=\"button\">My Order</a>\n");
      out.write("                       </div>\n");
      out.write("                    </li>\n");
      out.write("                   <a  href=\"logout\" role=\"button\">Logout</a>>\n");
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
      out.write("                   </li> \n");
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
      out.write("        <form method=\"post\" action=\"updateproduct?pid=");
      out.print(p.getId());
      out.write("\" >\n");
      out.write("        <section id=\"mainContainer\">\n");
      out.write("            <div class=\"about\" >\n");
      out.write("                <div class=\"imgbox col-sm-4\">\n");
      out.write("                    <img src=\"img/");
      out.print(p.getImage());
      out.write("\">\n");
      out.write("                    <h6>Detail</h6><br>\n");
      out.write("                    <p>Name: ");
      out.print(p.getName());
      out.write("</p>\n");
      out.write("                    <p>Price: ");
      out.print(p.getPrice());
      out.write("</p>\n");
      out.write("                    <p>Description: ");
      out.print(p.getDescription());
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"detail\"> \n");
      out.write("                    <h2>Update Information</h2>\n");
      out.write("                    Product Name: <input type=\"text\" name=\"pname\"><br>\n");
      out.write("                    Product Price: <input type=\"text\" name=\"pprice\"><br>\n");
      out.write("                    Category ID: <input type=\"text\" name=\"categoryid\"><br>\n");
      out.write("                    <div class=\"det\">\n");
      out.write("                    <p>Image:</p> <input class=\"file\"type=\"file\" name=\"image\" id=\"myfile\"><br>\n");
      out.write("                    </div>                    \n");
      out.write("                    Product Description: <input type=\"text\" name=\"pdescription\" style=\"height: 150px;\"><br>\n");
      out.write("                    <input type=\"submit\" value=\"UPDATE\" style=\"color: red; margin-right: 80px; margin-top: 20px\"><br>\n");
      out.write("                    ");

                            if (request.getAttribute("errMess") != null) {
                    
      out.write("\n");
      out.write("                        <h5 style=\"color: red\">");
      out.print( request.getAttribute("errMess"));
      out.write("</h5>\n");
      out.write("                    ");

                            }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("         </form>\n");
      out.write("        <!-- end Body-->\n");
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
      out.write("                    <a href=\"\"> <i class=\"fa fa-facebook\"></i></a>   \n");
      out.write("                    <a href=\"\"> <i class=\"fa fa-twitter\"></i></a>    \n");
      out.write("                    <a href=\"\"> <i class=\"fa fa-instagram\"></i></a>   \n");
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
      out.write("    </body>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
