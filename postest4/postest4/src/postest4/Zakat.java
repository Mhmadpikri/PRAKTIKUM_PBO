/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest4;

/**
 *
 * @author Asus - GK
 */
public class Zakat {
    protected String nama;
    protected String alamat;
    protected String telepon;
    protected int sedekah;
    
    public Zakat(String nama, String alamat, String telepon, int sedekah) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.sedekah = sedekah;   
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public int getSedekah() {
        return sedekah;
    }

    public void setSedekah(int sedekah) {
        this.sedekah = sedekah;
    }

    // method
    
     public void registrasi(){
        System.out.println("Data berhasil dimasukkan");
    }
     
     public void terupdate(){
        System.out.println("Data berhasil diperbarui");
    }
    
  
}

