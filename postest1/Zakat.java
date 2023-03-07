/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest1;

/**
 *
 * @author Asus - GK
 */
public class Zakat {
    String nama_muzzaki;
    String nama_penerima;
    String jenis_zakat;
    int jumlah_zakat;
    
    // constructor 
    
    public Zakat(String nama_muzzaki,String nama_penerima, String jenis_zakat, int jumlah_zakat){
        this.nama_muzzaki = nama_muzzaki;
        this.nama_penerima = nama_penerima;
        this.jenis_zakat = jenis_zakat;
        this.jumlah_zakat = jumlah_zakat;
    }
    
    // method
    
     public void registrasi(){
        System.out.println("Data berhasil dimasukkan");
    }
     
     public void terupdate(){
        System.out.println("Data berhasil diperbarui");
    }
    
}
