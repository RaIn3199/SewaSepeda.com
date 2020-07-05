/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.sewasepeda;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sewaServlet extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException{
        response.setContentType("text/html;charset=UTF-8");
        
        sewasepeda sewa = new sewasepeda();
        koneksi kon = new koneksi ();
        PreparedStatement pstmt= null;
        int result = 0;
        try (PrintWriter out = response.getWriter())
        {
            String aksi = request.getParameter("aksi");
            if (aksi != null)
            {
                sewa.setKodekm(request.getParameter("kodekm"));
                sewa.setNama(request.getParameter("nama"));
                sewa.setJk(request.getParameter("jk"));
                sewa.setAlamat(request.getParameter("alamat"));
                switch (aksi)
                {
                    case "simpan":
                        pstmt=kon.conn.prepareStatement("INSERT INTO sewaspd values ('"+sewa.getKodekm()+"','"
                        +sewa.getNama()+"','"
                        +sewa.getJk()+"','"
                        +sewa.getAlamat()+"','");
                        
                        result = pstmt.executeUpdate();
                        if (result>0){
                            out.println("<script>"
                            + "alert ('Data telah ditambahkan');"
                            + "document.location='member_sewa.jsp?hal=tampil-sewa';"
                            + "</script>");
                        }
                        break;
                    case "Delete":
                        pstmt=kon.conn.prepareStatement("DELETE FROM sewaspd WHERE kodekm= '"+sewa.getKodekm()+"'");
                        result = pstmt.executeUpdate();
                        if (result > 0){
                            out.println("<script>"
                            + "alert ('Data telah dihapus');"
                            + "document.location='member_sewa.jsp?hal=tampil-sewa';"
                            + "</script>");
                        }
                        break;
                        case "Update":
                        pstmt=kon.conn.prepareStatement("UPDATE sewaspd SET nama='"
                        +sewa.getNama()+"',jenis_kelamin='"
                        +sewa.getJk()+"',alamat='"
                        +sewa.getAlamat()+"'where kodekm='"
                        +sewa.getKodekm()+"'");
                        
                        result = pstmt.executeUpdate();
                        if (result > 0){
                            out.println("<script>"
                            + "alert ('Data telah diubah');"
                            + "document.location='member_sewa.jsp?hal=tampil-sewa';"
                            + "</script>");
                        }
                        default:
                            break;
                }
                
            }
            else
            {
                out.println("<script>"
                            + "alert ('Gagal Eksekusi');"
                            + "document.location='input_sewa.jsp';"
                            + "</script>");
            }
        }
}

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    try {
        processRequest(request, response);
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(sewaServlet.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request memberServlet request
     * @param response memberServlet response
     * @throws ServletException if a memberServlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    try {
        processRequest(request, response);
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(sewaServlet.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    /**
     * Returns a short description of the memberServlet.
     *
     * @return a String containing memberServlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
