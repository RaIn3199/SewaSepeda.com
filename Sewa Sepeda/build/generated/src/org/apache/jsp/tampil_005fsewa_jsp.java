package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.*;

public final class tampil_005fsewa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Data Member</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table width=\"667\" height=\"150\" border=\"2\" align=\"center\">\n");
      out.write("            <tr align=\"center\">\n");
      out.write("                <td colspan=\"5\"><h3>DATA MEMBER SEWA SEPEDA</h3></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>KODE MEMBER</th>\n");
      out.write("                <th>NAMA MEMBER</th>\n");
      out.write("                <th>JENIS KELAMIN</th>\n");
      out.write("                <th>ALAMAT</th>\n");
      out.write("                <th>AKSI</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
//--koneksi database--
                String kodekm=null;
                String nama=null;
                String jenis_kelamin=null;
                String alamat=null;
                ResultSet rs = null;
                
                koneksi kon=new koneksi();
                rs= kon.stmt.executeQuery("SELECT * FROM sewaspd ORDER BY kodekm asc");
                
                while (rs.next())
                {
                    kodekm=rs.getString("kodekm");
                    nama=rs.getString(2);
                    jenis_kelamin=rs.getString(3);
                    alamat=rs.getString(4);
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
 out.println(kodekm);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(nama);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(jenis_kelamin);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(alamat);
      out.write("</td>\n");
      out.write("                <td><a href=\"edit_sewa.jsp?kodekm=");
 out.print(kodekm);
      out.write("\">EDIT</a>\n");
      out.write("                || <td><a href=\"sewaServlet?aksi=Delete&kodekm=");
 out.print(kodekm);
      out.write("\">HAPUS</a>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"6\" align=\"center\"><h3><a href=\"member_sewa.jsp?hal=input_sewa.jsp\">Tambah Data</a></h3></td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            ");
kon.close();
      out.write("\n");
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
