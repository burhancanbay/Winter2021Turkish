package day06_ifstatements;

import java.util.Scanner;

public class C3_Ifstatement3 {

	public static void main(String[] args) {
		// kullan�c�dan g�n isminin ilk harfini isteyin ve harfe uygun g�nleri yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen g�n isminin ilk harfini girin");
		char ilkHarf=scan.next().charAt(0);
		
		if (ilkHarf=='p' || ilkHarf=='P') {
			System.out.println("pazar,pazartesi veya pe�embe");
		}
		if (ilkHarf=='s' || ilkHarf=='S') {
			System.out.println("sali");
		}
		
		if (ilkHarf=='c' || ilkHarf=='C') {
			System.out.println("carsamba,cuma veya cumartesi");
		}
		if (ilkHarf!='c' && ilkHarf!='C' && ilkHarf!='s' && ilkHarf!='S' && ilkHarf!='p' && ilkHarf!='P') {
			System.out.println("l�tfen ge�erli bir harf girin");
		}
		scan.close();
		
		

	}

}
