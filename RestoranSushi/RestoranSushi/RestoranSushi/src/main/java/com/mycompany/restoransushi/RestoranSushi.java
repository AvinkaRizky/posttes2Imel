/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restoransushi;

import com.mycompany.restoransushi.model.Menu;
import com.mycompany.restoransushi.model.Pelanggan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestoranSushi {
    private static int i;
    public static void main(String[] args) {
        List<Menu> daftarMenu;
                   daftarMenu = new ArrayList<>();
                    // Contoh penggunaan Menu:
                   Menu menu1 = new Menu(1, "Sushi Salmon", 25.99);
                   Menu menu2 = new Menu(2, "Sushi Tuna", 23.99);

                   daftarMenu.add(menu1);
                   daftarMenu.add(menu2);
                    
        Scanner scanner = new Scanner (System.in);
        Scanner input = new Scanner (System.in);
        System.out.println("Selamat Datang di Restoran Sushi SI");
        boolean ulang = true;
        while (ulang){
            System.out.println("");
            System.out.println("Login");
            System.out.println("1. Menampilkan Menu");
            System.out.println("2. Menampilkan Pelanggan");
            System.out.println("3. Mencari Menu");
            System.out.println("4. Menambah Menu");
            System.out.println("5. Mengupdate Menu");
            System.out.println("6. Menghapus Menu");
            System.out.println("7. Keluar");
            System.out.println("Silahkan pilih login: ");
            String pilih;
            pilih = input.nextLine();
            System.out.println("");
            switch (pilih){
                case "1":
//                    if (daftarMenu.isEmpty()) {
//                        System.out.println("Daftar Menu Tidak Ada");
//                    } else {
//                        System.out.println("Daftar HP:");
//                        for (Menu p : daftarMenu) {
//                            System.out.println(p);
//                        }
//                    }
//                    break;
//
//                    // Tidak perlu mengubah properti Menu karena sudah final
//                    // Menampilkan daftar menu
                    for (Menu menu : daftarMenu) {
                        System.out.println("ID: " + menu.getId());
                        System.out.println("Nama Menu: " + menu.getNamaMenu());
                        System.out.println("Harga: Rp" + menu.getHarga());
                        System.out.println();
                    }
                    break;
                    
                case "2":
                    // Contoh penggunaan Pelanggan:
                    Pelanggan pelanggan1 = new Pelanggan(101, "imel");
                    Pelanggan pelanggan2 = new Pelanggan(102, "Haris");

                    // Menampilkan informasi pelanggan ke layar
                    pelanggan1.tampilkanPelanggan();
                    pelanggan2.tampilkanPelanggan(); 
                    break;
                case "3":
                    System.out.println("Masukkan ID Menu yang Ingin Dicari: ");
                    int idMenuCari = scanner.nextInt();
                    Menu menuDitemukan;
                    menuDitemukan = daftarMenu.get(idMenuCari);
                    if (menuDitemukan != null) {
                    System.out.println("Menu ditemukan: " + menuDitemukan.getNamaMenu());
                    } else {
                    System.out.println("Menu dengan ID " + idMenuCari + " tidak ditemukan.");
                    }
                    break;
                    
                case "4":
                    System.out.println("Masukkan ID Menu: ");
                    int idMenu = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline
                    System.out.println("Masukkan Nama Menu: ");
                    String namaMenu = scanner.nextLine();
                    System.out.println("Masukkan Harga Menu: ");
                    double hargaMenu = scanner.nextDouble();

                    Menu menuBaru = new Menu(idMenu, namaMenu, hargaMenu);
                    daftarMenu.add(menuBaru);
                    break;
                    
                case "5":
                    System.out.println("Masukkan ID Menu yang Ingin Diupdate: ");
                    int idMenuUpdate = scanner.nextInt();
                    Menu menuUpdate = daftarMenu.get(idMenuUpdate-1);
                    
                    if (menuUpdate != null) {
                        System.out.println("Menu yang akan diupdate: " + menuUpdate.getNamaMenu());
                        System.out.println("Masukkan Nama Menu yang Baru: ");
                        scanner.nextLine(); // Membersihkan newline
                        String namaMenuBaru = scanner.nextLine();
                        System.out.println("Masukkan Harga Menu yang Baru: ");
                        double hargaMenuBaru = scanner.nextDouble();
                        // Update data menu
//                        daftarMenu.updateMenu(menuUpdate);
                        for (Menu menu : daftarMenu) {
                            if(menu.getId()==(idMenuUpdate)){
                                System.out.println("ini idnya"+menu.getId());
                                menuUpdate.setNamaMenu(namaMenuBaru);
                                menuUpdate.setHargaMenu(hargaMenuBaru);
                                break;
                            }
                        }
//                        daftarMenu.set(idMenuUpdate, menuUpdate);
                        System.out.println("Menu berhasil diupdate.");
                    } else {
                        System.out.println("Menu dengan ID " + idMenuUpdate + " tidak ditemukan.");
                    }
                    break;
                case "6":
                    System.out.println("Masukkan ID Menu yang Ingin Dihapus: ");
                    int idMenuHapus = scanner.nextInt();

                    if (!daftarMenu.isEmpty() && idMenuHapus == daftarMenu.size()) {
                        Menu menuHapus = daftarMenu.get(idMenuHapus - 1);

                        System.out.println("Menu yang akan dihapus: " + menuHapus.getNamaMenu());

                        // Konfirmasi pengguna untuk menghapus menu
                        System.out.println("Apakah Anda yakin ingin menghapus menu ini? (Y/N): ");
                        String konfirmasi = scanner.next();

                        if (konfirmasi.equalsIgnoreCase("Y")) {
                            daftarMenu.remove(idMenuHapus - 1); // Hapus menu dari daftar
                            System.out.println("Menu berhasil dihapus.");
                        } else {
                            System.out.println("Penghapusan menu dibatalkan.");
                        }
                    } else {
                        System.out.println("Menu terbaru tidak dapat dihapus, karena ID yang dimasukkan tidak valid.");
                    }
                case "7":
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
                    
            }
        }
    
    }
}