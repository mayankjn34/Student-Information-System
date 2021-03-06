/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIS;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mayank Jain
 */
public class SaveStudent extends HttpServlet {
    Connection con;
    @Override
    public void init(){
        try{
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sis","root","mayank");
        }catch(ClassNotFoundException | SQLException e){}
    }
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         try{
         String sql = "insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?)" ;
         PreparedStatement p = con.prepareStatement(sql) ;
         p.setString(1,request.getParameter("roll"));
         p.setString(2,request.getParameter("fname"));
         p.setString(3,request.getParameter("lname"));
         p.setString(4,request.getParameter("gender"));
         p.setDate(5,Date.valueOf(request.getParameter("dob")));
         p.setString(6,request.getParameter("address"));
         p.setString(7,request.getParameter("ftname"));
         p.setString(8,request.getParameter("email"));
         p.setInt(9,Integer.parseInt(request.getParameter("contact")));
         p.setString(10,request.getParameter("course"));
         p.setDouble(11,Double.parseDouble(request.getParameter("tenth")));
         p.setDouble(12,Double.parseDouble(request.getParameter("twelth")));
         p.setString(13,request.getParameter("catagory"));
         p.executeUpdate();
         response.sendRedirect("AdminHome.jsp");
         }catch(SQLException e){out.println(e);}
         
         
         
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
        processRequest(request, response);
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
        processRequest(request, response);
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
