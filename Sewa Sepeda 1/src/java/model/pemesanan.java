package model;

public class pemesanan {
    
    private String nopesan,tglpesan,kdcust,kdbarang,total,qty,subtotal;
    
    public pemesanan(){
    }
    
    public pemesanan(String nopesan,String tglpesan, String kdcust,
            String kdbarang, String total,
            String qty, String subtotal) {
        this.nopesan = nopesan;
        this.tglpesan = tglpesan;
        this.kdcust = kdcust;
        this.kdbarang = kdbarang;
        this.total = total;
        this.qty = qty;
        this.subtotal = subtotal;       
    }
    
    
   public String getNopesan() {
        return nopesan;
    }
    
    public void setNopesan(String nopesan) {
        this.nopesan = nopesan;
    }
    
    public String getTglpesan() {
        return tglpesan;
    }
    
    public void setTglpesan(String tglpesan) {
        this.tglpesan = tglpesan;
    }
    
    public String getTotal() {
        return total;
    }
    
    public void setTotal(String total) {
        this.total = total;
    }
    
    public String getKdcust() {
        return kdcust;
    }
    
    public void setKdcust(String kdcust) {
        this.kdcust = kdcust;
    }
    
    public String getKdbarang() {
        return kdbarang;
    }
    
    public void setKdbarang(String kdbarang) {
        this.kdbarang = kdbarang;
    }
    
    public String getQty() {
        return qty;
    }
    
    public void setQty(String qty) {
        this.qty = qty;
    }
    
    public String getSubtotal() {
        return subtotal;
    }
    
    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
    
    public String selectAll() {
        String sql = "select * from pemesanan " ;
        return sql;
    }
    
    public String select() {
        String sql = "select * from pemesanan where "
                + "no_pesan='"+nopesan+"'";
        return sql;
    }
    
    public String toDelete () {
        return "DELETE FROM sementara_pesan "
                + "WHERE kode='" + kdbarang + "'";
    }
    
    public String toInsert() {
        return " INSERT INTO sementara_pesan VALUES ('"
                + nopesan + "','"
                + kdbarang + "','"
                + qty + "','"
                + subtotal + "')";
    }
}

