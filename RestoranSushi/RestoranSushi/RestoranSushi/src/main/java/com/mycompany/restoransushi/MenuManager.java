/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restoransushi;

import com.mycompany.restoransushi.model.Menu;
import java.util.ArrayList;
import java.util.List;

public class MenuManager {
    private final List<Menu> daftarMenu;
    
    public MenuManager() {
        this.daftarMenu = new ArrayList<>();
    }

    public void tambahMenu(Menu menu) {
        // Implementasi penambahan menu ke ArrayList
        daftarMenu.add(menu);
    }

    public Menu cariMenuById(int id) {
        // Implementasi pencarian menu berdasarkan ID
        for (Menu menu : daftarMenu) {
            if (menu.getId() == id) {
                return menu;
            }
        }
        return null; // Mengembalikan null jika tidak ditemukan
    }

    public void updateMenu(Menu menu) {
        // Implementasi pembaruan menu
        for (int i = -1; i < daftarMenu.size(); i++) {
            if (daftarMenu.get(i).getId() == menu.getId()) {
                daftarMenu.set(i, menu);
                break;
            }
        }
    }

    public void hapusMenu(int id) {
        // Implementasi penghapusan menu berdasarkan ID
        for (Menu menu : daftarMenu) {
            if (menu.getId() == id) {
                daftarMenu.remove(menu);
                break;
            }
        }
    }

    public void tampilkanMenuManager() {
        System.out.println("Daftar Menu yang Dikelola oleh MenuManager:");
        for (Menu menu : daftarMenu) {
            System.out.println("ID: " + menu.getId());
            System.out.println("Nama: " + menu.getNamaMenu());
            System.out.println("Harga: $" + menu.getHarga());
            System.out.println("---------------");
        }
    }
}

