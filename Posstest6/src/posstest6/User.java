/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posstest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class User extends Zakat implements Level2 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static ArrayList<ZakatMal> zakatmal = new ArrayList<>();
    static ArrayList<ZakatFitrah> zakatfitrah = new ArrayList<>();
    static ArrayList<Zakat> zakat = new ArrayList<>();
    
    final String status = "User";
    private String username;
    private String password;
    
    public User(String nama, String alamat, int sedekah, String status, String username, String password) {
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
    public void tampilzakat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tampilzakat(String judul) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void lihatzakat() throws IOException {

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

    @Override
    public void menu() throws IOException {
        while (true) {
             System.out.println("|==============================================|");
             System.out.println("|== Data Penerimaan Zakat Masjid Nurul Bahri ==|");            
             System.out.println("|1. Lihat Data zakat                           |");
             System.out.println("|2. Keluar                                     |");
             System.out.println("|==============================================|");
             System.out.print("Silahkan Pilih Menu :");
             int pilihan = Integer.parseInt(br.readLine());
             
             switch (pilihan) {
                case 1:
                    lihatzakat();
                    berhenti();
                    break;
                case 2:
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
}
    
