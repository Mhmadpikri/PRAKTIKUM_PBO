/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest1;

//import library

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
    static ArrayList<Zakat> zakat = new ArrayList<Zakat>();
    
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
         System.out.print("Masukkan nama muzzaki    :");
         String addnama = br.readLine();
         System.out.print("Masukkan nama penerima   :");
         String addpenerima = br.readLine();
         System.out.print("Masukkan jenis zakat     :");
         String addjenis = br.readLine();
         System.out.print("Masukan jumlah zakat     :");
         int addjumlah = Integer.parseInt(br.readLine());
         Zakat DataZakatBaru = new Zakat(addnama, addpenerima, addjenis, addjumlah);
         zakat.add(DataZakatBaru);
         DataZakatBaru.registrasi();
     }
      
//  lihat data
      
     public static void lihatzakat() throws IOException{
         System.out.println("|==============================================|");
         System.out.println("|== Data Penerimaan Zakat Masjid Nurul Bahri ==|");
         for (int i = 0; i < zakat.size(); i++){
            System.out.println("|= Nama Muzzaki     : " + zakat.get(i).nama_muzzaki);
            System.out.println("|= Nama Penerima    : " + zakat.get(i).nama_penerima);
            System.out.println("|= Jenis Zakat      : " + zakat.get(i).jenis_zakat);
            System.out.println("|= Jumlah Zakat     : " + zakat.get(i).jumlah_zakat); 
            System.out.println("|==============================================|");
            System.out.println("\n");
         }
     }
     
//  edit data
     
     public static void ubahzakat() throws IOException {
        System.out.print("ubah data zakat ke berapa : ");
        int idx = Integer.parseInt(br.readLine());

         if(idx <= zakat.size() || idx > 0) {
            System.out.print("Masukkan nama muzzaki    :");
            String addnama = br.readLine();
            System.out.print("Masukkan nama penerima   :");
            String addpenerima = br.readLine();
            System.out.print("Masukkan jenis zakat     :");
            String addjenis = br.readLine();
            System.out.print("Masukan jumlah zakat     :");
            int addjumlah = Integer.parseInt(br.readLine());
            Zakat DataZakatBaru = new Zakat(addnama, addpenerima, addjenis, addjumlah);
            zakat.set(idx - 1,DataZakatBaru );
            DataZakatBaru.terupdate();
         }else{
             System.out.println("Data yang anda minta tidak ditemukan");
         }
     }
  
// hapus data
     public static void hapuszakat() throws IOException {
         System.out.print("hapus data zakat ke berapa : ");
         int idx = Integer.parseInt(br.readLine());

         if(idx <= zakat.size() || idx > 0) {
             zakat.remove(idx - 1);
            
             System.out.println("Data berhasil dihapus !!");
         }else{
             System.out.println("Data yang anda minta tidak ditemukan");
        }
    }
     
     public static void berhenti() throws IOException {
         System.out.println("Enter untuk lanjutkan !!");
         br.readLine();
     }
}
