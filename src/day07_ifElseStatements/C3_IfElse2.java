package day07_ifElseStatements;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// kullan�c�dan bir karakter girmesini isteyin harf olup olmad���n� yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir karakter girin");
		char karakter=scan.next().charAt(0);
		
		if (karakter>='a' && karakter<='z'||karakter>='A' && karakter<='Z' ) {
			System.out.println("girdi�iniz karakter harf");
			
		} else {
			System.out.println("girdi�iniz harf de�il");

		}

		scan.close();
		
		

	}

}
