package day07_ifElseStatements;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// kullanicidan 2 sayi isteyin,sayilarin ikiside pozitif ise sayilarin toplamini yazdirin
	    // sayilarin ikiside negatif ise sayilarin carpimini yazdirin
		// sayilar farkli isaretlere sahip ise "farkli isaretli sayilarla islem yapamazsin" yazdirin
		// sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 2 sayi giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
	    if (sayi1>0 && sayi2>0) {
	    	System.out.println("sayilarin toplami: " + (sayi1+sayi2));
			
		} else if (sayi1<0 && sayi2<0) {
			System.out.println("sayilarin carpimi: " + sayi1*sayi2);
			
		} else if (sayi1==0 || sayi2==0) {
			System.out.println("sifir carpmaya gore yutan elemandir");
			
		} else {
			System.out.println("farkli isaretlerde sayilarla islem yapamazsiniz");

		} {

		}{

		}
		scan.close();
		}

	}


