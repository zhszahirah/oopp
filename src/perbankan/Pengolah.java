/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perbankan;

/**
 *
 * @author zahirah husin shahab
 */
import java.util.Scanner;
public class Pengolah {
     public static void main(String[] args){
         
         Alamat alamatNasabah1 = new Alamat () ;
         Alamat alamatBank1 = new Alamat ();
         BukuTabungan Buku1 = new BukuTabungan ();
         Nasabah nasabah1 = new Nasabah ();
         Teller teller1 = new Teller () ;
         Transaksi trans = new Transaksi () ;
         
         //Interface
         Scanner sc = new Scanner (System.in);
         System.out.println("===============Sistem Perbanakan===========");
         System.out.println(" Masukan Nama Nasabah ");
         String NamaNasabah = sc.nextLine();
         
         
         //alamat Nasabah
         alamatNasabah1.setJalan("Mawar");
         alamatNasabah1.setKodepos(30128);
         alamatNasabah1.setKota("Palembang");
         alamatNasabah1.setProv("Sumatera Selatan");
         
         //alamat Bank
         alamatBank1.setJalan("jend.sudirman");
         alamatBank1.setKota("jakarta");
         alamatBank1.setKodepos(2222);
         alamatBank1.setProv("DKI jakarta");
         
         //Data Nasabah
         nasabah1.setAlamatNasabah(alamatNasabah1);
         nasabah1.setNama(NamaNasabah);
         nasabah1.setNoKtp(78676857);
         
         //teller 
         teller1.setNama("Rebeca");
         teller1.setId("ss123");
         
         //Transaksi
         trans.setNasabah(nasabah1);
         trans.setTeller(teller1);
         trans.setPenarikan(2000);
         trans.setSetor(1111000);
         trans.setSaldo(trans.getPenarikan(), trans.getSetor());
         
         //Buku Tabungan
         Buku1.setAlamatBank(alamatBank1);
         Buku1.setIdentitasNasabah(nasabah1);
         Buku1.setTeller(teller1);
         Buku1.setTransaksi(trans);
         Buku1.cetakBukuTabungan();
     }
}
