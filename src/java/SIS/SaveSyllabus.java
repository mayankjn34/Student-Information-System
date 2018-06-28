    
package SIS;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(name="SaveSyllabus", urlPatterns={"/syllabus"})     // specify urlPattern for servlet
@MultipartConfig                                               // specifies servlet takes multipart/form-data
public class SaveSyllabus extends HttpServlet {
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
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String sql = "insert into syllabus values(?,?,?)" ;
         PreparedStatement p = con.prepareStatement(sql) ;
         p.setString(1,request.getParameter("photoname"));
         p.setInt(2,Integer.parseInt(request.getParameter("sem")));
        
            
            
            // get access to file that is uploaded from client
            Part p1 = request.getPart("file");
            InputStream is = p1.getInputStream();

            // read filename which is sent as a part
            Part p2  = request.getPart("photoname");
            Part p3  = request.getPart("sem");
            Scanner s = new Scanner(p2.getInputStream());
            String filename = s.nextLine();    // read filename from stream

            // get filename to use on the server
            //String outputfile = this.getServletContext().getRealPath(filename);  // get path on the server
            String outputfile = "F:/student information system/syll/"+request.getParameter("photoname")+Integer.parseInt(request.getParameter("sem"))+".pdf";
            FileOutputStream os = new FileOutputStream (outputfile);
            
            // write bytes taken from uploaded file to target file
            int ch = is.read();
            while (ch != -1) {
                 os.write(ch);
                 ch = is.read();
            }
            p.setString(3,outputfile);
            p.executeUpdate();
            os.close();
            out.println("<h3>File uploaded successfully!</h3>");
        }
        catch(Exception ex) {
           out.println("Exception -->" + ex);
        }
        finally { 
            out.close();
        }
    } // end of doPost()
 }  