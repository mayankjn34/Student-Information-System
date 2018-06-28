package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
String st = (String)session.getAttribute("roll");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("  <title>Bootstrap Example</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("   </head>\n");
      out.write("  <body style=\"background-image:url(img/4.png);color: #fff;\">\n");
      out.write("<nav class=\"navbar navbar-default\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Welcome Admin</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"AdminHome.jsp\">Home</a></li>\n");
      out.write("      <li><a href=\"viewcourse.jsp\">View Course</a></li>\n");
      out.write("      <li class=\"dropdown\">\n");
      out.write("        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Student\n");
      out.write("        <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"StudentRigistration.jsp\">Register Student</a></li>\n");
      out.write("          <li><a href=\"attendence.jsp\">Update attendance</a></li>\n");
      out.write("          <li><a href=\"marks.jsp\">Update Marks</a></li>\n");
      out.write("          <li><a href=\"ViewStudent.jsp\">View and delete Student Details</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"dropdown\">\n");
      out.write("        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Faculty\n");
      out.write("        <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"faculty.jsp\">Register Faculty</a></li>\n");
      out.write("          <li><a href=\"sub-fac.jsp\">Add subject to faculty</a></li>\n");
      out.write("          <li><a href=\"viewfaculty.jsp\">View and delete faculty</a></li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"dropdown\">\n");
      out.write("        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Subject\n");
      out.write("        <span class=\"caret\"></span></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"Subject.jsp\">Register Subject</a></li>\n");
      out.write("          <li><a href=\"syllabus.jsp\">Update Syllabus</a></li>\n");
      out.write("          <li><a href=\"viewsubject.jsp\">View and delete Subject</a></li>\n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    \n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <!--li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li-->\n");
      out.write("      <li><a href=\"logout.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>    \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("      <h2>Add notice</h2>\n");
      out.write("            <div class=\"col-sm-9\">\n");
      out.write("                <form class=\"form-horizontal\" action=\"AddNotice1\" method=\"POST\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\">Subject for notice</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                  <textarea  class=\"form-control\" name=\"heading\"></textarea>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\">Information:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                  <textarea rows=\"4\" class=\"form-control\" name=\"data\" ></textarea>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <div class=\"form-group\">        \n");
      out.write("                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("           </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  </body>\n");
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
