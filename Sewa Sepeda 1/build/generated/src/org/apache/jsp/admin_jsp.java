package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<sql:query var=\"qryadmin\" dataSource=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("    SELECT *FROM admin WHERE user_name\n");
      out.write("    LIKE '%");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("%'\n");
      out.write("    OR nama_lengkap\n");
      out.write("    LIKE '%");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("%'\n");
      out.write("</sql:query>\n");
      out.write("\n");
      out.write("<font color=\"black\"> <h2> .: [Form User/Admin] :. </h2> </font>\n");
      out.write("<form action=\"aksi_admin\" method=\"post\">\n");
      out.write("    <table border=\"0\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        <input type=\"hidden\" name=\"aksi\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.aksi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("        <tr>\n");
      out.write("            <td>User Name</td>\n");
      out.write("            <td>:</td>\n");
      out.write("            <td><input type=\"text\" name=\"user_name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.user_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Nama Lengkap</td>\n");
      out.write("            <td>:</td>\n");
      out.write("            <td><input type=\"text\" name=\"nama_lengkap\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.nama_lengkap}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Password</td>\n");
      out.write("            <td>:</td>\n");
      out.write("            <td><input type=\"text\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Hak Akses</td>\n");
      out.write("            <td>:</td>\n");
      out.write("            <td><input type=\"text\" name=\"hak_akses\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hak_akses}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("        </tr> \n");
      out.write("            \n");
      out.write("        <tr>\n");
      out.write("            <td><input type=\"submit\" value=\"Simpan\" class=\"button\"/></td><td></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<form action=\"\" method=\"post\">\n");
      out.write("    Cari Data User : <input type=\"text\" name=\"cari\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("    <input type=\"submit\" value=\"Cari\" class=\"button\"/> </br>\n");
      out.write("</form>\n");
      out.write("<table border=\"0\" width=\"70%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("    <tr class=\"head\">\n");
      out.write("        <td>User Name</td>\n");
      out.write("        <td>Nama Lengkap</td>\n");
      out.write("        <td>Password</td>\n");
      out.write("        <td>Hak Akses</td>\n");
      out.write("    </tr>\n");
      out.write("    <c:forEach var=\"rowadmin\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qryadmin.rowsByIndex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("        <tr class=\"isi\">\n");
      out.write("            <td valign='top'>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowadmin[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("            <td valign='top'>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowadmin[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("            <td valign='top' align=\"center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowadmin[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("            <td valign='top' align=\"center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowadmin[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("    </c:forEach>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("        \n");
      out.write("        ");
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
