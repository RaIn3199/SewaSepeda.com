<%@page import="control.koneksi"%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data Member</title>
    </head>
    <body>
        <table width="667" height="150" border="2" align="center">
            <tr align="center">
                <td colspan="5"><h3>DATA MEMBER SEWA SEPEDA</h3></td>
            </tr>
            <tr>
                <th>KODE MEMBER</th>
                <th>NAMA MEMBER</th>
                <th>JENIS KELAMIN</th>
                <th>ALAMAT</th>
                <th>AKSI</th>
            </tr>
            <%//--koneksi database--
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
            %>
            <tr>
                <td><% out.println(kodekm);%></td>
                <td><% out.println(nama);%></td>
                <td><% out.println(jenis_kelamin);%></td>
                <td><% out.println(alamat);%></td>
                <td><a href="edit_sewa.jsp?kodekm=<% out.print(kodekm);%>">EDIT</a>
                || <td><a href="sewaServlet?aksi=Delete&kodekm=<% out.print(kodekm);%>">HAPUS</a>
                
            </tr>
            <%}%>
            <tr>
                <td colspan="6" align="center"><h3><a href="member_sewa.jsp?hal=input-sewa">Tambah Data</a></h3></td>
                
            </tr>
        </table>
            <%kon.close();%>
    </body>
</html>
