
package postest4;

public class ZakatFitrah extends Zakat {
    private int jumlah_zakat;
    private String sumber_dana;
    
    public ZakatFitrah(String nama, String alamat, String telepon, int sedekah, int jumlah_zakat1, String sumber_dana1){
         super(nama, alamat, telepon, sedekah);
        
        this.jumlah_zakat = jumlah_zakat1;
        this.sumber_dana = sumber_dana1;
    }

    public int getJumlah_zakat1() {
        return jumlah_zakat;
    }

    public void setJumlah_zakat1(int jumlah_zakat1) {
        this.jumlah_zakat = jumlah_zakat1;
    }

    public String getSumber_dana1() {
        return sumber_dana;
    }

    public void setSumber_dana1(String sumber_dana1) {
        this.sumber_dana = sumber_dana1;
    }
    
    public void tampilzakat(){
                   System.out.println("|= Nama Muzzaki       : " + this.nama);
                   System.out.println("|= Alamat Muzzaki     : " + this.alamat);
                   System.out.println("|= No. Telepon        : " + this.telepon);
                   System.out.println("|= Jumlah Zakat       : " + this.jumlah_zakat);
                   System.out.println("|= Jumlah Sedekah     : " + this.sedekah);
                   System.out.println("|= Jumlah Zakat       : " + this.sumber_dana);
                   System.out.println("|==================================================|");
                   System.out.println("\n");
    }
    
    public void tampilzakat(String judul){
        System.out.println(judul);
    }
}
