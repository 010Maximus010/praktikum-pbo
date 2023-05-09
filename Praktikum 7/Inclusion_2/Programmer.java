//Nama File: Programmer.java 03/05/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Program untuk demo Polimorfisme Inclusion

public class Programmer extends Pegawai {
	protected int bonus = 450000;
	
	public Programmer (String name){
		nama = name;
	}
	
	public void tampilData() {
		System.out.println("Nama : "+nama+", Gaji pokok : "+gajiPokok);
        System.out.println("Bonus : "+bonus);
	}
}