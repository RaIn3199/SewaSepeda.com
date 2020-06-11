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
import control.koneksi;
import java.sql.*;
import java.sql.ResultSet;
import control.koneksi;
import model.barang;
import model.customer;
import model.pemesanan;
import java.util.Date;
import java.sql.*;
import control.koneksi;
import java.sql.ResultSet;
import control.koneksi;
import model.barang;
import model.customer;
import model.retur;
import java.util.Date;

public final class beranda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(14);
    _jspx_dependants.add("/homespd.jsp");
    _jspx_dependants.add("/aboutspd.jsp");
    _jspx_dependants.add("/kontakus.jsp");
    _jspx_dependants.add("/menuspd.jsp");
    _jspx_dependants.add("/paketsewa1.jsp");
    _jspx_dependants.add("/paketsewa2.jsp");
    _jspx_dependants.add("/paketsewa3.jsp");
    _jspx_dependants.add("/barang.jsp");
    _jspx_dependants.add("/customer.jsp");
    _jspx_dependants.add("/akun.jsp");
    _jspx_dependants.add("/user.jsp");
    _jspx_dependants.add("/pemesanan.jsp");
    _jspx_dependants.add("/config/autokode.jsp");
    _jspx_dependants.add("/retur.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
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
      out.write("\n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SewaSepeda.com</title>\n");
      out.write("        <link href=\"config/stylespd.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"config/setting.js\"></script>\n");
      out.write("        <link href=\"config/cssTable.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrap\"> \n");
      out.write("            <div id=\"header\">");
      out.write("\n");
      out.write("                <img src=\"image/spd.png\">\n");
      out.write("                <h1><a>SewaSepeda.com</a></h1>\n");
      out.write("                <h2>Penyewaan Sepeda Terbesar,Terlengkap dan Termurah</h2>\n");
      out.write("            </div>");
      out.write("\n");
      out.write("            <div id=\"menu\">");
      out.write("\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=home\">Home</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=about\">About</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=kontak\">Contact Us</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=menu\">Menu Sewa</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=dataPeg\">Change Password</a></li> \n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=logout\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>");
      out.write("\n");
      out.write("            <div id=\"content\">");
      out.write("\n");
      out.write("                <div class=\"left\"> ");
      out.write("\n");
      out.write("                    <h2>Master Data</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"beranda.jsp?halaman=tampilbrg&aksi=SIMPAN\">Data Barang</a></li>\n");
      out.write("                        <li><a href=\"beranda.jsp?halaman=tampilcus&aksi=SIMPAN\">Data Customer</a></li>\n");
      out.write("                        <li><a href=\"beranda.jsp?halaman=tampilakun&aksi=SIMPAN\">Data Akun</a></li>\n");
      out.write("                        <li><a href=\"beranda.jsp?halaman=tampiluser&aksi=SIMPAN\">Data User</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <h2> Transaksi</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"beranda.jsp?halaman=pesan\">Pemesanan</a></li>\n");
      out.write("                        <li><a href=\"beranda.jsp?halaman=retursewa\">Retur Penyewaan</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    \n");
      out.write("                    <h2>Laporan</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"lap_sewa.jsp\">Laporan Member Rental</a></li>\n");
      out.write("                        <li><a href=\"lap_pay.jsp\">laporan Payment</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"box\" align=\"justify\">\n");
      out.write("                    <div class=\"subtitle\">Date and Time</div>\n");
      out.write("                    <marquee direction=\"left\"> ");
      out.print(new java.util.Date());
      out.write("\n");
      out.write("                    </marquee>\n");
      out.write("                    <br />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\" align=\"justify\">\n");
      out.write("                    <div class=\"subtitle\">About this website</div>\n");
      out.write("                    <marquee behavior=\"scroll\" direction=\"up\" scrollamount=\"5\">\n");
      out.write("                        SISTEM INFORMASI AKUNTANSI UNIVERSITAS BSI APLIKASI PEMBELIAN\n");
      out.write("                    </marquee>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <div class=\"subtitle\">About this website</div>\n");
      out.write("                    <marquee direction=\"down\" height=\"200\" behavior=\"alternate\">\n");
      out.write("                        <marquee marquee behavior=\"alternate\">\n");
      out.write("                            SISTEM INFORMASI AKUNTANSI<br>UNIVERSITAS BSI<br>APLIKASI PEMBELIAN\n");
      out.write("                        </marquee>\n");
      out.write("                    </marquee>\n");
      out.write("                </div>\n");
      out.write("                </div>");
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"right\">");
      out.write("\n");
      out.write("                    <table width=\"100%\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td valign=\"top\" width=\"110%\">\n");
      out.write("                                <div class=\"text_area\" align=\"justify\">\n");
      out.write("                                ");
      out.write("\n");
      out.write("                                        ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_11 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_11.setPageContext(_jspx_page_context);
          _jspx_th_c_when_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='pesan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_11 = _jspx_th_c_when_11.doStartTag();
          if (_jspx_eval_c_when_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                            ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write('\n');
              out.write('\n');
              out.write('\n');

    try {
        koneksi kon = new koneksi();
        Class.forName("com.mysql.jdbc.Driver");
        ResultSet nopesan = null;
        nopesan = kon.stmt.executeQuery("select max(right(no_pesan,6)) as no FROM pemesanan");
        while (nopesan.next()) {
            if (nopesan.first() == false) {
                out.println("<input type='hidden' name='no_pesan' value='PS000001' id='nopes'/>");
            } else {
                nopesan.last();
                int autonops = nopesan.getInt(1) + 1;
                String nomorps = String.valueOf(autonops);
                int noLong = nomorps.length();
                
                for (int a = 1; a < 7 - noLong; a++) {
                    nomorps = "0" + nomorps;
                }
                String nomerps = "PS" + nomorps;
                out.println("<input type='hidden' name='no_pesan' id='nopes' value='" + nomerps + "'/>");
            }
        }
    } catch (Exception e){
        out.println(e);
    }
 
              out.write('\n');
              out.write('\n');
 java.util.Date waktu = new java.util.Date();
    int tanggal = waktu.getDate();
    int tahun = waktu.getYear() + 1900;
    int bulan = waktu.getMonth() + 1;
    String tgl = tahun + "-" + bulan + "-" + tanggal;
    pemesanan pemesanan = new pemesanan();
    barang barang = new barang();
    customer customer = new customer();
    koneksi kon = new koneksi();
    ResultSet rs = null;
    ResultSet qrybarang = null;
    ResultSet qrypemesanan = null;
    
              out.write("\n");
              out.write("    <html>\n");
              out.write("        <head>\n");
              out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\n");
              out.write("            <title> Transaksi Pemesanan</title>\n");
              out.write("        </head>\n");
              out.write("        <body>\n");
              out.write("        ");
              if (_jspx_meth_sql_query_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_11, _jspx_page_context))
                return;
              out.write("\n");
              out.write("            <h1>Transaksi Pemesanan Barang</h1></br>\n");
              out.write("            <table border=\"0\">\n");
              out.write("                <form action=\"ServletPemesanan\" method=\"post\">\n");
              out.write("                    <h2>Data Barang</h2>\n");
              out.write("                    <tr>\n");
              out.write("                        <td>No Pesan</td>   <td>: <input type=\"text\" name=\"no_pesan\" id=\"nopesan\" value=\"\" readonly=\"readonly\"/>\n");
              out.write("                            <input type=\"button\" onclick=\"pesan()\" value=\"Add No Pesan\" class=\"button\"></td>\n");
              out.write("                    </tr>\n");
              out.write("                    <tr>\n");
              out.write("                        <td>Tanggal Pesan</td>  <td>: <input type=\"text\" name=\"tanggal\" value =");
              out.print( tgl);
              out.write(" readonly=\"readonly\"></td>\n");
              out.write("                    </tr>\n");
              out.write("                    <tr>\n");
              out.write("                        <td>Barang</td>     <td>: <select name=\"kode\" onchange=\"showEmp(this.value);\">\n");
              out.write("                                <option value=\"-1\">Pilih Barang</option>\n");
              out.write("                                ");

                                    rs = kon.stmt.executeQuery("SELECT * from barang ");
                                    while (rs.next()) {
                                        barang.setKodebarang(rs.getString("kd_brg"));
                                        barang.setNamabarang(rs.getString("nm_brg"));
                                
              out.write("\n");
              out.write("                                <option value=\"");
              out.print(barang.getKodebarang());
              out.write('"');
              out.write('>');
              out.print(barang.getKodebarang());
              out.write(" || ");
              out.print(barang.getNamabarang());
              out.write("</option>\n");
              out.write("                                ");
 } 
              out.write("\n");
              out.write("                            </select></td>\n");
              out.write("                    </tr>\n");
              out.write("                    <input type=\"hidden\" name=\"emp_id\" id=\"emp_id\" value=\"\">\n");
              out.write("                    <tr>\n");
              out.write("                        <td>Harga Barang</td>   <td>: <input type=\"text\" name=\"harga\" id=\"ename\" value=\"\" readonly=\"readonly\" onkeyup=\"sumPesan();\"></td>\n");
              out.write("                    </tr>\n");
              out.write("                    <tr>\n");
              out.write("                        <td>Jumlah Pesan</td>   <td>: <input type=\"text\" name=\"jml\" id=\"jml\" onkeyup=\"sumPesan();\"></td>\n");
              out.write("                    </tr>\n");
              out.write("                    <tr>\n");
              out.write("                        <td>Subtotal</td>   <td>: <input type=\"text\" name=\"sub\" id=\"subtotal\" readonly=\"readonly\"></td>\n");
              out.write("                    </tr>\n");
              out.write("                    <tr>\n");
              out.write("                        <td><input type=\"submit\" value=\"TAMBAH\" name=\"aksi1\"></td>\n");
              out.write("                    </tr>\n");
              out.write("            </table>\n");
              out.write("            <h2>Data Customer</h2>\n");
              out.write("            Supplier <select name=\"customer\">\n");
              out.write("                <option value=\"-1\">Pilih Customer</option>\n");
              out.write("                ");
 
                    rs = kon.stmt.executeQuery("SELECT * from customer ");
                    while (rs.next()) {
                        customer.setKodecust(rs.getString("kd_cust"));
                        customer.setNamacust(rs.getString("nm_cust"));
                
              out.write("\n");
              out.write("                <option value=\"");
              out.print(customer.getKodecust());
              out.write('"');
              out.write('>');
              out.print(customer.getNamacust());
              out.write("</option>\n");
              out.write("                ");
 } 
              out.write("\n");
              out.write("            </select><br><br>\n");
              out.write("            \n");
              out.write("            <table width=\"535\" border=\"1\" align=\"center\">\n");
              out.write("                <tr align=\"center\">\n");
              out.write("                    <td colspan=\"5\"><h3>Data Barang Untuk Dipesan</h3></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <th>Kode Barang</th>\n");
              out.write("                    <th>Quantity</th>\n");
              out.write("                    <th>Subtotal</th>\n");
              out.write("                    <th>AKSI</th>\n");
              out.write("                </tr>\n");
              out.write("                ");

                    rs = kon.stmt.executeQuery("SELECT * from sementara_pesan");
                    while (rs.next()) {
                        out.println("<tr class=isi>"
                                + "<td>" + rs.getString(2) + "</td>"
                                + "<td>" + rs.getString(3) + "</td>"
                                + "<td>" + rs.getString(4) + "</td>"
                                + "<td><a href=ServletPemesanan?aksi2=HAPUS&kode=" + rs.getString(2) + ">Hapus</a></td>"
                                + "</tr>");
                    }
                
              out.write("\n");
              out.write("            </table>\n");
              out.write("                ");
              if (_jspx_meth_c_forEach_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_11, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        ");
kon.close();
              out.write("\n");
              out.write("                        <tr><td><input type=\"submit\" value=\"PROSES\" name=\"aksi3\"> <input type=\"reset\" value=\"CANCEL\"></td></tr>\n");
              out.write("                    </table>\n");
              out.write("                </form>\n");
              out.write("        </body>\n");
              out.write("            </html>\n");
              out.write("    ");
              out.write("\n");
              out.write("                        ");
              int evalDoAfterBody = _jspx_th_c_when_11.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
          out.write("\n");
          out.write("                        ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_12 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_12.setPageContext(_jspx_page_context);
          _jspx_th_c_when_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='retursewa'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_12 = _jspx_th_c_when_12.doStartTag();
          if (_jspx_eval_c_when_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                            ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
 java.util.Date waktu = new java.util.Date();
    int tanggal = waktu.getDate();
    int tahun = waktu.getYear() + 1900;
    int bulan = waktu.getMonth() + 1;
    String tgl = tahun + "-" + bulan + "-" + tanggal;
    retur retur = new retur();
    barang barang = new barang();
    customer customer = new customer();
    koneksi kon = new koneksi();
    ResultSet rs = null;
    ResultSet qrybarang = null;
    ResultSet qryretur = null;
    
              out.write("\n");
              out.write("    <html>\n");
              out.write("        <head>\n");
              out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\n");
              out.write("            <title> Transaksi Retur</title>\n");
              out.write("        </head>\n");
              out.write("        <body>\n");
              out.write("        ");
              if (_jspx_meth_sql_query_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_12, _jspx_page_context))
                return;
              out.write("\n");
              out.write("            <h1>Transaksi Retur Barang</h1></br>\n");
              out.write("            <table border=\"0\">\n");
              out.write("                <form action=\"ServletRetur\" method=\"post\">\n");
              out.write("                    <h2>Data Retur</h2>\n");
              out.write("                    <tr>\n");
              out.write("                        <td>No Retur</td>   <td>: <input type=\"text\" name=\"no_retur\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.no_retur}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\"/> </td>\n");
              out.write("                    </tr>\n");
              out.write("                    <tr>\n");
              out.write("                        <td>Tanggal Retur</td>  <td>: <input type=\"text\" name=\"tanggal\" value =");
              out.print( tgl);
              out.write(" readonly=\"readonly\"></td>\n");
              out.write("                    </tr>\n");
              out.write("                    <tr>\n");
              out.write("                        <td>Customer</td>     <td>: <select name=\"customer\">\n");
              out.write("                        <option value=\"-1\">Pilih Customer</option>\n");
              out.write("                        ");
 
                            rs = kon.stmt.executeQuery("SELECT * from customer ");
                            while (rs.next()) {
                                customer.setKodecust(rs.getString("kd_cust"));
                                customer.setNamacust(rs.getString("nm_cust"));
                        
              out.write("\n");
              out.write("                        <option value=\"");
              out.print(customer.getKodecust());
              out.write('"');
              out.write('>');
              out.print(customer.getNamacust());
              out.write("</option>\n");
              out.write("                        ");
 } 
              out.write("\n");
              out.write("                    </select>\n");
              out.write("                    </tr>\n");
              out.write("                    <tr>\n");
              out.write("                        <td>Barang</td>     <td>: <select name=\"kode\" onchange=\"showEmp(this.value);\">\n");
              out.write("                                <option value=\"-1\">Pilih Barang</option>\n");
              out.write("                                ");

                                    rs = kon.stmt.executeQuery("SELECT * from barang ");
                                    while (rs.next()) {
                                        barang.setKodebarang(rs.getString("kd_brg"));
                                        barang.setNamabarang(rs.getString("nm_brg"));
                                
              out.write("\n");
              out.write("                                <option value=\"");
              out.print(barang.getKodebarang());
              out.write('"');
              out.write('>');
              out.print(barang.getKodebarang());
              out.write(" || ");
              out.print(barang.getNamabarang());
              out.write("</option>\n");
              out.write("                                ");
 } 
              out.write("\n");
              out.write("                            </select></td>\n");
              out.write("                    </tr>\n");
              out.write("                    <input type=\"hidden\" name=\"emp_id\" id=\"emp_id\" value=\"\">\n");
              out.write("                    <tr>\n");
              out.write("                        <td>Harga Barang</td>   <td>: <input type=\"text\" name=\"harga\" id=\"ename\" value=\"\" readonly=\"readonly\" onkeyup=\"sumRetur();\"></td>\n");
              out.write("                    </tr>\n");
              out.write("                    <tr>\n");
              out.write("                        <td>Jumlah Pesan</td>   <td>: <input type=\"text\" name=\"jml\" id=\"jml\" onkeyup=\"sumRetur();\"></td>\n");
              out.write("                    </tr>\n");
              out.write("                    <tr>\n");
              out.write("                        <td>Subtotal</td>   <td>: <input type=\"text\" name=\"sub\" id=\"subtotal\" readonly=\"readonly\"></td>\n");
              out.write("                    </tr>\n");
              out.write("                    <tr>\n");
              out.write("                        <td><input type=\"submit\" value=\"TAMBAH\" name=\"aksi1\"></td>\n");
              out.write("                    </tr>\n");
              out.write("            </table>\n");
              out.write("            \n");
              out.write("            \n");
              out.write("            <table width=\"535\" border=\"1\" align=\"center\">\n");
              out.write("                <tr align=\"center\">\n");
              out.write("                    <td colspan=\"5\"><h3>Data Barang Yang Diretur</h3></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <th>Nomor Transaksi</th>\n");
              out.write("                    <th>Kode Barang</th>\n");
              out.write("                    <th>Quantity</th>\n");
              out.write("                    <th>Subtotal</th>\n");
              out.write("                    <th>Aksi</th>\n");
              out.write("                </tr>\n");
              out.write("                ");

                    rs = kon.stmt.executeQuery("SELECT * from sementara_retur");
                    while (rs.next()) {
                        out.println("<tr class=isi>"
                                + "<td>" + rs.getString(1) + "</td>"
                                + "<td>" + rs.getString(2) + "</td>"
                                + "<td>" + rs.getString(3) + "</td>"
                                + "<td>" + rs.getString(4) + "</td>"
                                + "<td><a href=ServletRetur?aksi2=HAPUS&no_retur=" + rs.getString(1) + ">Hapus</a></td>"
                                + "</tr>");
                    }
                
              out.write("\n");
              out.write("            </table>\n");
              out.write("            ");
              if (_jspx_meth_c_forEach_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_12, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        ");
kon.close();
              out.write("\n");
              out.write("                        <tr><td><input type=\"submit\" value=\"PROSES\" name=\"aksi3\"> <input type=\"reset\" value=\"CANCEL\"></td></tr>                 \n");
              out.write("                </table>\n");
              out.write("                        </form>\n");
              out.write("        </body>\n");
              out.write("            </html>\n");
              out.write("    ");
              out.write("\n");
              out.write("                        ");
              int evalDoAfterBody = _jspx_th_c_when_12.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_12);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_12);
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
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
      out.write("                                </div>\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("dataSource");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost:3306/sewasepeda");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='home'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
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
        out.write("    <br>\n");
        out.write("    <p style=\"text-align:center; font-size: 20px;\">\n");
        out.write("     <li><a href=\"beranda.jsp?halaman=menu\">Sewa Sekarang</a></li>   \n");
        out.write("</p>\n");
        out.write("<br>\n");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='about'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("<p style=\"text-align:justify;\">\n");
        out.write("    <img src=\"image/icon1.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"5%\" height=\"5%\"/>\n");
        out.write("    <br>\n");
        out.write("    Garansi Ketepatan Waktu Pengiriman sepeda\n");
        out.write("</p>\n");
        out.write("<br>\n");
        out.write("<p style=\"text-align:justify;\">\n");
        out.write("    <img src=\"image/icon2.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"5%\" height=\"5%\"/>\n");
        out.write("    <br>\n");
        out.write("    Garansi Kualitas Sepeda\n");
        out.write("</p>\n");
        out.write("<br>\n");
        out.write("<p style=\"text-align:justify;\">\n");
        out.write("    <img src=\"image/icon3.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"5%\" height=\"5%\"/>\n");
        out.write("    <br>\n");
        out.write("    Gratis Video Dokumentasi Darat dan Udara\n");
        out.write("</p>\n");
        out.write("<br>\n");
        out.write("<p style=\"text-align:justify;\">\n");
        out.write("    <img src=\"image/icon4.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"5%\" height=\"5%\"/>\n");
        out.write("    <br>\n");
        out.write("    Sistem Order Online yang Memudahkan Pelanggan\n");
        out.write("</p>\n");
        out.write("<br>\n");
        out.write("<p style=\"text-align:justify;\">\n");
        out.write("    <img src=\"image/icon5.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"5%\" height=\"5%\"/>\n");
        out.write("    <br>\n");
        out.write("    Diskon Sewa Sepeda Hingga 70% \n");
        out.write("    (Berkesempatan menjadi Member)\n");
        out.write("</p>\n");
        out.write("<br>\n");
        out.write("\n");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='kontak'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("<p style=\"text-align:justify;\">\n");
        out.write("    <img src=\"image/contactus1.png\" style=\"float:left; margin:10px 10px 5px 10px;\" width=\"90%\" height=\"5%\"/>\n");
        out.write("   <br>\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <br> \n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("<p style=\"text-align:justify;\">\n");
        out.write("    <img src=\"image/cu1.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"5%\" height=\"5%\"/>\n");
        out.write("    <br/>\n");
        out.write("    021 - 5445 0234\n");
        out.write("</p>\n");
        out.write("<br/>\n");
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
        out.write("\n");
        out.write("                        ");
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

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='menu'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("<div style=\"padding: 5px;\">\n");
        out.write("                <div>\n");
        out.write("                    <div class=\"produk-judul\">Paket Sewa Sepeda</div>\n");
        out.write("                </div>\n");
        out.write("                <div class=\"clear\"></div>\n");
        out.write("                <div>\n");
        out.write("                    <a href=\"beranda.jsp?halaman=ps1\" class=\"produk\">\n");
        out.write("                        <img class=\"produk-img\" src=\"image/sewa2.png\"/><br/>Paket sewa 25 Unit Sepeda<br/>\n");
        out.write("                        Rp.4.500.000/hari\n");
        out.write("                    </a>\n");
        out.write("                    <a href=\"beranda.jsp?halaman=ps2\" class=\"produk\">\n");
        out.write("                        <img class=\"produk-img\" src=\"image/sewa1.png\"/><br/>Paket sewa 50 Unit Sepeda<br/>\n");
        out.write("                        Rp.9.500.000/hari\n");
        out.write("                    </a>\n");
        out.write("                    <a href=\"beranda.jsp?halaman=ps3\" class=\"produk\">\n");
        out.write("                        <img class=\"produk-img\" src=\"image/sewa3.png\"/><br/>Paket sewa 1 Unit Sepeda<br/>\n");
        out.write("                        Rp. 200.000/hari\n");
        out.write("                        <br/>\n");
        out.write("                    </a>\n");
        out.write("                </div>\n");
        out.write("                <div class=\"clear\"></div>\n");
        out.write("            </div>\n");
        out.write("            \n");
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
        out.write("            \n");
        out.write("</body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='ps1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("<p style=\"text-align:justify;\">\n");
        out.write("   <img src=\"image/sewa2.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"50%\" height=\"50%\"/>\n");
        out.write("    <br>\n");
        out.write("   \n");
        out.write("    <p style=\"text-align:center; font-size: 20px;\">\n");
        out.write("    Paket sewa 25 Unit Sepeda\n");
        out.write("    <br>\n");
        out.write("    Rp.4.500.000/hari\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <p style=\"text-align:left; font-size: 15px;\">\n");
        out.write("    Paket Sewa 100 Unit Sepeda, Sudah Termasuk :\n");
        out.write("    <br>\n");
        out.write("    1. Sewa Sepeda Standart 25 unit\n");
        out.write("    <br>\n");
        out.write("    2. Sewa Helm Sepeda 25 unit\n");
        out.write("    <br>\n");
        out.write("    3. Biaya Ongkos Kirim Lokasi Jakarta ( 1 Unit Truk )\n");
        out.write("    <br>\n");
        out.write("    4. Jasa Dokumentasi Menggunakan Drone\n");
        out.write("    <br>\n");
        out.write("    5. Video Dokumentasi Sudah di Edit dan Siap Posting ( Durasi 2-3 Menit )\n");
        out.write("\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <p style=\"text-align:center; font-size: 20px;\">\n");
        out.write("    <tr>\n");
        out.write("    <td colspan=\"3\"><button class=\"btn\"><a href=\"beranda.jsp?halaman=pesan\">add to Order Now</a></button>\n");
        out.write("    </tr>\n");
        out.write("    <p style=\"text-align:center; font-size: 20px;\">\n");
        out.write("    <tr>\n");
        out.write("        <td colspan=\"3\"><a href=\"beranda.jsp?halaman=menu\">Kembali ke Menu</a></td>\n");
        out.write("    </tr>");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
    return false;
  }

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='ps2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("<p style=\"text-align:justify;\">\n");
        out.write("   <img src=\"image/sewa1.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"50%\" height=\"80%\"/>\n");
        out.write("    <br>\n");
        out.write("    <p style=\"text-align:center; font-size: 20px;\">\n");
        out.write("    Paket sewa 50 Unit Sepeda\n");
        out.write("    <br>\n");
        out.write("    Rp.9.500.000/hari\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <p style=\"text-align:left; font-size: 15px;\">\n");
        out.write("    Paket Sewa 50 Unit Sepeda, Sudah Termasuk :\n");
        out.write("    <br>\n");
        out.write("    1. Sewa Sepeda Standart 50 unit\n");
        out.write("    <br>\n");
        out.write("    2. Sewa Helm Sepeda 50 unit\n");
        out.write("    <br>\n");
        out.write("    3. Biaya Ongkos Kirim Lokasi Jakarta ( 2 Unit Truk )\n");
        out.write("    <br>\n");
        out.write("    4. Jasa Dokumentasi Menggunakan Drone\n");
        out.write("    <br>\n");
        out.write("    5. Video Dokumentasi Sudah di Edit dan Siap Posting ( Durasi 2-3 Menit )\n");
        out.write("\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <p style=\"text-align:center; font-size: 20px;\">\n");
        out.write("    <tr>\n");
        out.write("    <td colspan=\"3\"><button class=\"btn\"><a href=\"beranda.jsp?halaman=pesan\">add to Order Now</a></button>\n");
        out.write("    </tr>\n");
        out.write("    <p style=\"text-align:center; font-size: 20px;\">\n");
        out.write("    <tr>\n");
        out.write("        <td colspan=\"3\"><a href=\"beranda.jsp?halaman=menu\">Kembali ke Menu</a></td>\n");
        out.write("    </tr>\n");
        out.write("    \n");
        out.write("     \n");
        out.write("           ");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
    return false;
  }

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='ps3'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("<p style=\"text-align:justify;\">\n");
        out.write("   <img src=\"image/sewa3.png\" style=\"float:left; margin:10px 20px 5px 10px;\" width=\"50%\" height=\"50%\"/>\n");
        out.write("    <br>\n");
        out.write("   \n");
        out.write("    <p style=\"text-align:center; font-size: 20px;\">\n");
        out.write("    Paket sewa 1 Unit Sepeda\n");
        out.write("    <br>\n");
        out.write("    Rp.200.000/hari\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <p style=\"text-align:left; font-size: 15px;\">\n");
        out.write("    Paket Sewa 1 Unit Sepeda, Sudah Termasuk :\n");
        out.write("    <br>\n");
        out.write("    1. Sewa Sepeda Standart 1 unit\n");
        out.write("    <br>\n");
        out.write("    2. Sewa Helm Sepeda 1 unit\n");
        out.write("    <br>\n");
        out.write("    3. Biaya Ongkos Kirim Lokasi Jakarta\n");
        out.write("    <br>\n");
        out.write("    4. Jasa Dokumentasi Menggunakan Drone\n");
        out.write("    <br>\n");
        out.write("    5. Video Dokumentasi Sudah di Edit dan Siap Posting ( Durasi 2-3 Menit )\n");
        out.write("\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <p style=\"text-align:center; font-size: 20px;\">\n");
        out.write("    <tr>\n");
        out.write("    <td colspan=\"3\"><button class=\"btn\"><a href=\"beranda.jsp?halaman=pesan\">add to Order Now</a></button>\n");
        out.write("    </tr>\n");
        out.write("    <p style=\"text-align:center; font-size: 20px;\">\n");
        out.write("    <tr>\n");
        out.write("        <td colspan=\"3\"><a href=\"beranda.jsp?halaman=menu\">Kembali ke Menu</a></td>\n");
        out.write("    </tr>\n");
        out.write("            ");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
    return false;
  }

  private boolean _jspx_meth_c_when_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_7.setPageContext(_jspx_page_context);
    _jspx_th_c_when_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='tampilbrg'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
    if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("\n");
        out.write("\n");
        out.write("<h1>Data Master Barang</h1>\n");
        out.write("<table border=\"0\">\n");
        out.write("    <form action=\"BarangServlet\" method=\"post\" onsubmit=\"return validasi_inputBarang(this)\">\n");
        out.write("        <input type=\"hidden\" name=\"aksi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.aksi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("        <tr>\n");
        out.write("            <td>Kode Barang</td> <td>: <input type=\"text\" name=\"kode\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.kd_brg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Nama Barang</td> <td>: <input type=\"text\" name=\"nama\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.nm_brg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("         <tr>\n");
        out.write("            <td>Harga Barang</td> <td>: <input type=\"text\" name=\"harga\" onkeypress=\"return hanyaAngka(event)\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.harga}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("         <tr>\n");
        out.write("            <td>Stok Barang</td> <td>: <input type=\"text\" name=\"stok\" onkeypress=\"return hanyaAngka(event)\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.stok}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td><input type=\"submit\" value=\"Simpan\" class=\"button\"/></td> <td></td>\n");
        out.write("        </tr>\n");
        out.write("    </form>\n");
        out.write("        </td></tr></table><br>\n");
        out.write("    <form action=\"\" method=\"post\">\n");
        out.write("        Cari Data Barang : <input type=\"text\" name=\"cari\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("        <input type=\"submit\" value=\"Cari\" class=\"button\"/> <br>\n");
        out.write("    </form>\n");
        out.write("    ");
        if (_jspx_meth_sql_query_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    <br><table border=\"1\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
        out.write("        <tr class=\"head\">\n");
        out.write("            <td>Kode Barang</td><td>Nama Barang</td><td>Harga Barang</td><td>Stok Barang</td><td>Action</td>\n");
        out.write("        </tr>\n");
        out.write("        ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    </table>\n");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_7);
    _jspx_th_sql_query_0.setVar("querycustomer");
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("        SELECT * from barang where kd_brg like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' or\n");
          out.write("        nm_brg like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%'\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_7);
    _jspx_th_c_forEach_0.setVar("rowbrg");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${querycustomer.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <tr class=\"isi\">\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'><a href='BarangServlet?aksi=HAPUS&kode=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Hapus</a> | <a href='beranda.jsp?halaman=tampilbrg&aksi=GANTI&kd_brg=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&nm_brg=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&harga=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&stok=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Edit </a>\n");
          out.write("                </td>    \n");
          out.write("            </tr>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_8.setPageContext(_jspx_page_context);
    _jspx_th_c_when_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='tampilcus'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_8 = _jspx_th_c_when_8.doStartTag();
    if (_jspx_eval_c_when_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("\n");
        out.write("\n");
        out.write("<h1>Data Master Customer</h1>\n");
        out.write("<table border=\"0\">\n");
        out.write("    <form action=\"CusServlet\" method=\"post\" onsubmit=\"return validasi_inputCustomer(this)\">\n");
        out.write("       <input type=\"hidden\" name=\"aksi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.aksi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("       <tr>\n");
        out.write("           <td>Kode Customer</td> <td>: <input type=\"text\" name=\"kodecust\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.kd_cust}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("       </tr>\n");
        out.write("       <tr>\n");
        out.write("           <td>Nama Customer</td> <td>: <input type=\"text\" name=\"namacust\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.nm_cust}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("       </tr>\n");
        out.write("       <tr>\n");
        out.write("           <td>Alamat Customer</td> <td>: <input type=\"text\" name=\"alamat\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.alamat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("       </tr>\n");
        out.write("       <tr>\n");
        out.write("           <td>Telepon Customer</td> <td>: <input type=\"text\" name=\"tlp\" onkeypress=\"return hanyaAngka(event)\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.telpon}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("       </tr>\n");
        out.write("       <tr>\n");
        out.write("           <td><input type=\"submit\" value=\"Simpan\" class=\"button\"/></td> <td></td>\n");
        out.write("       </tr>\n");
        out.write("    </form>\n");
        out.write("       <td></tr></table><br>\n");
        out.write("    <form action=\"\" method=\"post\">\n");
        out.write("        Cari Data Customer : <input type=\"text\" name=\"cari\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("        <input type=\"submit\" value=\"Cari\" class=\"button\"/> <br>\n");
        out.write("    </form>\n");
        out.write("    ");
        if (_jspx_meth_sql_query_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    <br><table border=\"1\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
        out.write("        <tr class=\"head\">\n");
        out.write("            <td>Kode Customer</td><td>Nama Customer</td><td>Alamat Customer</td><td>Telepon</td><td>Action</td>\n");
        out.write("        </tr>\n");
        out.write("    ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write(" </table>\n");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
    return false;
  }

  private boolean _jspx_meth_sql_query_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_8);
    _jspx_th_sql_query_1.setVar("querycustomer");
    _jspx_th_sql_query_1.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_1 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_1 = _jspx_th_sql_query_1.doStartTag();
      if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_1[0]++;
          _jspx_th_sql_query_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("        SELECT * from customer where kd_cust like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' or nm_cust like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%'\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_sql_query_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_1[0]--;
      }
      if (_jspx_th_sql_query_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_1.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_8);
    _jspx_th_c_forEach_1.setVar("rowcust");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${querycustomer.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <tr class=\"isi\">\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcust[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcust[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcust[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcust[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'><a href='CusServlet?aksi=HAPUS&kodecust=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcust[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Hapus</a> | <a href='beranda.jsp?halaman=tampilcus&aksi=GANTI&kd_cust=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcust[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&nm_cust=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcust[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&alamat=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcust[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&telpon=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcust[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Edit </a>\n");
          out.write("            </td>\n");
          out.write("        </tr>\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_9 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_9.setPageContext(_jspx_page_context);
    _jspx_th_c_when_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='tampilakun'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_9 = _jspx_th_c_when_9.doStartTag();
    if (_jspx_eval_c_when_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("\n");
        out.write("\n");
        out.write("<h1>Data Master Akun</h1>\n");
        out.write("<table border=\"0\">\n");
        out.write("    <form action=\"AkunServlet\" method=\"post\" onsubmit=\"return validasi_inputAkun(this)\">\n");
        out.write("        <input type=\"hidden\" name=\"aksi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.aksi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("        <tr>\n");
        out.write("            <td>Nomor Akun</td> <td>: <input type=\"text\" name=\"noakun\" onkeypress=\"return hanyaAngka(event)\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.no_akun}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("         <tr>\n");
        out.write("            <td>Nama Akun</td> <td>: <input type=\"text\" name=\"nmakun\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.nm_akun}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td><input type=\"submit\" value=\"Simpan\" class=\"button\"/></td> <td></td>\n");
        out.write("        </tr>\n");
        out.write("    </form>\n");
        out.write("    </td></tr></table><br>\n");
        out.write("    <form action=\"\" method=\"post\">\n");
        out.write("        Cari Data Akun : <input type=\"text\" name=\"cari\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("        <input type=\"submit\" value=\"Cari\" class=\"button\"/><br>\n");
        out.write("    </form>\n");
        out.write("        ");
        if (_jspx_meth_sql_query_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        <br><table border=\"1\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
        out.write("            <tr class=\"head\">\n");
        out.write("                <td>Nomor Akun</td><td>Nama Akun</td><td>Action</td>\n");
        out.write("            </tr>\n");
        out.write("            ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        </table>\n");
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
    return false;
  }

  private boolean _jspx_meth_sql_query_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_2 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_9);
    _jspx_th_sql_query_2.setVar("queryakun");
    _jspx_th_sql_query_2.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_2 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_2 = _jspx_th_sql_query_2.doStartTag();
      if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_2[0]++;
          _jspx_th_sql_query_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_2.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT*from akun where no_akun like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' or nm_akun like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%'\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_2[0]--;
      }
      if (_jspx_th_sql_query_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_2.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_9);
    _jspx_th_c_forEach_2.setVar("rowakun");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${queryakun.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <tr class=\"isi\">\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowakun[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowakun[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'><a href='AkunServlet?aksi=HAPUS&noakun=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowakun[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Hapus </a> | <a href='beranda.jsp?halaman=tampilakun&aksi=GANTI&no_akun=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowakun[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&nm_akun=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowakun[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Edit </a>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_10 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_10.setPageContext(_jspx_page_context);
    _jspx_th_c_when_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='tampiluser'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_10 = _jspx_th_c_when_10.doStartTag();
    if (_jspx_eval_c_when_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("\n");
        out.write("\n");
        out.write("<h1>Data Master User</h1>\n");
        out.write("<table border=\"0\">\n");
        out.write("    <form action=\"UserServlet\" method=\"post\" onsubmit=\"return validasi_inputUser(this)\">\n");
        out.write("        <input type=\"hidden\" name=\"aksi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.aksi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("        <tr>\n");
        out.write("            <td>Id User</td> <td>: <input type=\"text\" name=\"iduser\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.id_user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Nama User</td> <td>: <input type=\"text\" name=\"nmuser\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.nm_user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\n");
        out.write("        </tr>\n");
        out.write("         <tr>\n");
        out.write("            <td>Hak Akses</td> <td>: <input type=\"text\" name=\"hakakses\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hak_akses}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\n");
        out.write("        </tr>\n");
        out.write("         <tr>\n");
        out.write("            <td>Password</td> <td>: <input type=\"text\" name=\"password\" onkeypress=\"return hanyaAngka(event)\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td><input type=\"submit\" value=\"Simpan\" class=\"button\"/></td> <td></td>\n");
        out.write("        </tr>\n");
        out.write("    </form>\n");
        out.write("        </td></tr></table><br>\n");
        out.write("    <form action=\"\" method=\"post\">\n");
        out.write("        Cari Data User : <input type=\"text\" name=\"cari\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("        <input type=\"submit\" value=\"Cari\" class=\"button\"/> <br>\n");
        out.write("    </form>\n");
        out.write("    ");
        if (_jspx_meth_sql_query_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    <br><table border=\"1\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
        out.write("        <tr class=\"head\">\n");
        out.write("            <td>Id User</td><td>Nama User</td><td>Hak Akses</td><td>Password</td><td>Action</td>\n");
        out.write("        </tr>\n");
        out.write("        ");
        if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    </table>\n");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
    return false;
  }

  private boolean _jspx_meth_sql_query_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_3 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_10);
    _jspx_th_sql_query_3.setVar("queryuser");
    _jspx_th_sql_query_3.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_3 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_3 = _jspx_th_sql_query_3.doStartTag();
      if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_3[0]++;
          _jspx_th_sql_query_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_3.doInitBody();
        }
        do {
          out.write("\n");
          out.write("        SELECT * from user where id_user like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' or nm_user like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%'\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_sql_query_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_3[0]--;
      }
      if (_jspx_th_sql_query_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_3.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_10);
    _jspx_th_c_forEach_3.setVar("rowuser");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${queryuser.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <tr class=\"isi\">\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'><a href='UserServlet?aksi=HAPUS&iduser=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Hapus </a> | <a href='beranda.jsp?halaman=tampiluser&aksi=GANTI&id_user=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&nm_user=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&hak_akses=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&pass=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Edit </a>\n");
          out.write("                </td>    \n");
          out.write("            </tr>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_sql_query_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_4 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_4.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_11);
    _jspx_th_sql_query_4.setVar("ttl");
    _jspx_th_sql_query_4.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_4 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_4 = _jspx_th_sql_query_4.doStartTag();
      if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_4[0]++;
          _jspx_th_sql_query_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_4.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT SUM(quantity) AS ttl_D, SUM(subtotal) AS ttl_K FROM sementara_pesan\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_4[0]--;
      }
      if (_jspx_th_sql_query_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_4.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_11);
    _jspx_th_c_forEach_4.setVar("ttlDK");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttl.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<br>\n");
          out.write("                    <table border=\"0\">\n");
          out.write("                        <tr><td>Total Jumlah Barang Dipesan</td> <td>: <input type=\"text\" readonly=\"readonly\" name=\"totjum\" size=\"1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td></tr>\n");
          out.write("                        <tr><td>Total Bayar</td> <td>: <input type=\"text\" readonly=\"readonly\" name=\"tobay\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td></tr>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_sql_query_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_5 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_5.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_12);
    _jspx_th_sql_query_5.setVar("ttl");
    _jspx_th_sql_query_5.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_5 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_5 = _jspx_th_sql_query_5.doStartTag();
      if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_5[0]++;
          _jspx_th_sql_query_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_5.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT SUM(quantity) AS ttl_D, SUM(subtotal) AS ttl_K FROM sementara_retur\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_5[0]--;
      }
      if (_jspx_th_sql_query_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_5.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_12);
    _jspx_th_c_forEach_5.setVar("ttlDK");
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttl.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<br>\n");
          out.write("                    <table border=\"0\">\n");
          out.write("                        <tr><td>Total Jumlah Barang DiRetur</td> <td>: <input type=\"text\" readonly=\"readonly\" name=\"totjum\" size=\"1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td></tr>\n");
          out.write("                        <tr><td>Total Bayar</td> <td>: <input type=\"text\" readonly=\"readonly\" name=\"tobay\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td></tr>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
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
        out.write("    <br>\n");
        out.write("    <p style=\"text-align:center; font-size: 20px;\">\n");
        out.write("     <li><a href=\"beranda.jsp?halaman=menu\">Sewa Sekarang</a></li>   \n");
        out.write("</p>\n");
        out.write("<br>\n");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
