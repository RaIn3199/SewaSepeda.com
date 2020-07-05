package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.*;

public final class edit_005fsewa_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

    koneksi kon=new koneksi();
    String kodekm=request.getParameter("nim");
    String nama=null;
    String jenis_kelamin=null;
    String alamat=null;
    ResultSet rs=null;
    rs = kon.stmt.executeQuery("SELECT*FROM sewaspd WHERE kodekm='"+kodekm+"'");
    if(rs.next())
    {
        kodekm=rs.getString("kodekm");
        nama=rs.getString("nama");
        jenis_kelamin=rs.getString("jenis_kelamin");
        alamat=rs.getString("alamat");
    }
    
      out.write("\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <title>Ubah Data Member</title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <form method=\"POST\" action=\"memberServlet\">\n");
      out.write("                <center>\n");
      out.write("                    <table border=\"2\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"3\"><center><font size=\"5\"><b>Ubah Data Member Sewa</b></font><center></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>KODE MEMBER</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type=\"text\" value=\"");
      out.print(kodekm);
      out.write("\" readonly>\n");
      out.write("                                <input type=\"hidden\" name=\"kodekm\" value=\"");
      out.print(kodekm);
      out.write("\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>NAMA MEMBER</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"nama\" value=\"");
      out.print(nama);
      out.write("\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>JENIS KELAMIN</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td>\n");
      out.write("                                ");

                                    if (jenis_kelamin.equalsIgnoreCase("Laki-laki")) {
      out.write("\n");
      out.write("                                    <input type=\"radio\" name=\"jk\" value=\"Laki-laki\" checked=\"checked\"> Laki-laki\n");
      out.write("                                    <input type=\"radio\" name=\"jk\" value=\"Perempuan\">Perempuan\n");
      out.write("                                    ");
} else { 
      out.write("\n");
      out.write("                                    <input type=\"radio\" name=\"jk\" value=\"Perempuan\"> Laki-laki\n");
      out.write("                                    <input type=\"radio\" name=\"jk\" value=\"Perempuan\" checked=\"checked\">Perempuan\n");
      out.write("                                    ");
 } 
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>ALAMAT</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><textarea name=\"alamat\" rows=\"5\">");
      out.print(alamat);
      out.write("\"></textarea></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"3\">\n");
      out.write("                        <center>\n");
      out.write("                            <input type=\"submit\" name=\"aksi\" value=\"Update\">\n");
      out.write("                            <a href=\"tampil_sewa.jsp\">[Lihat Data]</a>\n");
      out.write("                        </center>\n");
      out.write("                        </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                                    </center>\n");
      out.write("            </form>\n");
      out.write("        </body>\n");
      out.write("    </html>");
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
