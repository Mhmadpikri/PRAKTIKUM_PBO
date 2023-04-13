/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posstest6;

/**
 *
 * @author Asus - GK
 */
public abstract class Zakat {
    protected String nama;
    protected String alamat;
    protected int sedekah;
    
    public Zakat(String nama, String alamat, int sedekah) {
        this.nama = nama;
        this.alamat = alamat;
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

    public int getSedekah() {
        return sedekah;
    }

    public void setSedekah(int sedekah) {
        this.sedekah = sedekah;
    }

    // method
    
    public abstract void tampilzakat();
     
    public abstract void tampilzakat(String judul);
    
  
}
