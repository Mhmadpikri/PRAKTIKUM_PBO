
package postest3;

public class ZakatFitrah extends Zakat {
    private int jumlah_zakat1;
    private String sumber_dana1;
    
    public ZakatFitrah(String nama, String alamat, String telepon, int sedekah, int jumlah_zakat1, String sumber_dana1){
         super(nama, alamat, telepon, sedekah);
        
        this.jumlah_zakat1 = jumlah_zakat1;
        this.sumber_dana1 = sumber_dana1;
    }

    public int getJumlah_zakat1() {
        return jumlah_zakat1;
    }

    public void setJumlah_zakat1(int jumlah_zakat1) {
        this.jumlah_zakat1 = jumlah_zakat1;
    }

    public String getSumber_dana1() {
        return sumber_dana1;
    }

    public void setSumber_dana1(String sumber_dana1) {
        this.sumber_dana1 = sumber_dana1;
    }
    
}
