package day07_ifElseStatements;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		// kullanýcýdan 100 üzerinden aldýðý notu isteyin.notu harf sistemine çevirin
		// 50 den kucukse "D",50-60 arasi "C",60-80 arasi "B",80'in uzeride ise "A"
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 100 uzerinden notunuzu giriniz");
		double not=scan.nextDouble();
		if (not<0 || not>100 ) {
			System.out.println("Lutfen gecerli bir not giriniz");
			
		} else if (not<=50) {
			System.out.println("Notunuz: D");
			
		} else if (not<60) {
			System.out.println("Notunuz: C");
			
		} else if (not<80) {
			System.out.println("Notunuz: B");
			
		} else {
			System.out.println("Notunuz: A");

		}{

		}{

		}{

		}
	scan.close();	
	}

}
