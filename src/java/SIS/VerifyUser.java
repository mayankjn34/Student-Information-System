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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mayank Jain
 */
public class VerifyUser extends HttpServlet {
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
         String sql1 = "select * from studentlogin;" ;
         String sql2 = "select * from admin ;";
         Statement p1 = con.createStatement() ;
         Statement p2 = con.createStatement();
         ResultSet r1 = p1.executeQuery(sql1);
         ResultSet r2 = p2.executeQuery(sql2);
         int flag = 0;
         if(request.getParameter("type").equals("student")){
                while(r1.next()){
                if(r1.getString("roll").equals(request.getParameter("roll"))){
                    if(r1.getString("psw").equals(request.getParameter("pwd"))){
                        flag = 1;
                        HttpSession session = request.getSession();
                        session.setAttribute("roll",r1.getString("roll"));
                        response.sendRedirect("studentlogin.jsp");

                    }

                }
                }
         }
         else{
        while(r2.next()){
         if(r2.getInt("uid") == Integer.parseInt(request.getParameter("roll"))){
             if(r2.getString("pwd").equals(request.getParameter("pwd"))){
                 flag = 1;
                 HttpSession session = request.getSession();
                 session.setAttribute("roll",r2.getString("uid"));
                 response.sendRedirect("AdminHome.jsp");
             }
         }
        }
         }
         if(flag == 0){
         out.print("<html>");
         out.print("<head>");
         out.print("</head>");
         out.print("<body>");
         out.print("<h1>Wrong UId/RollNo. or Password</h1>");
         out.print("<a href='index.html'>Back</a>");
         out.print("</body>");
         out.print("</html>");
         
         }
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
