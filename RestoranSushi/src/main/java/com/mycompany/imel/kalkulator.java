
package com.mycompany.imel;
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.print("Masukkan username: ");
            String username = input.next();
            System.out.print("Masukkan password: ");
            String password = input.next();

            if (username.equals("imel") && password.equals("123")) {
                System.out.println("Login berhasil!");
                isLoggedIn = true;
            } else {
                System.out.println("Username atau password salah. Coba lagi.");
            }
        }

        char pilihan;
        do {
            System.out.println("\nMenu Kalkulator Sederhana:");
            System.out.println("1. Penambahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("5. Keluar");

            System.out.print("Pilih operasi (1/2/3/4/5): ");
            pilihan = input.next().charAt(0);

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
            } else if (pilihan == '5') {
                System.out.println("Keluar dari kalkulator.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, 3, 4, atau 5.");
            }

        } while (pilihan != '5');

        System.out.println("Terima kasih telah menggunakan kalkulator!");
        input.close();
    }
}

