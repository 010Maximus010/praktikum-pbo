//Nama File: BangunDatarGeneric.java 17/05/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Kelas konstruksi generic untuk BangunDatar

public class BangunDatarGeneric<T extends BangunDatar>{
	private T bangunDatar;
	
	public void set(T tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

//Jika Mengubah karakter 'T' menjadi 'T2' atau karakter lain di dalam kelas BangunDatarGeneric, kode tersebut akan tetap berjalan tanpa ada masalah. 
//Karakter yang digunakan hanya sebagai nama variabel saja.