package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menuspd.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Sepeda Bersama</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"config/stylespd.css\" media=\"screen\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrap\">\n");
      out.write("            <div id=\"header\">");
      out.write("\n");
      out.write("                <img src=\"image/spd.png\">\n");
      out.write("                <h1><a>Sepeda Bersama</a></h1>\n");
      out.write("                <h2>Penyewaan Sepeda Terbesar,Terlengkap dan Termurah</h2>\n");
      out.write("            </div>");
      out.write("\n");
      out.write("           \n");
      out.write("            <div id=\"menu\">");
      out.write("\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"indexspd.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                    <li><a href=\"kontakspd.jsp\">Contact Us</a></li>\n");
      out.write("                    <li><a href=\"menu.jsp\">Menu Sewa</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>");
      out.write("\n");
      out.write("            <div id=\"content\">");
      out.write("\n");
      out.write("                <div class=\"left\"> ");
      out.write("\n");
      out.write("                    <h2>Produk & Layanan</h2>\n");
      out.write("                <ul>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    <li><a href=\"menu_sewa.jsp\">Rental Sepeda</a></li>\n");
      out.write("                    <li><a href=\"member_sewa.jsp\">Member Rental</a></li>\n");
      out.write("                </ul>\n");
      out.write("                    <h2> Transaksi</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"payment.jsp\">Payment</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    \n");
      out.write("                    <h2>Laporan</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"lap_sewa.jsp\">Laporan Member Rental</a></li>\n");
      out.write("                        <li><a href=\"lap_pay.jsp\">laporan Payment</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>");
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"right\">");
      out.write("\n");
      out.write("                    <table width=\"100%\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td valign=\"top\" width=\"110%\">\n");
      out.write("                                ");
      out.write("\n");
      out.write("                              \n");
      out.write("                                    ");
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
      out.write("                    <a href=\"paket1.jsp\" class=\"produk\">\n");
      out.write("                        <img class=\"produk-img\" src=\"image/sewa2.png\"/><br/>Paket sewa 25 Unit Sepeda<br/>\n");
      out.write("                        Rp.4.500.000/hari\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"paket2.jsp\" class=\"produk\">\n");
      out.write("                        <img class=\"produk-img\" src=\"image/sewa1.png\"/><br/>Paket sewa 50 Unit Sepeda<br/>\n");
      out.write("                        Rp.9.500.000/hari\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"paket3.jsp\" class=\"produk\">\n");
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
      out.write("\n");
      out.write("                                \n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"footer\">");
      out.write("\n");
      out.write("                        Support by <a href=\"http://bsi.ac.id/\">Junior Programmer\n");
      out.write("                            Mahasiswa Program Studi Sistem Informasi Akuntansi</a>,<br>\n");
      out.write("                        Thanks to Layout menu utama menggunakan CSS\n");
      out.write("                    </div>");
      out.write("\n");
      out.write("                </div>");
      out.write(" \n");
      out.write("                <div style=\"clear: both;\"> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>");
      out.write("\n");
      out.write("    </body>\n");
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
