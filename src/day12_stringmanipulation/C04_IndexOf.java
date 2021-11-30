package day12_stringmanipulation;

import java.util.Scanner;

public class C04_IndexOf {

	public static void main(String[] args) {
		// indexOf() metodu bize istedigimiz karakter(lerin) index'ini dondurur
		
		String str="Java ogren, is sahibi ol";
				
		System.out.println(str.charAt(6));

		System.out.println("char arama : "+str.indexOf('g'));
		
		System.out.println("string arama : "+str.indexOf("g"));
		
		System.out.println("string kelime arama : "+str.indexOf("is"));
		
		System.out.println("string arama : "+str.indexOf("a")); // birden fazla varsa // ilk buldugunu getirir
		
		System.out.println("index 4 den sonra : "+str.indexOf('a', 4)); // index 4 den sonra 'a' yi aramaya baslar
		
		System.out.println(str.indexOf("dert")); // olmayan harf olunca -1 verir
		
		//kullanicidan bir cumle alip icerisinde Java olup olmadigini yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle girin");
		String str1=scan.nextLine().toLowerCase();
		int sonuc=str1.indexOf("java");
		System.out.println(sonuc==-1 ? "java icermiyor" : "java iceriyor");
		System.out.println(str1.indexOf("java"));
		
		scan.close();
		
	}

}
