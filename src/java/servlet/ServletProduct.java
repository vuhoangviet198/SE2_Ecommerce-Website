/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.CategoryDAO;
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
public class ServletProduct extends HttpServlet {

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
            out.println("<title>Servlet ServletProduct</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletProduct at " + request.getContextPath() + "</h1>");
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
        String stringPid = request.getParameter("pid");
        ProductDAO pdao = new ProductDAO();
        Product p = pdao.getProduct(stringPid);
        CategoryDAO cdao = new CategoryDAO();
        Category cname = cdao.getCatByID(p.getCategory().getCatID());
        request.setAttribute("product", p);
        request.setAttribute("ccname", cname.getCatname());
        request.getRequestDispatcher("product.jsp").forward(request, response);
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
        HttpSession session = request.getSession();
        ProductDAO pdao = new ProductDAO();
        String username = (String) session.getAttribute("username");
        if (username == null) {
            response.sendRedirect("login");
            return;
        }
        int orderID = pdao.getLastOrderID() + 1;
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String pID = request.getParameter("pid");
        int price = Integer.parseInt(request.getParameter("price"));
        int totalPrice = price * quantity;
        
        pdao.Buy(orderID, quantity, String.valueOf(totalPrice), pID, username);
        String stringPid = request.getParameter("pid");
        Product p = pdao.getProduct(stringPid);
        request.setAttribute("product", p);
        request.setAttribute("quantity", quantity);
        request.setAttribute("totalprice", totalPrice);
        
        request.getRequestDispatcher("buy.jsp").forward(request, response);
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
