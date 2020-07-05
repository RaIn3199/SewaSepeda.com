<%@page import="control.koneksi"%>
<%@page import="java.sql.*"%>
<%
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
    %>
    <html>
        <head>
            <title>Ubah Data Member</title>
        </head>
        <body>
            <form method="POST" action="sewaServlet">
                <center>
                    <table border="2">
                        <tr>
                            <td colspan="3"><center><font size="5"><b>Ubah Data Member Sewa</b></font><center></td>
                        </tr>
                        <tr>
                            <td>KODE MEMBER</td>
                            <td>:</td>
                            <td><input type="text" value="<%=kodekm%>" readonly>
                                <input type="hidden" name="kodekm" value="<%=kodekm%>"/>
                            </td>
                        </tr>
                        <tr>
                            <td>NAMA MEMBER</td>
                            <td>:</td>
                            <td><input type="text" name="nama" value="<%=nama%>"></td>
                        </tr>
                        <tr>
                            <td>JENIS KELAMIN</td>
                            <td>:</td>
                            <td>
                                <%
                                    if (jenis_kelamin.equalsIgnoreCase("Laki-laki")) {%>
                                    <input type="radio" name="jk" value="Laki-laki" checked="checked"> Laki-laki
                                    <input type="radio" name="jk" value="Perempuan">Perempuan
                                    <%} else { %>
                                    <input type="radio" name="jk" value="Perempuan"> Laki-laki
                                    <input type="radio" name="jk" value="Perempuan" checked="checked">Perempuan
                                    <% } %>
                            </td>
                        </tr>
                        <tr>
                            <td>ALAMAT</td>
                            <td>:</td>
                            <td><textarea name="alamat" rows="5"><%=alamat%>"></textarea></td>
                        </tr>
                        <tr>
                            <td colspan="3">
                        <center>
                            <input type="submit" name="aksi" value="Update">
                            <a href="member_sewa.jsp?hal=tampil-sewa">[Lihat Data]</a>
                        </center>
                        </td>
                        </tr>
                    </table>
                                    </center>
            </form>
        </body>
    </html>