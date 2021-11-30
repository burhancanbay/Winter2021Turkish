package day08_ifelseifnestedif;

import java.util.Scanner;

public class C2_NestedIf {

	public static void main(String[] args) {
		// Nested : icice
		// yas ve cinsiyete gore emekli olup olmayacagini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("cinsiyetinizi ve yasinizi giriniz");
		String cinsiyet=scan.next();
		int yas=scan.nextInt();
		
		if (yas<0) {
			System.out.println("yas negatif olamaz");
			
		} else if (cinsiyet.equalsIgnoreCase("erkek") && yas>=65) {
			System.out.println("emekli olabilirsin");
			
		} else if (cinsiyet.equalsIgnoreCase("erkek") && yas<65) {
			System.out.println("emekli olamazsin");
			
		} else if (cinsiyet.equalsIgnoreCase("kadin") && yas>=60) {
			System.out.println("emekli olabilirsin");
			
		} else if (cinsiyet.equalsIgnoreCase("kadin") && yas<60) {
			System.out.println("emekli olamazsin");
		} else {
			System.out.println("cinsiyet yada yas tanimsiz");
		}
		
	System.out.println("Nested if ile sonuc");
	
	if (cinsiyet.equalsIgnoreCase("erkek")) {
		
		if (yas<0) {
			System.out.println("Yas negatif olamaz");
			
		} else if (yas<65) {
			System.out.println("Bu yastaki erkek emekli olamaz");
			
		} else {
			System.out.println("Emekli olabilirsin");

		}

  } else if (cinsiyet.equalsIgnoreCase("kadin")) {
			
		if (yas<0) {
			System.out.println("Yas negatif olamaz");
				
		} else if (yas<60) {
			System.out.println("Bu yastaki kadin emekli olamaz");
				
		} else { 
			System.out.println("emekli olabilirsin");
				
			}
				
 } else {
		System.out.println("tanimli cinsiyet adi giriniz");

	}
	scan.close();	
	}
	
}


	


