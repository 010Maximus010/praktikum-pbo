//Nama File: BangunDatarGenericTest.java 17/05/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Main class untuk generic bangun datar

public class BangunDatarGenericTest{
	public static void main(String[] args){
		Lingkaran l = new Lingkaran(2);
		BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
		bdg.set(l);
		System.out.println("Keliling Lingkaran : " +bdg.hitungKeliling());
		System.out.println("Tipe Generic : " +bdg.get().getClass().getName());
	}
}