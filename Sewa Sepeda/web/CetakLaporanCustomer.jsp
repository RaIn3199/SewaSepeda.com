<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cetak Laporan Customer</title>
    </head>
    <body>
        <h2>Cetak Laporan Customer Berdasarkan Alamat</h2>
        <form action="TampilLapCustomer.jsp" method="get">
            Alamat <input type="text" name="alamat" value="0">
            <input type="submit" name="submit" value="Cetak Laporan"/>
        </form>
    </body>
</html>
