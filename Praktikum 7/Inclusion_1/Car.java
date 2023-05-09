//Nama File: Car.java 03/05/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Program untuk demo Polimorfisme Inclusion

public class Car extends Vehicle{
	void calRent(int jarak, float harga){
		float fare=jarak*harga;
		fare=fare-100.00f;
		System.out.println("Harga Sewa Mobil = "+fare);
	}
}
