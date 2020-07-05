<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Input Data Member</title>
</head>
<body>
<form method="POST" action="tampil_sewa.jsp">
<center>
<table border=2>
<tr>
<td colspan="3"><center><font size=5><b>Form Input Data
Member</b></font><center></td>
</tr>
<tr>
<td>Kode Member </td>
<td>:</td>
<td><input type=text name=kodekm></td>
</tr>
<tr>
<td>Nama Lengkap</td>
<td>:</td>
<td><input type=text name=nama></td>
</tr>
<tr>
<td>Jenis Kelamin</td>
<td>:</td>
<td><input type=radio name=jk value='Laki-laki'>Laki-laki
<input type=radio name=jk value='Perempuan'>Perempuan
</td>
</tr>
<tr>
<td>Alamat</td>
<td>:</td>
<td><textarea name=alamat rows=5></textarea></td>
</tr>
<tr>
<td colspan="3"><center>
    <input type=submit name="aksi" value=Simpan>
<input type=reset value=Batal>
<a href="member_sewa.jsp?hal=tampil-sewa">[Lihat Data]</a>
</td>
</tr>
</table>
</center>
</form>
</body>
</html>
