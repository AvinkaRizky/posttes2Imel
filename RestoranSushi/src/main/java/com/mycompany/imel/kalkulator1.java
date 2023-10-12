package com.mycompany.imel;
import java.util.Scanner;

public class kalkulator1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isLoggedIn = false;

        while (true) {
            if (!isLoggedIn) {
                System.out.print("Masukkan username: ");
                String username = input.next();
                System.out.print("Masukkan password: ");
                String password = input.next();

                if (username.equals("imel") && password.equals("123")) {
                    System.out.println("Login berhasil!");
                    isLoggedIn = true;
                } else {
                    System.out.println("Username atau password salah. Coba lagi.");
                    continue; // Lanjut ke iterasi berikutnya untuk login ulang
                }
            }

            System.out.println("\nMenu Kalkulator Sederhana:");
            System.out.println("1. Penambahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("5. Logout");
            System.out.println("6. Keluar Aplikasi");
            
            System.out.print("Pilih operasi (1/2/3/4/5/6): ");
            char pilihan = input.next().charAt(0);

            if (pilihan == '6') {
                System.out.println("Keluar aplikasi.");
                System.out.println("Terima kasih telah menggunakan kalkulator!");
                break; // Keluar dari aplikasi
            } else if (pilihan == '5') {
                System.out.println("Silahkan login kembali");
                System.out.println("Silahkan login kembali!!");
                isLoggedIn = false; // Kembali ke menu login
                continue; //kembali ke login setelah logout
                
            }
            if (pilihan >= '1' && pilihan <= '4') {
                System.out.print("Masukkan angka pertama: ");
                double angka1 = input.nextDouble();
                System.out.print("Masukkan angka kedua: ");
                double angka2 = input.nextDouble();

                double hasil = 0;
                switch (pilihan) {
                    case '1':
                        hasil = angka1 + angka2;
                        break;
                    case '2':
                        hasil = angka1 - angka2;
                        break;
                    case '3':
                        hasil = angka1 * angka2;
                        break;
                    case '4':
                        if (angka2 != 0) {
                            hasil = angka1 / angka2;
                        } else {
                            System.out.println("Pembagian oleh nol tidak diizinkan.");
                        }
                        break;
                }
                System.out.println("Hasil: " + hasil);
                isLoggedIn = false; // Kalkulator kembali ke login setelah perhitungan
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, 3, 4, 5, atau 6.");
            }
        }
    input.close();
    }
}

