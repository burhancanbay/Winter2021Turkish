package day06_ifstatements;

import java.util.Scanner;

public class C3_Ifstatement3 {

	public static void main(String[] args) {
		// kullanýcýdan gün isminin ilk harfini isteyin ve harfe uygun günleri yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen gün isminin ilk harfini girin");
		char ilkHarf=scan.next().charAt(0);
		
		if (ilkHarf=='p' || ilkHarf=='P') {
			System.out.println("pazar,pazartesi veya peþembe");
		}
		if (ilkHarf=='s' || ilkHarf=='S') {
			System.out.println("sali");
		}
		
		if (ilkHarf=='c' || ilkHarf=='C') {
			System.out.println("carsamba,cuma veya cumartesi");
		}
		if (ilkHarf!='c' && ilkHarf!='C' && ilkHarf!='s' && ilkHarf!='S' && ilkHarf!='p' && ilkHarf!='P') {
			System.out.println("lütfen geçerli bir harf girin");
		}
		scan.close();
		
		

	}

}
