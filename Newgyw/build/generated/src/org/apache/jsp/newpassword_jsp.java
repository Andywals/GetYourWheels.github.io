package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("  \n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 if(Integer.parseInt(request.getParameter("otp")) != Integer.parseInt(request.getParameter("gotp")) ) {System.out.println(" "+request.getParameter("gotp"));  
      out.write("\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("sellcar.jsp");
        return;
      }
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"ChangePasswordServlet.do\" method=\"post\">\n");
      out.write("            <br>\n");
      out.write("        \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label for=\"fullname\" class=\"col-form-label\" >New Password :</label>\n");
      out.write("            <input type=\"password\" class=\"form-control\" id=\"fullName\" name=\"newPassword\" placeholder=\"Full Name\" onblur=\"validateNonEmpty(this, document.getElementById('fullName_help') )\">\n");
      out.write("            <br>\n");
      out.write("            <span id=\"fullName_help\" class=\"help\"></span>\n");
      out.write("           </div>\n");
      out.write("            <input type=\"hidden\" name=\"userName\" value=");
      out.print( request.getParameter("userName"));
      out.write(" />\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("  \n");
      out.write("        \n");
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
