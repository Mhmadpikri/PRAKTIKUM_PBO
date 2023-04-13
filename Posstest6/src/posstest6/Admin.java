/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posstest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Admin extends Zakat implements Level1 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<ZakatMal> zakatmal = new ArrayList<ZakatMal>();
    static ArrayList<ZakatFitrah> zakatfitrah = new ArrayList<ZakatFitrah>();
    static ArrayList<Zakat> zakat = new ArrayList<Zakat>();
    
    final String status = "Admin";
    private String username;
    private String password;
    
    public Admin(String nama, String alamat, int sedekah, String status, String username, String password) {
        super(nama,alamat, sedekah);
        this.username = username;
        this.password = password;
    }
    
    public String getStatus() {
        return status;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public void tambahzakat() throws IOException{
         System.out.println("Tambahkan Data :");
         System.out.println("1. Zakat Mal");
         System.out.println("2. Zakat Fitrah");
         System.out.print("Masukan Pilihan anda : ");
         int pilihan = Integer.parseInt(br.readLine());
          
         switch (pilihan) {
            case 1 -> {
                System.out.print("Masukan nama muzzaki :");
                String addnama = br.readLine();
                System.out.print("Masukan alamat muzzaki :");
                String addalamat = br.readLine();
                System.out.print("Masukan jumlah zakat  :");
                int addzakat = Integer.parseInt(br.readLine());
                System.out.print("Masukan jumlah sedekah :");
                int addsedekah = Integer.parseInt(br.readLine());
                System.out.print("Masukan sumber dana :");
                String addsumber = br.readLine();
               
                ZakatMal malbaru = new ZakatMal( addnama, addalamat, addzakat, addsedekah, addsumber, null);
                zakatmal.add(malbaru);
                System.out.println("Data berhasil dimasukkan");
            }
            case 2 -> {
                System.out.print("Masukan nama muzzaki :");
                String addnama1 = br.readLine();
                System.out.print("Masukan alamat muzzaki :");
                String addalamat1 = br.readLine();
                System.out.print("Masukan jumlah zakat  :");
                int addzakat1 = Integer.parseInt(br.readLine());
                System.out.print("Masukan jumlah sedekah :");
                int addsedekah1 = Integer.parseInt(br.readLine());
                System.out.print("Masukan sumber dana :");
                String addsumber1 = br.readLine();
                
                ZakatFitrah ftrbaru  = new ZakatFitrah(addnama1, addalamat1, addzakat1, addsedekah1, addsumber1, null);
                zakatfitrah.add(ftrbaru);
                System.out.println("Data berhasil dimasukkan");
            }
            default -> System.out.println("Pilihan tidak ada");
        }       
    }
    //  lihat data
     @Override 
     public void lihatzakat() throws IOException{
         System.out.println("Lihat Data :");
         System.out.println("1. Zakat Mal");
         System.out.println("2. Zakat Fitrah");
         System.out.print("Masukan Pilihan anda : ");
         int pilihan = Integer.parseInt(br.readLine());
         
         switch (pilihan) {
            case 1 -> {
                System.out.println("|==================================================|");
                zakatmal.get(0).tampilzakat("|== Data Penerimaan Zakat Mal Masjid Nurul Bahri ==|");
                for (int i = 0; i < zakatmal.size(); i++){
                    System.out.println("|= Data ke-" + (i+1));
                    zakatmal.get(i).tampilzakat();
                }
            }
                
            case 2 -> {
                System.out.println("|==================================================|");
                zakatfitrah.get(0).tampilzakat("|== Data Penerimaan Zakat Fitrah Masjid Nurul Bahri ==|");
                for (int i = 0; i < zakatfitrah.size(); i++){
                    System.out.println("|= Data ke-" + (i+1));
                    zakatfitrah.get(i).tampilzakat();
                }
            }
            default -> System.out.println("Pilihan tidak ada");
        }
    }
     //  edit data
     @Override
     public void ubahzakat() throws IOException {
         System.out.println("Ubah Data :");
         System.out.println("1. Zakat Mal");
         System.out.println("2. Zakat Fitrah");
         System.out.print("Masukan Pilihan anda : ");
         int pilihan = Integer.parseInt(br.readLine());
         
        switch (pilihan) {
            case 1 -> {
                System.out.print("Ubah data Zakat mal ke - : ");
                int idx = Integer.parseInt(br.readLine());
        
                if(idx <= zakatmal.size() || idx > 0) {
                    System.out.print("Masukan nama muzzaki :");
                    String addnama = br.readLine();
                    System.out.print("Masukan alamat muzzaki :");
                    String addalamat = br.readLine();
                    System.out.print("Masukan jumlah zakat  :");
                    int addzakat = Integer.parseInt(br.readLine());
                    System.out.print("Masukan jumlah sedekah :");
                    int addsedekah = Integer.parseInt(br.readLine());
                    System.out.print("Masukan sumber dana :");
                    String addsumber = br.readLine();
                    zakatmal.get(idx-1).setNama(addnama);
                    zakatmal.get(idx-1).setAlamat(addalamat);
                    zakatmal.get(idx-1).setJumlah_zakat(addzakat);
                    zakatmal.get(idx-1).setSedekah(addsedekah);
                    zakatmal.get(idx-1).setSumber_dana(addsumber);
                    
                    System.out.println("selamat , data berhasil diubah !!");
                }else{
                    System.out.println("Data yang anda cari tidak ditemukan");
                }
            }
              
            case 2 -> {
                System.out.print("Ubah data Zakat Fitrah ke - : ");
                int idx1 = Integer.parseInt(br.readLine());
        
                if(idx1 <= zakatfitrah.size() || idx1 > 0) {
                    System.out.print("Masukan nama muzzaki :");
                    String addnama1 = br.readLine();
                    System.out.print("Masukan alamat muzzaki :");
                    String addalamat1 = br.readLine();
                    System.out.print("Masukan jumlah zakat  :");
                    int addzakat1 = Integer.parseInt(br.readLine());
                    System.out.print("Masukan jumlah sedekah :");
                    int addsedekah1 = Integer.parseInt(br.readLine());
                    System.out.print("Masukan sumber dana :");
                    String addsumber1 = br.readLine();
                    zakatfitrah.get(idx1-1).setNama(addnama1);
                    zakatfitrah.get(idx1-1).setAlamat(addalamat1);
                    zakatfitrah.get(idx1-1).setJumlah_zakat1(addzakat1);
                    zakatfitrah.get(idx1-1).setSedekah(addsedekah1);
                    zakatfitrah.get(idx1-1).setSumber_dana1(addsumber1);
                    
                    System.out.println("selamat , data berhasil diubah !!");
                }else{
                    System.out.println("Data yang anda cari tidak ditemukan");
                }
            }
            default -> {
            }
        }
    }
     // hapus data
    @Override
    public void hapuszakat() throws IOException {
         System.out.println("Ubah Data :");
         System.out.println("1. Zakat Mal");
         System.out.println("2. Zakat Fitrah");
         System.out.print("Masukan Pilihan anda : ");
         int pilihan = Integer.parseInt(br.readLine());
         
        switch (pilihan) {
            case 1 -> {
                System.out.print("Hapus data Zakat mal ke - : : ");
                int idx = Integer.parseInt(br.readLine());
        
                if(idx <= zakatmal.size() || idx > 0) {
                    zakatmal.remove(idx - 1);
                    
                    System.out.println("Selamat , Data berhaasil diubah !!");
                }else{
                    System.out.println("Data yang anda cari tidak ditemukan");
                }
            }
            case 2 -> {
                System.out.print("Hapus data Zakat Fitrah ke - : ");
                int idx1 = Integer.parseInt(br.readLine());
        
                if(idx1 <= zakatfitrah.size() || idx1 > 0) {
                    zakatfitrah.remove(idx1 - 1);
                    
                    System.out.println("Selamat , Data berhaasil diubah !!1");
                }else{
                    System.out.println("Data yang anda cari tidak ditemukan");
                }
            }
            default -> {
            }
        }

    }
    @Override
    public void menu() throws IOException {
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
             
            switch (pilihan) {
                case 1:
                    tambahzakat();
                    berhenti();
                    break;
                case 2:
                    lihatzakat();
                    berhenti();
                    break;
                case 3:
                    ubahzakat();
                    berhenti();
                    break;
                case 4:
                    hapuszakat();
                    berhenti();
                    break;
                case 5:
                    System.out.print("\n SEMOGA MENJADI BERKAH \n");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }
    }
    
    public static void berhenti() throws IOException {
         System.out.println("Enter untuk lanjutkan !!");
         br.readLine();
     }

    @Override
    public void tampilzakat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tampilzakat(String judul) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

