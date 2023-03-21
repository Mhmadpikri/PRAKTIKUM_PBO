/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest3;

/**
 *
 * @author Asus - GK
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author Asus - GK
 */
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Zakatmal> zakat = new ArrayList<Zakatmal>();
    static ArrayList<ZakatFitrah> zakat1 = new ArrayList<ZakatFitrah>();
    
     public static void main(String[] args) throws IOException {
         while (true) {
             System.out.println("|==============================================|");
             System.out.println("|== Data Penerimaan Zakat Masjid Nurul Bahri ==|");
             System.out.println("|1. Tambahkan Data                             |");
             System.out.println("|2. Lihat Data zakat                           |");
             System.out.println("|3. Perbarui Data zakat                        |");
             System.out.println("|4. Hapus Data Zakat                           |");
             System.out.println("|5. Keluar                                     |");
             System.out.println("|==============================================|");
             System.out.print("Silahkan Pilih Menu :");
             int pilihan = Integer.parseInt(br.readLine());
             
                 if(pilihan==1){
                     tambahzakat(); 
                     berhenti();
                 }else if(pilihan==2){
                     lihatzakat();  
                     berhenti();
                 }else if(pilihan==3){
                     ubahzakat();
                     berhenti();
                 }else if(pilihan==4){
                     hapuszakat();  
                     berhenti();
                 }else if(pilihan==5){
                     System.out.print("\n SEMOGA MENJADI BERKAH \n");
                     System.exit(0);
                    
                 }else{
                     System.out.println("Pilihan tidak ada");
                 }
             
         }
     }
     
//   tambah zakat
     
      public static void tambahzakat() throws IOException{
         System.out.println("Tambahkan Data :");
         System.out.println("1. Zakat Mal");
         System.out.println("2. Zakat Fitrah");
         System.out.print("Masukan Pilihan anda : ");
         int pilihan = Integer.parseInt(br.readLine());
          
         switch (pilihan) {
            case 1:
                System.out.print("Masukan nama muzzaki :");
                String addnama = br.readLine();
                System.out.print("Masukan alamat muzzaki :");
                String addalamat = br.readLine();
                System.out.print("Masukkan No. Telepon :");
                String addtelepon = br.readLine();
                System.out.print("Masukan jumlah zakat  :");
                int addzakat = Integer.parseInt(br.readLine());
                System.out.print("Masukan jumlah sedekah :");
                int addsedekah = Integer.parseInt(br.readLine());
                System.out.print("Masukan sumber dana :");
                String addsumber = br.readLine();
                
                Zakatmal malbaru = new Zakatmal(addnama, addalamat, addtelepon, addzakat, addsedekah, addsumber);
                zakat.add(malbaru);
                malbaru.registrasi();

                break;
            case 2:
                System.out.print("Masukan nama muzzaki :");
                String addnama1 = br.readLine();
                System.out.print("Masukan alamat muzzaki :");
                String addalamat1 = br.readLine();
                System.out.print("Masukkan No. Telepon :");
                String addtelepon1 = br.readLine();
                System.out.print("Masukan jumlah zakat  :");
                int addzakat1 = Integer.parseInt(br.readLine());
                System.out.print("Masukan jumlah sedekah :");
                int addsedekah1 = Integer.parseInt(br.readLine());
                System.out.print("Masukan sumber dana :");
                String addsumber1 = br.readLine();
                
                ZakatFitrah ftrbaru  = new ZakatFitrah(addnama1, addalamat1, addtelepon1, addzakat1, addsedekah1, addsumber1);
                zakat1.add(ftrbaru);
                ftrbaru.registrasi();

                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }

    }
//  lihat data
      
     public static void lihatzakat() throws IOException{
         System.out.println("Lihat Data :");
         System.out.println("1. Zakat Mal");
         System.out.println("2. Zakat Fitrah");
         System.out.print("Masukan Pilihan anda : ");
         int pilihan = Integer.parseInt(br.readLine());
         
         switch (pilihan) {
            case 1:
                System.out.println("|==============================================|");
                System.out.println("|== Data Penerimaan Zakat Masjid Nurul Bahri ==|");
                for (int i = 0; i < zakat.size(); i++){
                   System.out.println("|= Data ke-" + (i+1));
                   System.out.println("|= Nama Muzzaki       : " + zakat.get(i).getNama());
                   System.out.println("|= Alamat Muzzaki     : " + zakat.get(i).getAlamat());
                   System.out.println("|= No. Telepon        : " + zakat.get(i).getTelepon());
                   System.out.println("|= Jumlah Zakat       : " + zakat.get(i).getJumlah_zakat());
                   System.out.println("|= Jumlah Sedekah     : " + zakat.get(i).getSedekah());
                   System.out.println("|= Jumlah Zakat       : " + zakat.get(i).getSumber_dana());
                   System.out.println("|==============================================|");
                   System.out.println("\n");
                }
                break;
                
            case 2:
                System.out.println("|==============================================|");
                System.out.println("|== Data Penerimaan Zakat Masjid Nurul Bahri ==|");
                for (int i = 0; i < zakat1.size(); i++){
                   System.out.println("|= Data ke-" + (i+1));
                   System.out.println("|= Nama Muzzaki       : " + zakat1.get(i).getNama());
                   System.out.println("|= Alamat Muzzaki     : " + zakat1.get(i).getAlamat());
                   System.out.println("|= No. Telepon        : " + zakat1.get(i).getTelepon());
                   System.out.println("|= Jumlah Zakat       : " + zakat1.get(i).getJumlah_zakat1());
                   System.out.println("|= Jumlah Sedekah     : " + zakat1.get(i).getSedekah());
                   System.out.println("|= Jumlah Zakat       : " + zakat1.get(i).getSumber_dana1());
                   System.out.println("|==============================================|");
                   System.out.println("\n");
                }
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }               
    
//  edit data
     
     public static void ubahzakat() throws IOException {
         System.out.println("Ubah Data :");
         System.out.println("1. Zakat Mal");
         System.out.println("2. Zakat Fitrah");
         System.out.print("Masukan Pilihan anda : ");
         int pilihan = Integer.parseInt(br.readLine());
         
        switch (pilihan) {
            case 1:
                System.out.print("Ubah data Zakat mal ke - : ");
                int idx = Integer.parseInt(br.readLine());
        
                if(idx <= zakat.size() || idx > 0) {
                    System.out.print("Masukan nama muzzaki :");
                    String addnama = br.readLine();
                    System.out.print("Masukan alamat muzzaki :");
                    String addalamat = br.readLine();
                    System.out.print("Masukkan No. Telepon :");
                    String addtelepon = br.readLine();
                    System.out.print("Masukan jumlah zakat  :");
                    int addzakat = Integer.parseInt(br.readLine());
                    System.out.print("Masukan jumlah sedekah :");
                    int addsedekah = Integer.parseInt(br.readLine());
                    System.out.print("Masukan sumber dana :");
                    String addsumber = br.readLine();
                    zakat.get(idx-1).setNama(addnama);
                    zakat.get(idx-1).setAlamat(addalamat);
                    zakat.get(idx-1).setTelepon(addtelepon);
                    zakat.get(idx-1).setJumlah_zakat(addzakat);
                    zakat.get(idx-1).setSedekah(addsedekah);
                    zakat.get(idx-1).setSumber_dana(addsumber);
                    
                    System.out.println("selamat , data berhasil diubah !!");
                }else{
                    System.out.println("Data yang anda cari tidak ditemukan");
                }
                break;
              
            case 2:
                System.out.print("Ubah data Zakat Fitrah ke - : ");
                int idx1 = Integer.parseInt(br.readLine());
        
                if(idx1 <= zakat1.size() || idx1 > 0) {
                    System.out.print("Masukan nama muzzaki :");
                    String addnama1 = br.readLine();
                    System.out.print("Masukan alamat muzzaki :");
                    String addalamat1 = br.readLine();
                    System.out.print("Masukkan No. Telepon :");
                    String addtelepon1 = br.readLine();
                    System.out.print("Masukan jumlah zakat  :");
                    int addzakat1 = Integer.parseInt(br.readLine());
                    System.out.print("Masukan jumlah sedekah :");
                    int addsedekah1 = Integer.parseInt(br.readLine());
                    System.out.print("Masukan sumber dana :");
                    String addsumber1 = br.readLine();
                    zakat1.get(idx1-1).setNama(addnama1);
                    zakat1.get(idx1-1).setAlamat(addalamat1);
                    zakat1.get(idx1-1).setTelepon(addtelepon1);
                    zakat1.get(idx1-1).setJumlah_zakat1(addzakat1);
                    zakat1.get(idx1-1).setSedekah(addsedekah1);
                    zakat1.get(idx1-1).setSumber_dana1(addsumber1);
                    
                    System.out.println("selamat , data berhasil diubah !!");
                }else{
                    System.out.println("Data yang anda cari tidak ditemukan");
                }
                break;
            default:
                break;
        }
    }


// hapus data
     public static void hapuszakat() throws IOException {
         System.out.println("Ubah Data :");
         System.out.println("1. Zakat Mal");
         System.out.println("2. Zakat Fitrah");
         System.out.print("Masukan Pilihan anda : ");
         int pilihan = Integer.parseInt(br.readLine());
         
        switch (pilihan) {
            case 1:
                System.out.print("Hapus data Zakat mal ke - : : ");
                int idx = Integer.parseInt(br.readLine());
        
                if(idx <= zakat.size() || idx > 0) {
                    zakat.remove(idx - 1);
                    
                    System.out.println("Selamat , Data berhaasil diubah !!");
                }else{
                    System.out.println("Data yang anda cari tidak ditemukan");
                }
                break;
            case 2:
                System.out.print("Hapus data Zakat Fitrah ke - : ");
                int idx1 = Integer.parseInt(br.readLine());
        
                if(idx1 <= zakat1.size() || idx1 > 0) {
                    zakat1.remove(idx1 - 1);
                    
                    System.out.println("Selamat , Data berhaasil diubah !!1");
                }else{
                    System.out.println("Data yang anda cari tidak ditemukan");
                }
                break;
            default:
                break;
        }

    }

     
     public static void berhenti() throws IOException {
         System.out.println("Enter untuk lanjutkan !!");
         br.readLine();
     }
}
