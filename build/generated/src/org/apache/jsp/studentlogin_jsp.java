package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class studentlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 String st = (String)session.getAttribute("roll");
   Class.forName("com.mysql.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sis","root","mayank");
   Statement s1 = con.createStatement();
   Statement s2 = con.createStatement();
   Statement s3 = con.createStatement();
   Statement s4 = con.createStatement();
   ResultSet r1 = s1.executeQuery("select * from notice;");
   ResultSet r2 = s2.executeQuery("select * from student where roll like "+st+";");
   ResultSet r3 = s3.executeQuery("select * from marks where roll like "+st+";");
   ResultSet r4 = s4.executeQuery("select sname, att, total from attendance where roll like "+st+";");
   r2.next();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>SIS</title>\n");
      out.write("<!-- Latest compiled and minified CSS -->\n");
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
      out.write("</head>\n");
      out.write("<body style=\"background-image:url(img/4.png);color: #fff;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <div class=\"row\"><div class=\"col-sm-9\">\n");
      out.write("    <h1 class=\"text-center\">Welcome ");
      out.print(r2.getString("fname"));
      out.write("</h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-3\">\n");
      out.write("        <div style=\"padding: 45px;\" align=\"right\">\n");
      out.write("    <a href=\"logout.jsp\">\n");
      out.write("    <button class=\"btn btn-warning\" align=\"right\">Log Out</button></a>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  <div class=\"row\">\t\t\t\t\t\t\t\t\n");
      out.write("    <div class=\"col-sm-3\">\n");
      out.write("        <div class=\"row\" style=\"padding: 10px;\">\n");
      out.write("           <button class=\"btn btn-warning btn-block\" href=\"#a\" onclick=\"M1()\" >HOME</button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\" style=\"padding: 10px;\">\n");
      out.write("           <button class=\"btn btn-warning btn-block\" href=\"#b\" onclick=\"M2()\">Syllabus and Timetable</button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\" style=\"padding: 10px;\">\n");
      out.write("           <button class=\"btn btn-warning btn-block\" href=\"#c\" onclick=\"M3()\">Result</button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\" style=\"padding: 10px;\">\n");
      out.write("           <button class=\"btn btn-warning btn-block\" href=\"#e\" onclick=\"M5()\">Attendance</button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\" style=\"padding: 10px;\">\n");
      out.write("           <button class=\"btn btn-warning btn-block\" href=\"#d\" onclick=\"M4()\">Services</button>\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-sm-9 \">\n");
      out.write("\t    \n");
      out.write("            <div  id=\"a\" style=\"display:block\">\n");
      out.write("                ");
 while(r1.next()){
      out.write("\n");
      out.write("                <div class=\"row-fluid\">\n");
      out.write("                    \n");
      out.write("                    <h2 class=\"text-center\">");
      out.print( r1.getString("heading") );
      out.write("</h2>\n");
      out.write("                    <p class=\"\">");
      out.print( r1.getString("data") );
      out.write("</p>\n");
      out.write("                    <hr align=\"center\" width=\"10%\" height=\"50px\">\n");
      out.write("                </div>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </div>\t\n");
      out.write("            <div  id=\"b\"style=\"display:none\">\n");
      out.write("                <h3>Work under progress Sorry</h3>\n");
      out.write("            </div>\n");
      out.write("            <div  id=\"c\" style=\"display:none\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <tr>\n");
      out.write("                    <th>Subject</th>\n");
      out.write("                    <th>Marks</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
while(r3.next()){
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th>");
      out.print( r3.getString("sname") );
      out.write("</th>\n");
      out.write("                        <th>");
      out.print( r3.getInt("marks") );
      out.write("</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("   \n");
      out.write("                </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                <div  id=\"e\" style=\"display:none\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Subject</th>\n");
      out.write("                                <th>Total Classes Attended</th>\n");
      out.write("                                <th>Total Classes</th>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
 while(r4.next()){
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( r4.getString("sname"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( r4.getInt("att"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( r4.getInt("total"));
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>   \n");
      out.write("                </div>\n");
      out.write("        <div  id=\"d\" style=\"display:none\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6\" align=\"center\">\n");
      out.write("                        <H2 class=\"text-center\">PAY SEM FEES</h2>\n");
      out.write("                        <a href=\"#\"><button class=\"btn btn-primary\">CLICK HERE</button></a>\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"col-sm-6\" align=\"center\">\n");
      out.write("                        <H2 class=\"text-center\">STUDENT FEEDBACK</h2>\n");
      out.write("                        <a align=\"center\" href=\"#\"><button class=\"btn btn-primary\">CLICK HERE</button></a>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("        </div>\t\n");
      out.write("\t</div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("<script >\n");
      out.write("var x = document.getElementById('a');\n");
      out.write("var y = document.getElementById('b');\n");
      out.write("var z = document.getElementById('c');\n");
      out.write("var w = document.getElementById('d');\n");
      out.write("var v = document.getElementById('e');\n");
      out.write(" function M1() {\n");
      out.write("    \n");
      out.write("    if (x.style.display === 'none') {\n");
      out.write("        x.style.display = 'block';\n");
      out.write("\t\ty.style.display = 'none';\n");
      out.write("\t\tz.style.display = 'none';\n");
      out.write("\t\tw.style.display = 'none';\n");
      out.write("                v.style.display = 'none';\n");
      out.write("                \n");
      out.write("    } else {\n");
      out.write("        x.style.display = 'none';\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function M2() {\n");
      out.write("    \n");
      out.write("    if (y.style.display === 'none') {\n");
      out.write("        x.style.display = 'none';\n");
      out.write("\t\ty.style.display = 'block';\n");
      out.write("\t\tz.style.display = 'none';\n");
      out.write("\t\tw.style.display = 'none';\n");
      out.write("                v.style.display = 'none';\n");
      out.write("    } else {\n");
      out.write("        y.style.display = 'none';\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function M3() {\n");
      out.write("    \n");
      out.write("    if (z.style.display === 'none') {\n");
      out.write("        z.style.display = 'block';\n");
      out.write("\t\ty.style.display = 'none';\n");
      out.write("\t\tx.style.display = 'none';\n");
      out.write("\t\tw.style.display = 'none';\n");
      out.write("                v.style.display = 'none';\n");
      out.write("    } else {\n");
      out.write("        z.style.display = 'none';\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function M4() {\n");
      out.write("    if (w.style.display === 'none') {\n");
      out.write("        w.style.display = 'block';\n");
      out.write("\t\ty.style.display = 'none';\n");
      out.write("\t\tz.style.display = 'none';\n");
      out.write("\t\tx.style.display = 'none';\n");
      out.write("                v.style.display = 'none';\n");
      out.write("    } else {\n");
      out.write("        w.style.display = 'none';\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("function M5() {\n");
      out.write("    if (v.style.display === 'none') {\n");
      out.write("        v.style.display = 'block';\n");
      out.write("\t\ty.style.display = 'none';\n");
      out.write("\t\tz.style.display = 'none';\n");
      out.write("\t\tx.style.display = 'none';\n");
      out.write("                w.style.display = 'none';\n");
      out.write("                \n");
      out.write("    } else {\n");
      out.write("        v.style.display = 'none';\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
