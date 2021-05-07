/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Category;
import model.Product;

/**
 *
 * @author sontriplelift
 */
public class ServletUpdateProduct extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletUpdateProduct</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletUpdateProduct at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Pid = request.getParameter("pid");
        ProductDAO pdao = new ProductDAO();
        Product p = pdao.getProduct(Pid);
        request.setAttribute("productp", p);
        request.getRequestDispatcher("updateproduct.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductDAO pdao = new ProductDAO();
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        String productName1 = request.getParameter("pname");
        String productPrice1 = request.getParameter("pprice");
        String categoryid1 = request.getParameter("categoryid");
        String image1 = request.getParameter("image");
        String description1 = request.getParameter("pdescription");
        String pid = request.getParameter("pid");
//        String errMess = null;

        String productName = (productName1 == null) || (productName1.equals("")) ? pdao.getProduct(pid).getName() : productName1;
        String productPrice = (productPrice1 == null) || (productPrice1.equals("")) ? pdao.getProduct(pid).getPrice() : productPrice1;
        int categoryid = (categoryid1 == null) || (categoryid1.equals("")) ? pdao.getProduct(pid).getCategory().getCatID() : Integer.parseInt(categoryid1);
        String image = (image1 == null) || (image1.equals("")) ? pdao.getProduct(pid).getImage() : image1;
        String description = (description1 == null) || (description1.equals("")) ? pdao.getProduct(pid).getDescription() : description1;
        Category c = new Category(categoryid, username, description);
        Product p = new Product(pid, productName, c, productPrice, image, description);
        if (productName != null || !productName.trim().equals("")) {
            pdao.UpdateProductName(p);
            String errMess = "Update Product Name Successfully!!!";
            request.setAttribute("errMess", errMess);
        }
        if (productPrice != null || !productPrice.trim().equals("")) {
            if (isNumeric(productPrice) == true) {
                if (Integer.parseInt(productPrice) > 0) {
                    pdao.UpdateProductPrice(p);
                    String errMess = "Update Product Price Successfully!!!";
                    request.setAttribute("errMess", errMess);
                } else {
                    String errMess = "Price must be positive (>0)";
                    request.setAttribute("errMess", errMess);
                }
            } else {
                String errMess = "Price must be a positive number";
                request.setAttribute("errMess", errMess);
            }
            
        }
        if (String.valueOf(categoryid) != null || String.valueOf(categoryid).trim().equals("")) {
            pdao.UpdateProductCategoryID(p);
            String errMess = "Update Product Category ID Successfully!!!";
            request.setAttribute("errMess", errMess);
        }
        if (image != null || image.trim().equals("")) {
            pdao.UpdateProductImage(p);
            String errMess = "Update Product Image Successfully!!!";
            request.setAttribute("errMess", errMess);
        }
        if (description != null || description.trim().equals("")) {
            pdao.UpdateProductDescription(p);
            String errMess = "Update Product Description Successfully!!!";
            request.setAttribute("errMess", errMess);
        }
        
        response.sendRedirect("updateproduct?pid=" + pid);
//        request.getRequestDispatcher("updateproduct.jsp").forward(request, response);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
