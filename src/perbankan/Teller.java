/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perbankan;

/**
 *
 * @author zahirah husin shahab
 */
public class Teller {
    private String Nama ;
    private String id ; 
    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) throws Exception{
        for (char c : Nama.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("Nama harus tidak mengandung angka!");
            }
        this.Nama = Nama;
    }}

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    } 
    
    public void cetakTeller () {
        System.out.println("Nama Teller = " +Nama+ " No Id = " +id );
    }
}
    