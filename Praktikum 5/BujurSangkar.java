//Nama File: BujurSangkar.java 25/03/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Kelas yang membuat implementasi metode abstrak pada bangun datar

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        double luas = sisi * sisi;
        return luas;
    }   
}

// Apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar? jelaskan!
// jawab: Ketika BujurSangkar tidak diimplementasikan maka akan terjadi error saat compile
//		  karena BangunDatar merupakan abstrak yang didalamnya terdapat metode yang harus diimplementasikan ke BujurSangkar.
//		  Jika implementasi metode dari abstrak tidak dibuat maka akan terjadi error
//		  dimana file bujursangkar tidak dapat dicompile dan tidak dianggap sebagai inherit abstract dari bangun datar.