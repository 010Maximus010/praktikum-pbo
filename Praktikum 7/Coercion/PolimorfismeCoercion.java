//Nama File: PolimorfismeCoercion.java 03/05/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Program Polimorfisme Coercion

public class PolimorfismeCoercion{
	public static int kuadrat(int bilangan){
		return bilangan*bilangan;
	}
	
	public static void main(String[] args){
		//deklarasi objek integer
		Integer bilangan = 10;
		
		//objek integer 'dipaksa' untuk diubah menjadi primitif
		int hasilKuadrat = kuadrat(bilangan);
		
		System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
	}
}	
