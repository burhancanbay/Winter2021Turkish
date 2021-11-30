package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		// kullanýcýdan gün ismini isteyin girilen günün haftaiçi veya haftasonu olduðunu yazdýrýn

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir gün ismi girin");
		String gunAdi=scan.next().toLowerCase();
		
		if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
		
			System.out.println("haftasonu");
		}
		
		if ( gunAdi.equals("pazartesi") || gunAdi.equals("sali") || gunAdi.equals("carsamba") || gunAdi.equals("perþembe") || gunAdi.equals("cuma")) {
			System.out.println("haftaiçi");
		}
		scan.close();
		}
	
	
		
		
	}
	


