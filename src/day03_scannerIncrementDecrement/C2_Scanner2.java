package day03_scannerIncrementDecrement;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		// kullan�c�dan ismini isteyip ilk harfini b�y�k yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("isminizi giriniz");
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		System.out.println("ba�harfiniz :"+ilkHarf);
		
		scan.close();
		
		
		

	}

}
