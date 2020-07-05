package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;

public final class member_005fsewa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/tampil_sewa.jsp");
    _jspx_dependants.add("/edit_sewa.jsp");
    _jspx_dependants.add("/input_sewa.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("                    <li><a href=\"member_sewa.jsp?hal=tampil-sewa\">Member Rental</a></li>\n");
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
      out.write("                                ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_0.setPageContext(_jspx_page_context);
          _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampil-sewa'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
          if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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
              out.write("                <td colspan=\"6\" align=\"center\"><h3><a href=\"member_sewa.jsp?hal=input-sewa\">Tambah Data</a></h3></td>\n");
              out.write("                \n");
              out.write("            </tr>\n");
              out.write("        </table>\n");
              out.write("            ");
kon.close();
              out.write("\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_1.setPageContext(_jspx_page_context);
          _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='edit-sewa'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
          if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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
              out.write("            <form method=\"POST\" action=\"sewaServlet\">\n");
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
              out.write("                            <a href=\"member_sewa.jsp?hal=tampil-sewa\">[Lihat Data]</a>\n");
              out.write("                        </center>\n");
              out.write("                        </td>\n");
              out.write("                        </tr>\n");
              out.write("                    </table>\n");
              out.write("                                    </center>\n");
              out.write("            </form>\n");
              out.write("        </body>\n");
              out.write("    </html>");
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    ");
          //  c:otherwise
          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
          _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
          _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
          if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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
              out.write("                <td colspan=\"6\" align=\"center\"><h3><a href=\"member_sewa.jsp?hal=input-sewa\">Tambah Data</a></h3></td>\n");
              out.write("                \n");
              out.write("            </tr>\n");
              out.write("        </table>\n");
              out.write("            ");
kon.close();
              out.write("\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
            return;
          }
          _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
          out.write("\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write("\n");
      out.write("                                        \n");
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

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='input-sewa'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("<head>\n");
        out.write("<title>Input Data Member</title>\n");
        out.write("</head>\n");
        out.write("<body>\n");
        out.write("<form method=\"POST\" action=\"sewaServlet\">\n");
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
        out.write("<a href=\"member_sewa.jsp?hal=tampil-sewa\">[Lihat Data]</a>\n");
        out.write("</td>\n");
        out.write("</tr>\n");
        out.write("</table>\n");
        out.write("</center>\n");
        out.write("</form>\n");
        out.write("</body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }
}
