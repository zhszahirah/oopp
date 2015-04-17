/*S
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perbankan;

/**
 *
 * @author zahirah husin shahab
 */
public class Nasabah {
    private String nama ;
    private Alamat alamatNasabah ;
    private int NoKtp ;

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) throws Exception{
        for (char c : nama.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("Nama harus tidak mengandung angka!");
            }
        this.nama = nama;
    }}

    /**
     * @return the alamatNasabah
     */
    public Alamat getAlamatNasabah() {
        return alamatNasabah;
    }

    /**
     * @param alamatNasabah the alamatNasabah to set
     */
    public void setAlamatNasabah(Alamat alamatNasabah) {
        this.alamatNasabah = alamatNasabah;
    }

    /**
     * @return the NoKtp
     */
    public int getNoKtp() {
        return NoKtp;
    }

    /**
     * @param NoKtp the NoKtp to set
     */
    public void setNoKtp(int NoKtp) {
        this.NoKtp = NoKtp;
    }
    public void cetakNasabah ()  {
        System.out.println("Nama = " +nama);
        System.out.print("Alamat= ");alamatNasabah.printAlamat();
        System.out.println("No KTP = " +NoKtp);
    
}
}