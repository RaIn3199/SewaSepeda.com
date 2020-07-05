<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<sql:setDataSource var="dataSource"
                   driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/sewasepeda"
                   user="root"password=""/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SewaSepeda.com</title>
        <link href="config/stylespd.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="config/setting.js"></script>
        <link href="config/cssTable.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div id="wrap"> 
            <div id="header"><%-- awal header --%>
                <img src="image/spd.png">
                <h1><a>SewaSepeda.com</a></h1>
                <h2>Penyewaan Sepeda Terbesar,Terlengkap dan Termurah</h2>
            </div><%-- akhir dari header --%>
            <div id="menu"><%-- awal dari menu atas --%>
                <ul>
                    <li><a href="beranda.jsp?halaman=home">Home</a></li>
                    <li><a href="beranda.jsp?halaman=about">About</a></li>
                    <li><a href="beranda.jsp?halaman=kontak">Contact Us</a></li>
                    <li><a href="beranda.jsp?halaman=menu">Menu Sewa</a></li>
                    <li><a href="beranda.jsp?halaman=logout">Logout</a></li>
                </ul>
            </div><%-- akhir dari menu atas --%>
            <div id="content"><%-- awal dari isi content --%>
                <div class="left"> <%-- awal dari content sebelah kiri web --%>
                    
                    <h2> Transaksi</h2>
                    <ul>
                        <li><a href="beranda.jsp?halaman=pesan"> Transaksi Pemesanan</a></li>
                        <li><a href="beranda.jsp?halaman=sewa">Transaksi Penyewaan</a></li>
                        <li><a href="beranda.jsp?halaman=retursewa">Retur Penyewaan</a></li>
                    </ul>
                    
                    <div class="box" align="justify">
                    <div class="subtitle">Date and Time</div>
                    <marquee direction="left"> <%=new java.util.Date()%>
                    </marquee>
                    <br />
                </div>
                <div class="box" align="justify">
                    <div class="subtitle">About this website</div>
                    <marquee behavior="scroll" direction="up" scrollamount="5">
                        SISTEM INFORMASI AKUNTANSI UNIVERSITAS BSI APLIKASI SEWA SEPEDA
                    </marquee>
                </div>
                <div class="box">
                    <div class="subtitle">About this website</div>
                    <marquee behavior="scroll" direction="up" scrollamount="5">
                            MEMBER OF SEWASEPEDA.COM :
                            <br>
                            * RAHMA INDRIANI
                            <br>
                            * SITI FATIMAH
                            <br>
                            * CHAIRUL FIKRI AZIS
                            <br>
                            * PUTRI NURWULAN SARI
                            <br>
                            * FIKRI AULIAN HAIKAL
                            <br>
                            </marquee>
                </div>
                </div><%-- akhir dari content sebelah kiri web --%>
                
                <div class="right"><%-- awal dari content sebelah kanan web --%>
                    <table width="100%">
                        <tr>
                            <td valign="top" width="110%">
                                <div class="text_area" align="justify">
                                <%-- isi dari content sebelah kanan --%>
                                        <c:choose>
                        <c:when test="${param.halaman=='home'}">
                            <%@include file="homespd.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='about'}">
                            <%@include file="aboutspd.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='kontak'}">
                            <%@include file="kontakus.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='menu'}">
                            <%@include file="menuspd.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='ps1'}">
                            <%@include file="paketsewa1.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='ps2'}">
                            <%@include file="paketsewa2.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='ps3'}">
                            <%@include file="paketsewa3.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='pesan'}">
                            <%@include file="pemesanan.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='retursewa'}">
                            <%@include file="retur.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='sewa'}">
                            <%@include file="penyewaan.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='logout'}">
                            <%@include file="indexspd.jsp" %>
                        </c:when>
                        <c:otherwise>
                            <%@include file="homespd.jsp" %>
                        </c:otherwise>
                        </c:choose>
                                </div>
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
        </div><%--akhir dari halaman web --%>
    
</html>