/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posstest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
            Admin admin = new Admin("Fikri", "Pelabuhan", 200000, "Admin", "ADMIN", "1234");
            User user = new User("Budi", "Loa janan", 200000, "user", "USER", "1111");
            
        OUTER:
        while (true) {
            System.out.println("Harap Melakukan Login terlebih dahulu");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Masukan pilihan :");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1 -> {
                    System.out.println("Masukan Username :");
                    String username = br.readLine();
                    System.out.println("Masukan Password :");
                    String password = br.readLine();
                    if(username.equals(admin.getUsername()) && password.equals(admin.getPassword())){
                        System.out.println("Selamat datang Admin" + admin.getNama());
                        admin.menu();
                        continue;
                    }
                    if(username.equals(user.getUsername()) && password.equals(user.getPassword())){
                        System.out.println("Selamat datang user" + user.getNama());
                        user.menu();
                        continue;
                    }
                    }
                case 2 -> {
                    System.out.println("Terima Kasih Telah Menggunakan Aplikasi");
                    System.exit(1);
                    break OUTER;
                    }
                default -> System.out.println("Pilihan Tidak Tersedia");
            }
        }
        }
    }

        

       

