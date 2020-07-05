package model;

public class retur {
    
    private String noretur,tglretur,kdcust,kdbarang,totretur,qtyretur,subretur;
    
    public retur(){
    }
    
    public retur(String noretur,String tglretur, String kdcust,
            String kdbarang, String totretur, String qtyretur, String subretur) {
        this.noretur = noretur;
        this.tglretur = tglretur;
        this.kdcust = kdcust;
        this.kdbarang = kdbarang;
        this.totretur = totretur;
        this.qtyretur = qtyretur;
        this.subretur = subretur; 
               
    }

    
    public String getNoretur() {
        return noretur;
    }
    
    public void setNoretur(String noretur) {
        this.noretur = noretur;
    }
    
    public String getTglretur() {
        return tglretur;
    }
    
    public void setTglretur(String tglretur) {
        this.tglretur = tglretur;
    }
    
    public String getTotretur() {
        return totretur;
    }
    
    public void setTotretur(String totretur) {
        this.totretur = totretur;
    }
    
    public String getKdbarang() {
        return kdbarang;
    }
    
    public void setKdbarang(String kdbarang) {
        this.kdbarang = kdbarang;
    }
    
    public String getKdcust() {
        return kdcust;
    }
    
    public void setKdsupplier(String kdcust) {
        this.kdcust = kdcust;
    }
    
    public String getQtyretur() {
        return qtyretur;
    }
    
    public void setQtyretur(String qtyretur) {
        this.qtyretur = qtyretur;
    }
    
    public String getSubretur() {
        return subretur;
    }
    
    public void setSubretur(String subretur) {
        this.subretur = subretur;
    }
    
    public String selectAll() {
        String sql = "select * from retur_sewa " ;
        return sql;
    }
    
    public String select() {
        String sql = "select * from retur_sewa where "
                + "no_retur='"+noretur+"'";
        return sql;
    }
    
    public String toDelete () {
        return "DELETE FROM sementara_retur "
                + "WHERE noretur='" + noretur + "'";
    }
    
    public String toInsert() {
        return " INSERT INTO sementara_retur VALUES ('"
                + noretur + "','"
                + kdbarang + "','"
                + qtyretur + "','"
                + subretur + "')";
    }
}

