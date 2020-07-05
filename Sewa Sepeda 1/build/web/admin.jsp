<sql:query var="qryadmin" dataSource="${dataSource}">
    SELECT *FROM admin WHERE user_name
    LIKE '%${param.cari}%'
    OR nama_lengkap
    LIKE '%${param.cari}%'
</sql:query>

<font color="black"> <h2> .: [Form User/Admin] :. </h2> </font>
<form action="aksi_admin" method="post">
    <table border="0">
        <%-- modif value --%>
        <input type="hidden" name="aksi" value="${param.aksi}"/>
        <tr>
            <td>User Name</td>
            <td>:</td>
            <td><input type="text" name="user_name" value="${param.user_name}"/></td>
        </tr>
        <tr>
            <td>Nama Lengkap</td>
            <td>:</td>
            <td><input type="text" name="nama_lengkap" value="${param.nama_lengkap}"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td>:</td>
            <td><input type="text" name="password" value="${param.password}"/></td>
        </tr>
        <tr>
            <td>Hak Akses</td>
            <td>:</td>
            <td><input type="text" name="hak_akses" value="${param.hak_akses}"/></td>
        </tr> 
            
        <tr>
            <td><input type="submit" value="Simpan" class="button"/></td><td></td>
        </tr>
    </table>
</form>

<br>
<form action="" method="post">
    Cari Data User : <input type="text" name="cari" value="${param.cari}"/>
    <input type="submit" value="Cari" class="button"/> </br>
</form>
<table border="0" width="70%" cellpadding="0" cellspacing="0">
    <tr class="head">
        <td>User Name</td>
        <td>Nama Lengkap</td>
        <td>Password</td>
        <td>Hak Akses</td>
    </tr>
    <c:forEach var="rowadmin" items="${qryadmin.rowsByIndex}">
        <tr class="isi">
            <td valign='top'>${rowadmin[0]}</td>
            <td valign='top'>${rowadmin[1]}</td>
            <td valign='top' align="center">${rowadmin[2]}</td>
            <td valign='top' align="center">${rowadmin[3]}</td>
        </tr>
    </c:forEach>

</table>
        
        