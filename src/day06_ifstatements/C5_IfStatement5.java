package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// kullan�c�dn bir dikd�rtgenin iki kenar uzunlu�unu al�n kenar uzunluklar� e�itse kare de�ilse dikd�rtgen yazd�r�n
	
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen d�rtgenin iki kenar�n� girin");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("d�rtgen karedir");
		}
		if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("d�rtgen dikd�rgendir");
		}
	
		if (kenar1<=0 || kenar2<=0) {
			System.out.println("l�tfen ge�erli bir uzunluk girin");
		}
		scan.close();
	}
	

}
