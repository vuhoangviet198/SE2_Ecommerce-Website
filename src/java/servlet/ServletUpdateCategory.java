/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.CategoryDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Category;

/**
 *
 * @author sontriplelift
 */
public class ServletUpdateCategory extends HttpServlet {

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
            out.println("<title>Servlet ServletUpdateCategory</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletUpdateCategory at " + request.getContextPath() + "</h1>");
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
        int cid = Integer.parseInt(request.getParameter("cid"));
        CategoryDAO pdao = new CategoryDAO();
        Category p = pdao.getCategory(cid);
        request.setAttribute("categoryp", p);
        request.getRequestDispatcher("updatecategory.jsp").forward(request, response);
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
        CategoryDAO pdao = new CategoryDAO();
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        
        String categoryName1 = request.getParameter("cname");
        String image1 = request.getParameter("image");
        int cid = Integer.parseInt(request.getParameter("cid"));
        String errMess = null;
        
        String categoryName = (categoryName1==null)||(categoryName1.equals(""))?pdao.getCategory(cid).getCatname():categoryName1;
        String image = (image1==null)||(image1.equals(""))?pdao.getCategory(cid).getDescription():image1;
        Category c = new Category(cid, categoryName, image);
        if (categoryName != null || !categoryName.trim().equals("")) {
            pdao.UpdateCategoryName(c);
            errMess = "Update Category Name Successfully!!!";
        }
        
        if (image!= null || image.trim().equals("")) {
            pdao.UpdateCategoryImage(c);
            errMess = "Update Category Image Successfully!!!";
        }
        
        request.setAttribute("errMess", errMess);
        response.sendRedirect("updatecategory?cid="+cid);
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
