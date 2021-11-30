package day07_ifElseStatements;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// kullanıcıdan bir karakter girmesini isteyin harf olup olmadığını yazdırın
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir karakter girin");
		char karakter=scan.next().charAt(0);
		
		if (karakter>='a' && karakter<='z'||karakter>='A' && karakter<='Z' ) {
			System.out.println("girdiğiniz karakter harf");
			
		} else {
			System.out.println("girdiğiniz harf değil");

		}

		scan.close();
		
		

	}

}
