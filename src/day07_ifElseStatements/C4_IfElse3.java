package day07_ifElseStatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// kullanýcýdan yaþýný sorun 65 ve üzeriyse emekli olabilirsin yoksa emekli olamazsýn yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen yaþýnýzý giriniz");
		int yas=scan.nextInt();
		
		if (yas>=65 ) {
			System.out.println("emekli olabilirsiniz");
			
		} else {

		}

		scan.close();
	}

}
