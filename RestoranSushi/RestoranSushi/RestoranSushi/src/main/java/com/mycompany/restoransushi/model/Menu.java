package com.mycompany.restoransushi.model;

public class Menu {
    private final int id;
    private String namaMenu;
    private double hargaMenu;

    public Menu(int id, String namaMenu, double hargaMenu) {
        this.id = id;
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
    }
    public String getNamaMenu() {
        return namaMenu;
    }
    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }
    public double getHarga() {
        return hargaMenu;
    }  
    public void setHargaMenu(double hargaMenu) {
        this.hargaMenu = hargaMenu;
    }
    public int getId() {
        return id;
    } 
}
