package day10_swichcase;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
		// kullanicidan bir sayi alin 
		// sayi cift ise cift yazdirin
		// degilse sayinin karesini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tamsayi girin");
		int sayi=scan.nextInt();
		String sonuc=sayi%2==0 ? "cift" : sayi*sayi+"";
		System.out.println(sonuc);
		
		scan.close();
	}

}
