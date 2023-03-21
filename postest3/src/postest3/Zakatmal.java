/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest3;

/**
 *
 * @author Asus - GK
 */
public class Zakatmal extends Zakat {
    private int jumlah_zakat;
    private String sumber_dana;
    
    public Zakatmal(String nama, String alamat, String telepon, int sedekah, int jumlah_zakat, String sumber_dana){
        super(nama, alamat, telepon, sedekah);
        
        this.jumlah_zakat = jumlah_zakat;
        this.sumber_dana = sumber_dana;
    }

    public int getJumlah_zakat() {
        return jumlah_zakat;
    }

    public void setJumlah_zakat(int jumlah_zakat) {
        this.jumlah_zakat = jumlah_zakat;
    }

    public String getSumber_dana() {
        return sumber_dana;
    }

    public void setSumber_dana(String sumber_dana) {
        this.sumber_dana = sumber_dana;
    }
    
}
