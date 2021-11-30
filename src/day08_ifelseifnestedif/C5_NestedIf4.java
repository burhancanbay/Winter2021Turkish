package day08_ifelseifnestedif;

import java.util.Scanner;

public class C5_NestedIf4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sifrenizi girin");
		char ilkHarf=scan.next().charAt(0);
		
		
		
		if (ilkHarf>='A' && ilkHarf<='Z') {
			if (ilkHarf=='A') {
				System.out.println("sifre gecerli");
				
			} else {
				System.out.println("sifre gecersiz buyuk harf");

			}
		
		} else if (ilkHarf>='a' && ilkHarf<='z') {
			
			      if (ilkHarf=='z') {
				  System.out.println("sifre gecerli");
				
		        	} else {
		        	System.out.println("sifre gecersiz kucuk harf");

		      	}
		     } else {
		    	System.out.println("sifre gecersiz,lutfen ilk karakteri harf yapiniz");
            }
		scan.close();

	}

}
