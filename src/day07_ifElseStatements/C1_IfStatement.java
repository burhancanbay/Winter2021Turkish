package day07_ifElseStatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		// kullan�c�dan bir tamsay� isteyin say� pozitif ise 'sat� pozitif' yazd�r�n
		// yaz� 1000 den b�y�kse 'say� b�y�k' yaz� 100 den k���kse 'sayi k���k' yazd�r�n

	Scanner scan=new Scanner(System.in);
	System.out.println("bir tamsay� giriniz");
	int sayi=scan.nextInt();
	
	if (sayi>0) {
		System.out.println("sayi pozitif");
	}
	if (sayi>=1000) {
		System.out.println("sayi b�y�k");
	}
	if (sayi<100) {
		System.out.println("sayi k���k");
	}
	
	scan.close();
	}
	

}
