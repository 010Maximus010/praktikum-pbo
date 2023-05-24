//Nama File: ArrayListTest.java 17/05/2023
//Penulis: Muhammad Afiat Yulianto
//NIM: 24060121140141
//LAB: PBO B2
//Deskripsi: Program penggunaan objek ArrayList sebagai Collection class

import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args){
		//inisialisasi ArrayList yang hanya dapat berisi objek String
		ArrayList<String> strings = new ArrayList<String>();
		//menambah elemen
		strings.add("Praktikum");
		strings.add("Collection");
		strings.add("dan Generics");
		//menghapus elemen
		strings.remove("Praktikum");
		//iterasi pada keseluruhan ArrayList
		for(String s : strings){
			System.out.print(s+" ");
		}
	}
}
