package day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		// kullanicidan gun isimlerini alalim
		// gun 

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen gun ismini giriniz");
		String gunIsmi=scan.next();
		
		if (gunIsmi.equalsIgnoreCase("pazar") || gunIsmi.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
			
		} else if (gunIsmi.equalsIgnoreCase("sali") ) {
			System.out.println("Sal");
			
		} else if (gunIsmi.equalsIgnoreCase("carsamba")) {
			System.out.println("Car");
			
		} else if (gunIsmi.equalsIgnoreCase("persembe")) {
			System.out.println("Per");
			
		} else if (gunIsmi.equalsIgnoreCase("cuma") || gunIsmi.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
			
		} else { System.out.println("Gecerli gun adi giriniz");

		}  // equalsIgnoreCase buyuk harf kucuk harf hassasiyeti olmadan esit olup olmadigini kontrol eder

		scan.close();
		}
		
		
	}


