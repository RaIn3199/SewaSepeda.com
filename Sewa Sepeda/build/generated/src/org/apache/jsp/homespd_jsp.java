package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homespd_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<p style=\"text-align:justify;\">\n");
      out.write("    <img src=\"image/spd1.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"50%\" height=\"50%\"/>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <p style=\"text-align:center; font-size: 20px;\">\n");
      out.write("    WHY WE ARE \n");
      out.write("    DIFFERENT\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <p style=\"text-align:center; font-size: 15px;\">\n");
      out.write("    Kami memberikan jaminan kualitas  sewa sepeda dalam kondisi sepeda yang selalu terjaga.\n");
      out.write("    Memberikan jaminan ketepatan waktu pengiriman sewa sepeda ke lokasi acara \n");
      out.write("    serta memberikan dokumentasi gratis dengan drone terbaik. \n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <style>\n");
      out.write("        .btn{\n");
      out.write("            opacity: 0.6;\n");
      out.write("            cursor: not-allowed;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("        <body>\n");
      out.write("            <button class=\"btn\">Sewa Sekarang</button>\n");
      out.write("        </body>\n");
      out.write("            \n");
      out.write("</p>\n");
      out.write("<br>\n");
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
