//Nama File: MPoligon.java 08/03/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: driver class untuk poligon, persegi panjang, dan segitiga

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		Segitiga segitiga = new Segitiga(10,10,3);
		persegi.printInfo();
		segitiga.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
		System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
	}
}