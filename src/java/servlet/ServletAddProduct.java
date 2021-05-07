/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.ProductDAO;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author sontriplelift
 */
public class ServletAddProduct extends HttpServlet {

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
            out.println("<title>Servlet ServletAddProduct</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletAddProduct at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("addproduct.jsp").forward(request, response);
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
        String pid = request.getParameter("pid");
        String pname = request.getParameter("pname");
        int categoryid = Integer.parseInt(request.getParameter("categoryid"));
        String price = request.getParameter("price");
        String image = request.getParameter("image");
        String description = request.getParameter("pdescription");
        ProductDAO fdao = new ProductDAO();
        boolean check = fdao.checkProduct(pid);
        if (check == true) {
            if (isNumeric(price) == true) {
                if (Integer.parseInt(price) > 0) {
                    fdao.insertProduct(pid, pname, categoryid, price, image, description);
                    String err = "Product is added successfully!!!";
                    request.setAttribute("err", err);
                } else {
                    String err = "Price must be positive (>0)";
                    request.setAttribute("err", err);
                }
            } else {
                String err = "Price must be a positive number";
                request.setAttribute("err", err);
            }

//            fdao.insertProduct(pid, pname, categoryid, price, image, description);
        } else {
            String err = "This product id has already existed!";
            request.setAttribute("err", err);
        }
        request.getRequestDispatcher("addproduct.jsp").forward(request, response);
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
