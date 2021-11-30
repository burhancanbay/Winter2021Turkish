package day08_ifelseifnestedif;

import java.util.Scanner;

public class C4_ArtikYilNestedIf {

	public static void main(String[] args) {
		
		// kullanicidan bir yil girmesini isteyin
				// kural 1: 4 ile boluneme

			Scanner scan=new Scanner(System.in);
			System.out.println("Lutfen bir yil giriniz");
			int yil=scan.nextInt();
			
			if (yil%100==0) {
				if (yil%400==0) {
					System.out.println("artik yil");
					
				} else {
					System.out.println("artik yil degil");

				} 
				
			} else {
				if (yil%4==0) {
					System.out.println("artik yil");
					
				} else {
					System.out.println("artik yil degil");

				}

			}
scan.close();
	}

}
