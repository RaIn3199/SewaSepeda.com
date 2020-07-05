package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menuspd_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .clear{\n");
      out.write("                clear: both;\n");
      out.write("            }\n");
      out.write("            .produk-judul {\n");
      out.write("                width: 50%;\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("            .produk-more{\n");
      out.write("                width:50%;\n");
      out.write("                text-align: right;\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("            .produk {\n");
      out.write("                background : #FFF;\n");
      out.write("                float: left;\n");
      out.write("                width: 30%;\n");
      out.write("                margin: 5px;\n");
      out.write("                text-align:center;\n");
      out.write("            }\n");
      out.write("            .produk-img {\n");
      out.write("                width: 80%;\n");
      out.write("                height: 80px;\n");
      out.write("                background-color: #000;\n");
      out.write("                color: #fff;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            <div style=\"padding: 5px;\">\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"produk-judul\">Paket Sewa Sepeda</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"produk_detail.jsp\" class=\"produk\">\n");
      out.write("                        <img class=\"produk-img\" src=\"image/sewa2.png\"/><br/>Paket sewa 25 Unit Sepeda<br/>\n");
      out.write("                        Rp.4.500.000/hari\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"produk_detail.jsp\" class=\"produk\">\n");
      out.write("                        <img class=\"produk-img\" src=\"image/sewa1.png\"/><br/>Paket sewa 50 Unit Sepeda<br/>\n");
      out.write("                        Rp.9.500.000/hari\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"produk_detil.jsp\" class=\"produk\">\n");
      out.write("                        <img class=\"produk-img\" src=\"image/sewa3.png\"/><br/>Paket sewa 100 Unit Sepeda<br/>\n");
      out.write("                        Rp.19.000.000/hari\n");
      out.write("                        <br/>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
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
