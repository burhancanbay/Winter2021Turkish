package day10_swichcase;

import java.util.Scanner;

public class C01_TernaryTekrar {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tamsayi girin");
		int sayi=scan.nextInt();
		
		String sonuc=(sayi>99 && sayi<1000 || sayi<-99 && sayi>-1000) ? "uc basamakli" : "uc basamakli degil";
		System.out.println(sonuc);

		scan.close();
	}

}
