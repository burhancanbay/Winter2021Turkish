package day07_ifElseStatements;

import java.util.Scanner;

public class C8_IfElseIf3 {

	public static void main(String[] args) {
		// kullanicidan maas teklifi isteyin ve asagidaki degerlere gore cevap yazdirin
        // teklif 80.000 den buyukse kabul ediyorum
		// teklif 60-80.000 arasindaysa konusabiliriz
		// teklif 60.000 in altinda ise maalesef kabul edemem yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen maas teklifinizi giriniz");
		int maas=scan.nextInt();
		
		if (maas<60000) {
			System.out.println("Maalesef kabul edemem");
			
		} else if (maas>=60000 && maas<80000) {
			System.out.println("Konusabiliriz");
			
			
		} else { 
			System.out.println("Kabul ediyorum");

		}{

		}
		scan.close();
	}

}
