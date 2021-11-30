package day10_swichcase;

import java.util.Scanner;

public class C04_SwitchCase2 {

	public static void main(String[] args) {
		// kullanicidan kacinci ayda oldugunu ali ve ay ismini yazdirin

	Scanner scan=new Scanner(System.in);
	System.out.println("lutfen yilin kacinci ayin oldugunuzu giriniz");
	int ay=scan.nextInt();
	
	switch (ay) {
	case 1:
		System.out.println("ocak");
	     break;
	case 2:
		System.out.println("subat");
	     break;
	case 3:
		System.out.println("mart");
	     break;
	case 4:
		System.out.println("nisan");
	     break;
	case 5:
		System.out.println("mayis");
	     break;
	case 6:
		System.out.println("haziran");
	     break;
	case 7:
		System.out.println("temmuz");
	     break;
	case 8:
		System.out.println("agustos");
	     break;
	case 9:
		System.out.println("eylul");
	     break;
	case 10:
		System.out.println("ekim");
	     break;
	case 11:
		System.out.println("kasim");
	     break;
	case 12:
		System.out.println("aralik");
	     break;
	
	default:
		System.out.println("bir ile on iki arasinda bir sayi giriniz");
		
		scan.close();
	}
	
	}

}
