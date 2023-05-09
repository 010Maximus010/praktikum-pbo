//Nama File: Manajer.java 03/05/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Program untuk demo Polimorfisme Inclusion

public class Manajer extends Pegawai {
	protected int tunjangan = 700000;
	
	public Manajer (String name){
		nama = name;
	}
	
	public void tampilData() {
		System.out.println("Nama : "+nama+", Gaji pokok : "+gajiPokok);
        System.out.println("Tunjangan : "+tunjangan);
	}
}