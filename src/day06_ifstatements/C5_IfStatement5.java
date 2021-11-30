package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// kullanýcýdn bir dikdörtgenin iki kenar uzunluðunu alýn kenar uzunluklarý eþitse kare deðilse dikdörtgen yazdýrýn
	
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen dörtgenin iki kenarýný girin");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("dörtgen karedir");
		}
		if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("dörtgen dikdörgendir");
		}
	
		if (kenar1<=0 || kenar2<=0) {
			System.out.println("lütfen geçerli bir uzunluk girin");
		}
		scan.close();
	}
	

}
