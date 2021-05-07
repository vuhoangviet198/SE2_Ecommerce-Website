/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Users;

/**
 *
 * @author sontriplelift
 */
public class ServletProfile extends HttpServlet {

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
            out.println("<title>Servlet ServletProfile</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletProfile at " + request.getContextPath() + "</h1>");
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
        AccountDAO adao = new AccountDAO();
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        String phone = adao.getAccountByName(username).getPhone();
        String email = adao.getAccountByName(username).getEmail();
        String address = adao.getAccountByName(username).getAddress();
        request.setAttribute("phone", phone);
        request.setAttribute("email", email);
        request.setAttribute("address", address);
        request.getRequestDispatcher("profile.jsp").forward(request, response);
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
        AccountDAO adao = new AccountDAO();
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        
        String password1 = request.getParameter("password");
        String email1 = request.getParameter("email");
        String address1 = request.getParameter("address");
        String phone1 = request.getParameter("phone");
        String repassword = request.getParameter("repassword");
        String errMess = null;
        
        String password = (password1==null)||(password1.equals(""))?adao.getAccountByName(username).getPass():password1;
        String email = (email1==null)||(email1.equals(""))?adao.getAccountByName(username).getEmail():email1;
        String phone = (phone1==null)||(phone1.equals(""))?adao.getAccountByName(username).getPhone():phone1;
        String address = (address1==null)||(address1.equals(""))?adao.getAccountByName(username).getAddress():address1;
        Users us = new Users(username, password, email, phone, address);
        
        if ((password1 != null || !password1.trim().equals(""))&&(password1.equals(repassword))) {
            adao.UpdatePassword(us);
            errMess = "Update Successfully!!!";
        }
        if (phone1 != null || !phone1.trim().equals("")) {
            adao.UpdatePhone(us);
            errMess = "Update Successfully!!!";
        }
        if (address1 != null || !address1.trim().equals("")) {
            adao.UpdateAddress(us);
            errMess = "Update Successfully!!!";
        }
        if (email1 != null || !email1.trim().equals("")) {
            adao.UpdateEmail(us);
            errMess = "Update Successfully!!!";
        }
        if ((password1 == null || password1.trim().equals(""))&&(phone1 == null || phone1.trim().equals(""))
                &&(email1 != null || !email1.trim().equals(""))) {
            errMess = "Must input at least 1 information to update";
        }
        if (!password1.equals(repassword)) {
            errMess = "Re-Password must be the same as password";
        }
//        if ((password1 != null || !password1.trim().equals(""))&&(phone1 != null || !phone1.trim().equals(""))
//                &&(email1 != null || !email1.trim().equals(""))) {
//            errMess = "Update Successfully!!!";
//        }
      
        String phone2 = adao.getAccountByName(username).getPhone();
        String email2 = adao.getAccountByName(username).getEmail();
        String address2 = adao.getAccountByName(username).getAddress();
        
        request.setAttribute("phone", phone2);
        request.setAttribute("email", email2);
        request.setAttribute("address", address2);
        request.setAttribute("errMess", errMess);
         request.getRequestDispatcher("profile.jsp").forward(request, response);
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
