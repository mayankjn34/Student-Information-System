package SIS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mayank Jain
 */
public class SaveStudentReg extends HttpServlet {
    Connection con;

    /**
     *
     */
    @Override
    public void init(){
        try{
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sis","root","mayank");
        }catch(ClassNotFoundException | SQLException e){}
    }
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try{
                Statement s = con.createStatement();
                ResultSet r = s.executeQuery("select roll from student");
                while(r.next()){
                    if(r.getString("roll").equals(request.getParameter("roll"))){
                        String sql = "insert into studentlogin values(?,?)" ;
                        PreparedStatement p = con.prepareStatement(sql) ;

                        p.setString(1,request.getParameter("roll"));
                        p.setString(2,request.getParameter("pwd"));
                        p.executeUpdate();

                        response.sendRedirect("index.html");
                    }
                }
                out.print("<html>");
                out.print("<head>");
                out.print("</head>");
                out.print("<body>");
                out.print("<script>alert('Wrong Input');window.location.assign('student_login_reg.jsp');</script>");
                
                out.print("</body>");
                out.print("</html>");
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
