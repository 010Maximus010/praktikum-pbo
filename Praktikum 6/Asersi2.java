//Nama File: Asersi2.java 29/03/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Program untuk demo asersi, yang akan menolak input
//			 jari-jari lingkaran yang bernilai nol

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}
//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari > 0):"jari-jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling Lingkaran = "
			+kelilingLingkaran);
	}
}

//Pertanyaan: Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
//Jawaban: Ya, pada baris ke 9 variabel jariJari diinisialisasi dengan nilai 0, namun kemudian
//		   digunakan sebagai argumen untuk membuat objek lingkaran pada baris ke 10, sehingga ketika
//		   method hitungKeliling() dipanggil, keliling akan selalu menghasilkan 0.