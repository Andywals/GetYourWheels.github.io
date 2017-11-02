package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">\n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("         function validateRegEx(regex, input, helpText, helpMessage) {\n");
      out.write("        // See if the input data validates OK\n");
      out.write("        if (!regex.test(input)) {\n");
      out.write("          // The data is invalid, so set the help message and return false\n");
      out.write("          if (helpText != null)\n");
      out.write("            helpText.innerHTML = helpMessage;\n");
      out.write("          return false;\n");
      out.write("        }\n");
      out.write("        else {\n");
      out.write("          // The data is OK, so clear the help message and return true\n");
      out.write("          if (helpText != null)\n");
      out.write("            helpText.innerHTML = \"\";\n");
      out.write("          return true;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("       function validatePhone(inputField, helpText) {\n");
      out.write("        // First see if the input value contains data\n");
      out.write("        if (!validateNonEmpty(inputField, helpText))\n");
      out.write("          return false;\n");
      out.write("\n");
      out.write("        // Then see if the input value is a phone number\n");
      out.write("        return validateRegEx(/^\\d{10}$/,\n");
      out.write("          inputField.value, helpText,\n");
      out.write("          \"Please enter a phone number (for example, 9587463210).\");\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function validateEmail(inputField, helpText) {\n");
      out.write("        // First see if the input value contains data\n");
      out.write("        if (!validateNonEmpty(inputField, helpText))\n");
      out.write("          return false;\n");
      out.write("\n");
      out.write("        // Then see if the input value is an email address\n");
      out.write("        return validateRegEx(/^[\\w\\.-_\\+]+@[\\w-]+(\\.\\w{2,3})+$/,\n");
      out.write("          inputField.value, helpText,\n");
      out.write("          \"Please enter an email address (for example, johndoe@acme.com).\");\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function validateNonEmpty(inputField, helpText) {\n");
      out.write("        // See if the input value contains any text\n");
      out.write("        return validateRegEx(/.+/,\n");
      out.write("          inputField.value, helpText,\n");
      out.write("          \"Please enter a value.\");\n");
      out.write("      }\n");
      out.write("      function Redirect(){\n");
      out.write("          window.location=\"http://localhost:8080/GetYourWheels/newsignup.html\";\n");
      out.write("          alert(\"We're sorry but there is something wrong with the information.\");\n");
      out.write("      }\n");
      out.write("      function placeOrder(form) {\n");
      out.write("        if (validateNonEmpty(form[\"fullName\"], form[\"fullName_help\"])&&\n");
      out.write("                validateNonEmpty(form[\"password4\"], form[\"password4_help\"])&&\n");
      out.write("                validateEmail(form[\"email4\"], form[\"email4_help\"])&&\n");
      out.write("                validatePhone(form[\"phone\"], form[\"phone_help\"])&&\n");
      out.write("                validateNonEmpty(form[\"address\"], form[\"address_help\"])){\n");
      out.write("           //Submit the order to the server\n");
      out.write("                form.submit();\n");
      out.write("          } \n");
      out.write("          else {\n");
      out.write("               alert(\"We're sorry but there is something wrong with the information.\");\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("              \n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      function placeOrderLogin(form) {\n");
      out.write("        if (validateNonEmpty(form[\"password\"], form[\"password_help\"])&&\n");
      out.write("                validateEmail(form[\"email\"], form[\"email_help\"])){\n");
      out.write("           //Submit the order to the server\n");
      out.write("                form.submit();\n");
      out.write("          } \n");
      out.write("          else {\n");
      out.write("               alert(\"We're sorry but there is something wrong with the information.\");\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("           function checkLogin() {\n");
      out.write("                if (cusId == null || cusId.equals(\"q\")){\n");
      out.write("           //Submit the order to the server\n");
      out.write("                alert(\"We're sorry but there is something wrong with the information.\");\n");
      out.write("              \n");
      out.write("          } \n");
      out.write("          else {\n");
      out.write("               //alert(\"We're sorry but there is something wrong with the information.\");\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("              \n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("        span{\n");
      out.write("            color: red;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerhome.jsp", out, false);
      out.write("  \n");
      out.write("\n");
      out.write("      \n");
      out.write("<div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\" data-interval=\"3000\">\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"3\"></li>\n");
      out.write("        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"4\"></li>\n");
      out.write("  </ol>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("      <div class=\"carousel-item active\">\n");
      out.write("      <img class=\"d-block w-100\" src=\"images\\car6.jpg\" alt=\"Second slide\" style=\"height:640px;\">\n");
      out.write("    </div>\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("      <img class=\"d-block w-100\" src=\"images/car5.jpg\" alt=\"Second slide\" style=\"height:640px;\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img class=\"d-block w-100\" src=\"images/car4.jpg\" alt=\"First slide\" style=\"height:640px;\">\n");
      out.write("    </div>\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("      <img class=\"d-block w-100\" src=\"images/car7.jpg\" alt=\"Second slide\" style=\"height:640px;\">\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img class=\"d-block w-100\" src=\"images/car1.jpg\" alt=\"Third slide\" style=\"height:640px;\">\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Previous</span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Next</span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
 Cookie cookies[] = request.getCookies();
    String str = null;
    String cusId = null;
    for(Cookie c: cookies)
    {
        if(c.getName().equals("email"))
        {
          str = c.getValue();
        }
        if(c.getName().equals("cusId"))
        {
          cusId = c.getValue();
        }
    }
 
      out.write('\n');
      out.write(' ');
      out.print( str );
      out.write('\n');
      out.write(' ');
      out.print( cusId );
      out.write("\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("  \n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
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
