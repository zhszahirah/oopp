/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perbankan;

/**
 *
 * @author zahirah husin shahab
 */
public class BukuTabungan {
    private Alamat AlamatBank;
    private Nasabah identitasNasabah;
    private Teller teller ;
    private Transaksi transaksi ;

    /**
     * @return the AlamatBank
     */
    public Alamat getAlamatBank() {
        return AlamatBank;
    }

    /**
     * @param AlamatBank the AlamatBank to set
     */
    public void setAlamatBank(Alamat AlamatBank) {
        this.AlamatBank = AlamatBank;
    }

    /**
     * @return the identitasNasabah
     */
    public Nasabah getIdentitasNasabah() {
        return identitasNasabah;
    }

    /**
     * @param identitasNasabah the identitasNasabah to set
     */
    public void setIdentitasNasabah(Nasabah identitasNasabah) {
        this.identitasNasabah = identitasNasabah;
    }

    /**
     * @return the teller
     */
    public Teller getTeller() {
        return teller;
    }

    /**
     * @param teller the teller to set
     */
    public void setTeller(Teller teller) {
        this.teller = teller;
    }

    /**
     * @return the transaksi
     */
    public Transaksi getTransaksi() {
        return transaksi;
    }

    /**
     * @param transaksi the transaksi to set
     */
    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }
   
   public void cetakBukuTabungan (){
         identitasNasabah.cetakNasabah();
         System.out.print( " Alamat Bank Transaksi = " ) ;
         AlamatBank.printAlamat() ;
         teller.cetakTeller();
         System.out.println("====== Jenis Transaksi ==========");
         transaksi.cetakPrint();
         
        
    }
}
    
