/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restoransushi.model;

public class Pelanggan {
   private final int id;
    private final String namaPelanggan;

    public Pelanggan(int id, String namaPelanggan) {
        this.id = id;
        this.namaPelanggan = namaPelanggan;
    }

    public int getId() {
        return id;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    // Metode untuk menampilkan informasi pelanggan
    public void tampilkanPelanggan() {
        System.out.println("ID Pelanggan: " + id);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        // Tambahkan informasi pelanggan lainnya jika ada
    }
}
    // ...
