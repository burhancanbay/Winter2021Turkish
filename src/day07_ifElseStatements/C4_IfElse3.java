package day07_ifElseStatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// kullan�c�dan ya��n� sorun 65 ve �zeriyse emekli olabilirsin yoksa emekli olamazs�n yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen ya��n�z� giriniz");
		int yas=scan.nextInt();
		
		if (yas>=65 ) {
			System.out.println("emekli olabilirsiniz");
			
		} else {

		}

		scan.close();
	}

}
