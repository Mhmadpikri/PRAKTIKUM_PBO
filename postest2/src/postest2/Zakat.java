/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest2;

/**
 *
 * @author Asus - GK
 */
public class Zakat {
    private String nama_muzzaki;
    private String nama_penerima;
    private String jenis_zakat;
    private int jumlah_zakat;
    
    // constructor 
    
    public Zakat(String nama_muzzaki,String nama_penerima, String jenis_zakat, int jumlah_zakat){
        this.nama_muzzaki = nama_muzzaki;
        this.nama_penerima = nama_penerima;
        this.jenis_zakat = jenis_zakat;
        this.jumlah_zakat = jumlah_zakat;
    }

    public String getNama_muzzaki() {
        return nama_muzzaki;
    }

    public void setNama_muzzaki(String nama_muzzaki) {
        this.nama_muzzaki = nama_muzzaki;
    }

    public String getNama_penerima() {
        return nama_penerima;
    }

    public void setNama_penerima(String nama_penerima) {
        this.nama_penerima = nama_penerima;
    }

    public String getJenis_zakat() {
        return jenis_zakat;
    }

    public void setJenis_zakat(String jenis_zakat) {
        this.jenis_zakat = jenis_zakat;
    }

    public int getJumlah_zakat() {
        return jumlah_zakat;
    }

    public void setJumlah_zakat(int jumlah_zakat) {
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

