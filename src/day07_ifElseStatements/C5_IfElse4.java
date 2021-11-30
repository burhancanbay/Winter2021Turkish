package day07_ifElseStatements;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// kullanýcýdan üçgenin kenar uzunluklarýný alýn üç kenar eþitse eþkenar yazdýrýn yoksa eþkenar deðil yazýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("üçgenin kenar uzunluklarýný girin");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar1==kenar3) {
			System.out.println("üçgen eþkenardýr");
			
		} else {
			System.out.println("üçgen eþkenar deðildir");

		}

		scan.close();
	}

}
