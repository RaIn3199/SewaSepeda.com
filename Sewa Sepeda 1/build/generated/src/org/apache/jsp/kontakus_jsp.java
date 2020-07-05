package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kontakus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <img src=\"image/contactus1.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"50%\" height=\"50%\"/>\n");
      out.write("    <br>\n");
      out.write("<p style=\"text-align:justify;\">\n");
      out.write("    <img src=\"image/cu1.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"5%\" height=\"5%\"/>\n");
      out.write("    <br>\n");
      out.write("    021 - 5445 0234\n");
      out.write("</p>\n");
      out.write("<br>\n");
      out.write("<p style=\"text-align:justify;\">\n");
      out.write("    <img src=\"image/cu5.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"5%\" height=\"5%\"/>\n");
      out.write("    <br>\n");
      out.write("    0881 5435 2180\n");
      out.write("</p>\n");
      out.write("<br>\n");
      out.write("<p style=\"text-align:justify;\">\n");
      out.write("    <img src=\"image/cu2.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"5%\" height=\"5%\"/>\n");
      out.write("    <br>\n");
      out.write("    @sewaspd_bersama\n");
      out.write("</p>\n");
      out.write("<br>\n");
      out.write("<p style=\"text-align:justify;\">\n");
      out.write("    <img src=\"image/cu3.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"5%\" height=\"5%\"/>\n");
      out.write("    <br>\n");
      out.write("    sepedabersama@yahoo.com\n");
      out.write("</p>\n");
      out.write("<br>\n");
      out.write("<p style=\"text-align:justify;\">\n");
      out.write("    <img src=\"image/cu4.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"5%\" height=\"5%\"/>\n");
      out.write("    <br>\n");
      out.write("    Jl. Kemuning Raya No. 23\n");
      out.write("    Jakarta Barat\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");
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
