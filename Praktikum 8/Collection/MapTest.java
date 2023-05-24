//Nama File: MapTest.java 17/05/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Program yang menggunakan Generic untuk pasangan Kunci-Nilai

import java.util.*;

public class MapTest{
	public static void main(String[] args){
		//kunci -> integer, nilai -> string
		Map<Integer,String> map = new HashMap<Integer,String>();
		//menempatkan elemen kunci dan nilai
		map.put(1,"Satu");
		map.put(2,"Dua");
		//mengambil elemen pertama
		System.out.println(map.get(1));
		//mengambil keseluruhan kunci sebagai objek collection Set
		Set<Integer> key = map.keySet();
		//bagaimana iterasi untuk mengambil keseluruhan
		//nilai dari kunci? Tulis pada laporan anda!
		//petunjuk : gunakan iterasi seperti program ArrayListTest
		
		//jawab:
		//menggunakan for untuk mendefinisikan k sebagai elemen dari key, kemudian melakukan pencetakan ke layar dengan menggunakan k itu sendiri
        //untuk mendapatkan value dari k, dapat menggunakan operator get()
        for (Integer k : key) {
            System.out.println(map.get(k));
        }
	}
}