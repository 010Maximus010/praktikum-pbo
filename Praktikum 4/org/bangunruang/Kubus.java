//Nama File: Kubus.java 17/03/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Program class Kubus

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }

    public double hitungVolume(){
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi * panjangSisi;
    }
    public double hitungLuasAlas(){
        return permukaan.hitungLuas();
    }

}
