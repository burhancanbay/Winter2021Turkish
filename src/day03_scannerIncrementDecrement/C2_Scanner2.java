package day03_scannerIncrementDecrement;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		// kullanýcýdan ismini isteyip ilk harfini büyük yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("isminizi giriniz");
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		System.out.println("baþharfiniz :"+ilkHarf);
		
		scan.close();
		
		
		

	}

}
