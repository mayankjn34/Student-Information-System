/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIS;

import java.io.*;  
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class DownloadSyllabus extends HttpServlet { 
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
  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException{ 
    
 try{   
/*int sem = Integer.parseInt(request.getParameter("sem"));
String course = request.getParameter("course");
PreparedStatement s = con.prepareStatement("select syll from syllabus where course like ? and sem =? ");
s.setString(1,course);
s.setInt(2,sem);
ResultSet r = s.executeQuery();
response.setContentType("text/html");  
PrintWriter out = response.getWriter(); 
r.next();
*/
String filename = "MTech6.pdf";
//String filepath = r.getString("syll");
String filepath = "F:\\student information system\\syll\\MTech6.pdf";
response.setContentType("APPLICATION/OCTET-STREAM");   
response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   
  
FileInputStream fileInputStream = new FileInputStream(filepath + filename);  
            
int i;   
while ((i=fileInputStream.read()) != -1) {  
out.write(i);   
}   
fileInputStream.close();   
out.close();   
}

catch(Exception e)
{
out.println(e);
}
}
}