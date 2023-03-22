//Nama File: MKubus.java 17/03/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Kelas yang berisi program utama yang memanfaatkan kelas Kubus

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus{
    public static void main(String[] args) {
        BujurSangkar bujursangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujursangkar);

        BujurSangkar bujurSangkar2 = new BujurSangkar(12);
        Kubus kubus2 = new Kubus(bujurSangkar2);

        System.out.println("Luas Alas Kubus: " + kubus.hitungLuasAlas());
        System.out.println("Volume Kubus: " + kubus.hitungVolume());

        System.out.println("Luas Alas Kubus: " + kubus2.hitungLuasAlas());
        System.out.println("Volume Kubus: " + kubus2.hitungVolume());
    }

}
