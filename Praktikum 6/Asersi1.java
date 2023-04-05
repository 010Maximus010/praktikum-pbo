//Nama File: Asersi1.java 29/03/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Program untuk asersi

public class Asersi1{
	public static void main(String[] args){
		int x = 0;
		if(x > 0){
			System.out.println("x bilangan positif");
		}
		else{
			assert(x < 0):"ada kesalahan kode";
			System.out.println("x bilangan negatif");
		}
	}
}