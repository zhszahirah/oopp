/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perbankan;

/**
 *
 * @author zahirah husin shahab
 */
public class Alamat {
    private String jalan ;
     private String kota;
    private String prov;
    private int kodepos;  

    /**
     * @return the jalan
     */
    public String getJalan() {
        return jalan;
    }

    /**
     * @param jalan the jalan to set
     */
    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the prov
     */
    public String getProv() {
        return prov;
    }

    /**
     * @param prov the prov to set
     */
    public void setProv(String prov) {
        this.prov = prov;
    }

    /**
     * @return the kodepos
     */
    public int getKodepos() {
        return kodepos;
    }

    /**
     * @param kodepos the kodepos to set
     */
    public void setKodepos(int kodepos) {
        this.kodepos = kodepos;
    }
    
 public void printAlamat () {
     System.out.println ("Jalan . " + jalan + " Kota = " + kota + " kodepos " +kodepos) ;
     
 }   
    
}
    


