package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexspd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/homespd.jsp");
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
      out.write("        <div id=\"wrap\"> \n");
      out.write("            <div id=\"header\">");
      out.write("\n");
      out.write("                <img src=\"image/spd.png\">\n");
      out.write("                <h1><a>Sepeda Bersama</a></h1>\n");
      out.write("                <h2>Penyewaan Sepeda Terbesar,Terlengkap dan Termurah</h2>\n");
      out.write("            </div>");
      out.write("\n");
      out.write("            <div id=\"menu\">");
      out.write("\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"indexspd.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                    <li><a href=\"kontakspd.jsp\">Contact Us</a></li>\n");
      out.write("                    <li><a href=\"menuspd.jsp\">Menu Sewa</a></li>\n");
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
      out.write("                    <li><a href=\"user.jsp\">User</a></li>\n");
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
      out.write("                                        ");
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
      out.write("    <p style=\"text-align:center;\">\n");
      out.write("     <li><a href=\"menuspd.jsp\">Sewa Sekarang</a></li>   \n");
      out.write("</p>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("             </div>               \n");
      out.write("                    <div class=\"footer\">");
      out.write("\n");
      out.write("                        Support by <a href=\"http://bsi.ac.id/\">Junior Programmer\n");
      out.write("                            Mahasiswa Program Studi Sistem Informasi Akuntansi</a>,<br>\n");
      out.write("                        Thanks to Layout menu utama menggunakan CSS\n");
      out.write("                    </div>");
      out.write("\n");
      out.write("                <div style=\"clear: both;\"> </div>\n");
      out.write("        </div>");
      out.write("\n");
      out.write("    \n");
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
