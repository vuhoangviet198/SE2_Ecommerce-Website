package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Order;
import java.util.List;
import java.util.ArrayList;
import model.Product;

public final class myorder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            footer .container .row a{\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            /* Content */\n");
      out.write("            #mainContainer .about{\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: -150px;\n");
      out.write("            }\n");
      out.write("            #mainContainer .about p{\n");
      out.write("                color: chocolate;\n");
      out.write("            }\n");
      out.write("            #mainContainer .about h3{\n");
      out.write("                padding-top: 50px;\n");
      out.write("                color: chocolate;\n");
      out.write("                margin-bottom: -100px;\n");
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
            Order order = (Order) s.getAttribute("order");
            int total = (Integer) request.getAttribute("total");
        
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
      out.write("                   <a  href=\"logout\" role=\"button\">Logout</a>\n");
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
      out.write("        <section id=\"mainContainer\">\n");
      out.write("            <div class=\"about\" >\n");
      out.write("                <h2>My Order</h2>\n");
      out.write("                <p>Customer: #");
      out.print(us);
      out.write("</p>\n");
      out.write("                <table style=\"width: 50%;height: 100%;\" border=\"1px solid black\" align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td><b>Order ID</b></td>\n");
      out.write("                        <td><b>Name</b></td>\n");
      out.write("                        <td><b>Price</b></td>\n");
      out.write("                        <td><b>Quantity</b></td>\n");
      out.write("                        <td><b>Total Price</b></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        List<Order> list = (List<Order>) request.getAttribute("list");
                        for (Order o : list) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( o.getOrderID());
      out.write(" </td>\n");
      out.write("                        <td>");
      out.print( o.getName());
      out.write(" </td>\n");
      out.write("                        <td>");
      out.print( o.getPrice());
      out.write(" </td>\n");
      out.write("                        <td>");
      out.print( o.getQuantity());
      out.write(" </td>\n");
      out.write("                        <td>");
      out.print( o.getTotalPrice());
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </table>\n");
      out.write("                    <h3>Total Orders Price: ");
      out.print(total);
      out.write(" đ</h3>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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
