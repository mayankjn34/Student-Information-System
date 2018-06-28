package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class student_005flogin_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/driver.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
 Class.forName("com.mysql.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sis","root","mayank");
    
      out.write('\n');
      out.write('\n');
    String sql = "select roll from student;";
      Statement s = con.createStatement();
      ResultSet r = s.executeQuery(sql);
      

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write(" <script src=\"js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- grid-slider -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.mousewheel.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.contentcarousel.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("<!-- //grid-slider -->\n");
      out.write("<link href=\"style.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image:url(img/4.png);color: #fff \">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>Attendance</h2>\n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("            <form class=\"form-horizontal\" action=\"SaveStudentReg\" method=\"POST\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label class=\"control-label col-sm-2\"  >Roll No.:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"roll\" id=\"ro\" onfocusout = \"my()\">\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\">Password:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                  <input type=\"password\" class=\"form-control\" name=\"pwd\" >\n");
      out.write("                </div>\n");
      out.write("              </div>          \n");
      out.write("              <div class=\"form-group\">        \n");
      out.write("                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                  <button id=\"submit\" type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("          \n");
      out.write("             function my(){\n");
      out.write("                 var x = document.getElementById(\"ro\");\n");
      out.write("                  x.value = x.value.toUpperCase();\n");
      out.write("                 alert(\"sdada\");\n");
      out.write("              while(r.next()){\n");
      out.write("                  if(r.getString(\"roll\") !== request.getParameter(\"roll\"))){\n");
      out.write("                      document.getElementById(\"submit\").disabled = true;\n");
      out.write("                      \n");
      out.write("                  }\n");
      out.write("              }\n");
      out.write("          }\n");
      out.write("          \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
