<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Sepeda Bersama</title>
        <link rel="stylesheet" type="text/css" href="config/stylespd.css" media="screen" />
    </head>
    <body>
        <div id="wrap">
            <div id="header"><%-- awal header --%>
                <img src="image/spd.png">
                <h1><a>Sepeda Bersama</a></h1>
                <h2>Penyewaan Sepeda Terbesar,Terlengkap dan Termurah</h2>
            </div><%-- akhir dari header --%>
           
            <div id="menu"><%-- awal dari menu atas --%>
                <ul>
                    <li><a href="indexspd.jsp">Home</a></li>
                    <li><a href="about.jsp">About</a></li>
                    <li><a href="kontakspd.jsp">Contact Us</a></li>
                    <li><a href="menuspd.jsp">Menu Sewa</a></li>
                </ul>
            </div><%-- akhir dari menu atas --%>
            <div id="content"><%-- awal dari isi content --%>
                <div class="left"> <%-- awal dari content sebelah kiri web --%>
                    <h2>Produk & Layanan</h2>
                <ul>
                    <%-- modif href pasca atur aksi --%>
                    <%-- perubahan agar aksi simpan dapat bekerja --%>
                    <li><a href="#">Rental Sepeda</a></li>
                    <li><a href="#">Member Rental</a></li>
                </ul>
                    <h2> Transaksi</h2>
                    <ul>
                        <li><a href="#">Payment</a></li>
                    </ul>
                    
                    <h2>Laporan</h2>
                    <ul>
                        <li><a href="#">Laporan Member Rental</a></li>
                        <li><a href="#">laporan Payment</a></li>
                    </ul>
                </div><%-- akhir dari content sebelah kiri web --%>
                
                <div class="right"><%-- awal dari content sebelah kanan web --%>
                    <table width="100%">
                        <tr>
                            <td valign="top" width="110%">
                                <%-- isi dari content sebelah kanan --%>
                                        <%@include file="aboutspd.jsp" %>
                            </td>
                        </tr>
                    </table>
                </div>
             </div>               
                    <div class="footer"><%-- awal dari content footer web --%>
                        Support by <a href="http://bsi.ac.id/">Junior Programmer
                            Mahasiswa Program Studi Sistem Informasi Akuntansi</a>,<br>
                        Thanks to Layout menu utama menggunakan CSS
                    </div><%-- akhir dari content footer web --%>
                <div style="clear: both;"> </div>
            </div>
        </div><%--akhir dari halaman web --%>
    </body>
</html>
