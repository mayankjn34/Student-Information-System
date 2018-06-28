package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StudentRigistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

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
      out.write("</head>\n");
      out.write("<body style=\"background-image:url(img/2.jpg);color: #fff \">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("            <h2>Student Registration</h2>\n");
      out.write("            <form class=\"form-horizontal\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\">First Name:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                  <input type=\"text\" class=\"form-control\" >\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\">Last Name:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                  <input type=\"text\" class=\"form-control\" >\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\">Gender: </label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("              <div class=\"radio\">\n");
      out.write("              <label><input type=\"radio\"  name=\"gender\" value=\"male\">Male</label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"radio\">\n");
      out.write("                  <label><input type=\"radio\" name=\"gender\" value=\"female\">Female</label>\n");
      out.write("              </div>\n");
      out.write("                </div>   \n");
      out.write("              </div>\n");
      out.write("                \n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\">DOB:</label>\n");
      out.write("                <div class=\"col-sm-10\">          \n");
      out.write("                    <input type=\"date\" name=\"dob\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"pwd\">Permanent address:</label>\n");
      out.write("                <div class=\"col-sm-10\">          \n");
      out.write("                    <textarea type=\"text-area\" class=\"form-control\" ></textarea>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\">Father's Name:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                  <input type=\"text\" class=\"form-control\" >\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"pwd\">Email:</label>\n");
      out.write("                <div class=\"col-sm-10\">          \n");
      out.write("                  <input type=\"email\" class=\"form-control\" >\n");
      out.write("                </div>\n");
      out.write("              </div> \n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\">Contact:</label>\n");
      out.write("                <div class=\"col-sm-10\">          \n");
      out.write("                  <input type=\"number\" class=\"form-control\" >\n");
      out.write("                </div>\n");
      out.write("              </div> \n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\">Course:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <select class=\"form-control\">\n");
      out.write("                        <option>Mtech</option>\n");
      out.write("                        <option>MCA</option>\n");
      out.write("                        <option>MBA</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"pwd\">X Grades:</label>\n");
      out.write("                <div class=\"col-sm-10\">          \n");
      out.write("                  <input type=\"number\" class=\"form-control\" >\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\" for=\"pwd\">XII Grades:</label>\n");
      out.write("                <div class=\"col-sm-10\">          \n");
      out.write("                  <input type=\"number\" class=\"form-control\" >\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-sm-2\">Catagory:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <select class=\"form-control\">\n");
      out.write("                        <option>General</option>\n");
      out.write("                        <option>ST/SC</option>\n");
      out.write("                        <option>OBC</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("               \n");
      out.write("              <div class=\"form-group\">        \n");
      out.write("                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
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
