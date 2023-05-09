//Nama File: Pegawai.java 03/05/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Program untuk demo Polimorfisme Inclusion

public class Pegawai {
	protected String nama;
	protected int gajiPokok = 5000000;

	public void setNama (String name){
		nama = name;
	}
	
	public void tampilData(){
		System.out.println("Nama : "+nama+", Gaji pokok : "+gajiPokok);
	}
}