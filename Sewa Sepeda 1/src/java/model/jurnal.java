package model;

public class jurnal {
    private String nojurnal, tgljurnal;
    private Double debet, kredit;
    
    public String getNojurnal() {
        return nojurnal;
    }
    
    public void setNojurnal (String nojurnal) {
        this.nojurnal = nojurnal;
    }
    
    public String getTgljurnal() {
        return tgljurnal;
    }
    
    public void setTgljurnal(String tgljurnal) {
        this.tgljurnal = tgljurnal;
    }
    
    public Double getDebet() {
        return debet;
    } 
    
    public void setdebet(Double debet) {
        this.debet = debet;
    }
    
    public Double getKredit() {
        return kredit;
    }
    
    public void setKredit(Double kredit) {
        this.kredit = kredit;
    }
}
