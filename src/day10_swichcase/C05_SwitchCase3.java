package day10_swichcase;

import java.util.Scanner;

public class C05_SwitchCase3 {

	public static void main(String[] args) {
		// kullanicidan hangi gunde oldugunu isteyip girilem gunun hafta ici veya hafta sonu oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen icinde bulundugunuz gunu yaziniz");
		String gun=scan.next().toLowerCase();
		
		switch (gun) {
		case "pazartesi":
		case "sali":
		case "carsamba":
		case "persembe":
		case "cuma":
			System.out.println("hafta ici");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("hafta sonu");
			break;
			default:
				System.out.println("lutfen gecerli bir gun yaziniz");
				scan.close();
		}
		

	}

}
