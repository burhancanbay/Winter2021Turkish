package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		// kullanýcýdan bir sayý isteyin ve sayýnýn tek veya çift sayý olduðunu yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir tamsayý giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("girdiðiniz sayý çift sayýdýr");
		}
		if (sayi%2==1 || sayi%2==-1) {
			System.out.println("girdiðiniz sayý tek sayýdýr");
		}
		System.out.println("katýldýðýnýz için teþekkür ederiz");
		
		scan.close();
		

	}

}
