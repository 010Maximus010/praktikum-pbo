//Nama File: Poligon.java 17/03/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Representasi dasar dari objek poligon (segi banyak)

package org.poligon;

public class Poligon {
    protected int jumlahSisi;
    public Poligon() {
        this.jumlahSisi = 0;
    }

    public void setJumlahSisi(int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
    }

    public int getJumlahSisi() {
        return this.jumlahSisi;
    }
    
}
