package model;

public class customer {
    private String kodecust,namacust,alamat,tlp;
    
    public customer(){
        
    }
    
    public customer(String kodecust, String namacust, String alamat, String tlp) {
        this.kodecust = kodecust;
        this.namacust = namacust;
        this.alamat = alamat;
        this.tlp = tlp;
    }
    
    public String getKodecust() {
        return kodecust;
    }
 
    public void setKodecust(String kodecust) {
        this.kodecust = kodecust;
    }
    
    public String getNamacust() {
        return namacust;
    }
    
    public void setNamacust(String namacust) {
        this.namacust = namacust;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getTlp() {
        return tlp;
    }
    
    public void setTlp(String tlp) {
        this.tlp = tlp;
    }
    
    public String selectAll() {
        String sql = "select * from customer ";
        return sql;
    }
    
    public String select() {
        String sql = "select * from customer where "
                + "kd_cust='"+ kodecust +"'";
        return sql;
    }
    
    public String toUpdate() {
        return " UPDATE customer SET " +
                 "nm_cust='" + namacust +
                 "', alamat='" + alamat +
                 "', telpon='" + tlp +
                 "'WHERE kd_cust='" + kodecust + "'";
    }
 
    public String toDelete() {
        return " DELETE FROM customer "
                +"WHERE kd_cust='" + kodecust + "'";
    }
 
    public String toInsert() {
        return " INSERT INTO customer VALUES ('"
                + kodecust + "','"
                + namacust + "','"
                + alamat + "','"
                + tlp + "')";
    }
}
    

