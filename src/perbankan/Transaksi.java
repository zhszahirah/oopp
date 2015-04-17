/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perbankan;

/**
 *
 * @author zahirah husin shahab
 */
import java.util.Date;
public class Transaksi {
    private Teller  teller ;
    private Nasabah nasabah ;
    private int Setor ;
    private int penarikan ;
    private Date WaktuTransaksi ;
    private int saldo;

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
     * @return the nasabah
     */
    public Nasabah getNasabah() {
        return nasabah;
    }

    /**
     * @param nasabah the nasabah to set
     */
    public void setNasabah(Nasabah nasabah) {
        this.nasabah = nasabah;
    }

    /**
     * @return the Setor
     */
    public int getSetor() {
        return Setor;
    }

    /**
     * @param Setor the Setor to set
     */
    public void setSetor(int Setor) {
        this.Setor = Setor;
    }

    /**
     * @return the penarikan
     */
    public int getPenarikan() {
        return penarikan;
    }

    /**
     * @param penarikan the penarikan to set
     */
    public void setPenarikan(int penarikan) {
        this.penarikan = penarikan;
    }

    /**
     * @return the WaktuTransaksi
     */
    public Date getWaktuTransaksi() {
        return WaktuTransaksi;
    }

    /**
     * @param WaktuTransaksi the WaktuTransaksi to set
     */
    public void setWaktuTransaksi(Date WaktuTransaksi) {
        this.WaktuTransaksi = WaktuTransaksi;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int setor , int tarik) {
        int temp = setor - tarik ;
        saldo = saldo + temp;
    }
    public void cetakPrint () {
        System.out.println("Penarikan sebesar  = " +penarikan+ " Setor Sebesar =  " +Setor+ " Saldo Tersisa =  " +saldo );
        
    }
}

    
   
