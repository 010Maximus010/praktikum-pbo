//Nama File: AngkaSial.java 29/03/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Program penggunaan exception buatan sendiri
//			 Pengenalan klausa 'throw' dan 'throws'

public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka == 13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}
		catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

//Pertanyaan: 
//1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
//2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

//Jawaban:
//1. Tidak, karena program akan melompat langsung ke blok catch tanpa mengeksekusi kode di antara try dan catch.
//2. Ya, baris 21 akan dieksekusi jika terjadi eksepsi dalam blok try,
//	 karena baris tersebut berada dalam blok catch yang akan dieksekusi jika terjadi eksepsi.