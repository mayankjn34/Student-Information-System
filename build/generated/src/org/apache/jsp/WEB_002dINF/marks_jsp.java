package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class marks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
 Class.forName("com.mysql.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sis","root","mayank");
   Statement s = con.createStatement();
   ResultSet r = s.executeQuery("select sname from subject;");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("  <title>Bootstrap Example</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-image:url(img/2.jpg);color: #fff \">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>Attendance</h2>\n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("            <form class=\"form-horizontal\" action=\"SaveFaculty\" method=\"POST\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\">Roll No.:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"roll\">\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\">Subject Name:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <select class=\"form-control\">\n");
      out.write("                        ");
  r.next();
                            while(!r.isAfterLast() ){
                                String x =r.getString("sname");
                        
      out.write("\n");
      out.write("                        <option>");
      out.print(x);
      out.write("</option>\n");
      out.write("                        ");
 r.next();}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\">marks:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                  <input type=\"number\" class=\"form-control\" name=\"marks\" >\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("           \n");
      out.write("               \n");
      out.write("              <div class=\"form-group\">        \n");
      out.write("                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
