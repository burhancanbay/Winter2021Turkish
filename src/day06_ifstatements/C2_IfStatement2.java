package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		// kullan�c�dan bir say� isteyin ve say�n�n tek veya �ift say� oldu�unu yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir tamsay� giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("girdi�iniz say� �ift say�d�r");
		}
		if (sayi%2==1 || sayi%2==-1) {
			System.out.println("girdi�iniz say� tek say�d�r");
		}
		System.out.println("kat�ld���n�z i�in te�ekk�r ederiz");
		
		scan.close();
		

	}

}
