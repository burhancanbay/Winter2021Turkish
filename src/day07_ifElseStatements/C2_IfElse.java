package day07_ifElseStatements;

import java.util.Scanner;

public class C2_IfElse {

	public static void main(String[] args) {
		//kullanýcýdan dörtgenin kenar uzunluklarýný alýn 
		//uzunluklar eþit ise kare deðil ise dikdörtgen yazdýralým
		
		Scanner scan=new Scanner(System.in);
		System.out.println("dörtgenin kenar uzunluklarýný girin");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		
		if (kenar1==kenar2) {
			System.out.println("dörtgen karedir");
			
		} else { System.out.println("dörtgen dikdörtgendir");

		}
scan.close();
	}

}
