package day08_ifelseifnestedif;

import java.util.Scanner;

public class C3_ArtikYil {

	public static void main(String[] args) {
		// kullanicidan bir yil girmesini isteyin
		// kural 1: 4 ile boluneme

	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir yil giriniz");
	int yil=scan.nextInt();
	
	if (yil%4==0 && yil%100!=0) { 
		System.out.println("artik yil");
		
	} else if (yil%400==0) {
		System.out.println("artik yil");
		
	} else {
		System.out.println("artik yil degil");

	}
	scan.close();
	
	}
	
	

}
