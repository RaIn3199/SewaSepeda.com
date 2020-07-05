<sql:query var="qryadmin" dataSource="${dataSource}">
    SELECT * FROM admin
    WHERE user_name like '%${param.cari}%'
    OR nama_lengkap like '%${param.cari}%'
</sql:query>

<font color="black"> <h2> .: [Data User/Admin] :. </h2></font>
<br>
<a href="user.jsp?halaman=admin&aksi=SIMPAN"> Tambah User Baru </a>
<form action="" method="post">
    Cari Data User : <input type="text" name="cari" value="${param.cari}"/>
    <input type="submit" value=" Cari " class="button"/> <br>
</form>

<table border="0" width="90%" cellpadding="0" cellspacing="0">
    <tr class="head">
        <td>User Name</td>
        <td>Nama Lengkap</td>
        <td>Password</td>
        <td>Hak Akses</td>
        <td>Action</td>
    </tr>
    <c:forEach var="rowadmin" items="${qryadmin.rowsByIndex}">
        <tr class="isi">
            <td align='center'>${rowadmin[0]}</td>
            <td>${rowadmin[1]}</td>
            <td align='center'>${rowadmin[2]}</td>
            <td align='center'>${rowadmin[3]}</td>
            <td align='center'>
                <a href='aksi_admin?aksi=HAPUS&user_name=${rowadmin[0]}'> Hapus</a> |
                <a href='user.jsp?halaman=admin&aksi=GANTI&user_name=${rowadmin[0]}
                   &nama_lengkap=${rowadmin[1]}
                   &password=${rowadmin[2]}
                   &hak_akses=${rowadmin[3]}'> Edit </a>
            </td>
        </tr>
    </c:forEach>

</table>