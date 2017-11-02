package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class videos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Car Videos</title>\n");
      out.write("        \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            h4{\n");
      out.write("                color: #563d7c;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerhome.jsp", out, false);
      out.write("  \n");
      out.write("        \n");
      out.write("       <br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"card-deck\">\n");
      out.write("            <div class=\"card border-info mb-3\">\n");
      out.write("                <div class=\"embed-responsive embed-responsive-16by9\">\n");
      out.write("                    <iframe width=\"854\" height=\"480\" src=\"https://www.youtube.com/embed/yLkwdi7LBdc?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>                </div>\n");
      out.write("             <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">Hyundai</h4>\n");
      out.write("                 <p class=\"card-text\">Upcoming Hyundai Cars in india 2017 2018</p>\n");
      out.write("                <p class=\"card-text\"><small class=\"text-muted\">Last updated 3 mins ago</small></p>\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card border-info mb-3\">\n");
      out.write("                <div class=\"embed-responsive embed-responsive-16by9\">\n");
      out.write("                    <iframe width=\"854\" height=\"480\" src=\"https://www.youtube.com/embed/YMyNoilDmEA?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>                </div>  \n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                     <h4 class=\"card-title\">Upcoming Cars</h4>\n");
      out.write("                        <p class=\"card-text\">Latest new top upcoming cars in India 2017 with price, details and launching update.</p>\n");
      out.write("                        <p class=\"card-text\"><small class=\"text-muted\">Last updated 3 mins ago</small></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card border-info mb-3\">\n");
      out.write("            <div class=\"embed-responsive embed-responsive-16by9\">\n");
      out.write("                <iframe width=\"854\" height=\"480\" src=\"https://www.youtube.com/embed/Db0Q9n70wE0?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>    \n");
      out.write("            </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("         <h4 class=\"card-title\">New 2017 Nissan Micra - Perfect Car!</h4>\n");
      out.write("      <p class=\"card-text\">Prices of the 2017 Nissan Micra are expected to be as low as Rs 6 lakh, and may go all the way up to Rs 9 lakh for the top-end variant.</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("          <div class=\"card-deck\">\n");
      out.write("            <div class=\"card border-info mb-3\">\n");
      out.write("                <div class=\"embed-responsive embed-responsive-16by9\">\n");
      out.write("                    <iframe width=\"854\" height=\"480\" src=\"https://www.youtube.com/embed/0DS9PY6iaxE?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                </div> \n");
      out.write("                        \n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                <h4 class=\"card-title\">BMW Vision Self Driving Car World Premiere</h4>\n");
      out.write("                 <p class=\"card-text\">BMW Vision Watch HD Cool New BMW Self Driving Car World Premiere 2016 BMW Vision</p>\n");
      out.write("                <p class=\"card-text\"><small class=\"text-muted\">Last updated 3 mins ago</small></p>\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card border-info mb-3\">\n");
      out.write("                <div class=\"embed-responsive embed-responsive-16by9\">\n");
      out.write("<iframe width=\"854\" height=\"480\" src=\"https://www.youtube.com/embed/eUHOx-_1xZc?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>                </div>  \n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                     <h4 class=\"card-title\">Ferrari La Ferrari: Tested! The New Production Car Record Holder</h4>\n");
      out.write("                        <p class=\"card-text\">Exactly how fast is the La Ferrari and is it any faster than its hybrid hypercar rivals from Stuttgart and Woking.</p>\n");
      out.write("                        <p class=\"card-text\"><small class=\"text-muted\">Last updated 3 mins ago</small></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card border-info mb-3\">\n");
      out.write("            <div class=\"embed-responsive embed-responsive-16by9\">\n");
      out.write("<iframe width=\"854\" height=\"480\" src=\"https://www.youtube.com/embed/OS4UO8m41pk?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>            </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("         <h4 class=\"card-title\">2017 Audi A4 Overview</h4>\n");
      out.write("      <p class=\"card-text\">Prices of the 2017 Audi A4  are expected to be as low as Rs 60 lakh, and may go all the way up to Rs 90 lakh for the top-end variant.</p>\n");
      out.write("      <p class=\"card-text\"><small class=\"text-muted\">Last updated 3 mins ago</small></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <p align=\"center\"> See more..</p>\n");
      out.write("        \n");
      out.write("            <br>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("<!--Footer-->\n");
      out.write("\n");
      out.write("        \n");
      out.write("            <!--/.Fourth column-->\n");
      out.write("       \n");
      out.write("    \n");
      out.write("    <!--/.Footer Links-->\n");
      out.write("\n");
      out.write("    <!--Copyright-->\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("  \n");
      out.write("\n");
      out.write("<!--/.Footer-->\n");
      out.write("     <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>\n");
      out.write("  \n");
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
