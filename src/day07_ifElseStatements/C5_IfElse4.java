package day07_ifElseStatements;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// kullan�c�dan ��genin kenar uzunluklar�n� al�n �� kenar e�itse e�kenar yazd�r�n yoksa e�kenar de�il yaz�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("��genin kenar uzunluklar�n� girin");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar1==kenar3) {
			System.out.println("��gen e�kenard�r");
			
		} else {
			System.out.println("��gen e�kenar de�ildir");

		}

		scan.close();
	}

}
