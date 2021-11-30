package day04_matematikselIslemlerModulus;

import java.util.Scanner;

public class C3_ModulusOperatoru2 {

	public static void main(String[] args) {
		// kullanicidan 4 basamakli bir sayi alalim ve 
		// sayinin basamaklarini ters sira ile yazdirin
		
		// bir sayinin basamaklarini elde etmek iiin 2 iilemi tekrar tekrar yapariz.
		// 1.iilem en sondaki basamaii elde etmek
		// 2.iilem en sondaki basamaii yok etmek
		
		Scanner scan=new Scanner(System.in);
		System.out.println("basamaklarini bulmak iiin 4 basamakli bir sayi girin");
		int sayi=scan.nextInt();
		
		// 4 basamakli sayinin basamaklarini bulmak iiin 3 defa ayni iilemi yapmaliyiz.
		int birlerBas=sayi%10;
		sayi/=10;
		
		int onlarBas=sayi%10;
		sayi/=10;
		
		int yuzlerBas=sayi%10;
		sayi/=10;
		
		int binlerBas=sayi;
		
		System.out.print(birlerBas);
		System.out.print(onlarBas);
		System.out.print(yuzlerBas);
		System.out.println(binlerBas);
		
		System.out.println("" +birlerBas+onlarBas+yuzlerBas+binlerBas);
		System.out.println(birlerBas+onlarBas+yuzlerBas+binlerBas);
		
		scan.close();

	}

}
