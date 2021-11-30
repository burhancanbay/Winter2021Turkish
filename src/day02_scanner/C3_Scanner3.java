package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		// kullanýcýdan ismini ve soyismini alip aralarýnda bosluk býrakarak isim ve soyismini yazýn
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("isminizi girin");
		String name=scan.nextLine();
		
	    System.out.println("soyisminizi girin");
		String surname=scan.nextLine();
		
		System.out.println("name="+name+' '+"surname="+surname);
		
		scan.close();
		

	}

}
