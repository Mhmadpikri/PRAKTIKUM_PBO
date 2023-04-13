/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posstest6;


public final class ZakatMal extends Zakat {
    private int jumlah_zakat;
    private String sumber_dana;
    public final String jenis = "Zakat mal";
    
    public ZakatMal(String nama, String alamat, int sedekah, int jumlah_zakat, String sumber_dana, String jenis){
        super(nama, alamat, sedekah);
        
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
    @Override
    public void tampilzakat(){
                   System.out.println("|= Nama Muzzaki       : " + this.nama);
                   System.out.println("|= Alamat Muzzaki     : " + this.alamat);
                   System.out.println("|= Jumlah Zakat       : " + this.jumlah_zakat);
                   System.out.println("|= Jumlah Sedekah     : " + this.sedekah);
                   System.out.println("|= Jumlah Zakat       : " + this.sumber_dana);
                   System.out.println("|==================================================|");
                   System.out.println("\n");
    }
    
    @Override
    public void tampilzakat(String judul){
        System.out.println(judul);
    }
    
}
