package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class input_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Input Data Member</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form method=\"POST\" action=\"memberServlet\">\n");
      out.write("<center>\n");
      out.write("<table border=2>\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"3\"><center><font size=5><b>Form Input Data\n");
      out.write("Member</b></font><center></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Kode Member </td>\n");
      out.write("<td>:</td>\n");
      out.write("<td><input type=text name=kodekm></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Nama Lengkap</td>\n");
      out.write("<td>:</td>\n");
      out.write("<td><input type=text name=nama></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Jenis Kelamin</td>\n");
      out.write("<td>:</td>\n");
      out.write("<td><input type=radio name=jk value='Laki-laki'>Laki-laki\n");
      out.write("<input type=radio name=jk value='Perempuan'>Perempuan\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Alamat</td>\n");
      out.write("<td>:</td>\n");
      out.write("<td><textarea name=alamat rows=5></textarea></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"3\"><center>\n");
      out.write("    <input type=submit name=\"aksi\" value=Simpan>\n");
      out.write("<input type=reset value=Batal>\n");
      out.write("<a href=\"tampil_sewa.jsp\">[Lihat Data]</a>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("</form>\n");
      out.write("</body>\n");
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
