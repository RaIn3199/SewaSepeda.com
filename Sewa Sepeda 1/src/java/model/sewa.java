package model;

public class sewa {
    
    private String nosewa;
    private String tglsewa;
    private String nofaktur;
    private Integer totsewa;
    private String nopesan;
 
    public String getNobeli() {
        return nosewa; 
    }
    
    public void seNobeli(String nosewa) {
        this.nosewa = nosewa;
    }
    
    public String getTglsewa() {
        return tglsewa;
    }
    
    public void setTglsewa(String tglsewa) {
        this.tglsewa = tglsewa;
    }
    
    public String getNofaktur() {
        return nofaktur;
    } 
    
    public void setNofaktur(String nofaktur) {
        this.nofaktur = nofaktur;
    }
    
    public Integer getTotsewa() {
        return totsewa;
    }
    
    public void setTotsewa(Integer totsewa) {
        this.totsewa = totsewa;
    }
    
    public String getNopesan() {
        return nopesan;
    }
    
    public void setNopesan(String nopesan) {
        this.nopesan = nopesan;
    } 
}