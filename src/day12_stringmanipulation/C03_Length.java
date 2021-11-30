package day12_stringmanipulation;

import java.util.Scanner;

public class C03_Length {



	public static void main(String[] args) {
		// kullanicidan string bir ifade isteyin ve son harfini buyuk harf ile yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle yaziniz");
		String str=scan.nextLine().toUpperCase();
		
		System.out.println("Girdiginiz cumlenin son harfi : "+str.charAt(str.length()-1));
		
		// Length metodu girilen stringin uzunlugunu verir
		
		System.out.println(str); // butun cumleyi buyuk harfle yazdirir

		String str2="";
		System.out.println(str2.length());
		
		String str3 = null;
		// null case sensitive dir NULL veya Null yazilmaz
		//System.out.println(str3.length()); // RTE verir
		
		// null deger atanan String deger ile String Manipulation method'lari kullanilamaz
		System.out.println(str2.equals(str3));// RTE verir
		//System.out.println(str3.charAt(0));// RTE verir
		
		scan.close();

	}

}
