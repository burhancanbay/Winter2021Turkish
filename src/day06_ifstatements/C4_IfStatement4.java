package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		// kullan�c�dan g�n ismini isteyin girilen g�n�n haftai�i veya haftasonu oldu�unu yazd�r�n

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir g�n ismi girin");
		String gunAdi=scan.next().toLowerCase();
		
		if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
		
			System.out.println("haftasonu");
		}
		
		if ( gunAdi.equals("pazartesi") || gunAdi.equals("sali") || gunAdi.equals("carsamba") || gunAdi.equals("per�embe") || gunAdi.equals("cuma")) {
			System.out.println("haftai�i");
		}
		scan.close();
		}
	
	
		
		
	}
	


