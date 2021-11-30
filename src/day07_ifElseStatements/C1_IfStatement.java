package day07_ifElseStatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		// kullanýcýdan bir tamsayý isteyin sayý pozitif ise 'satý pozitif' yazdýrýn
		// yazý 1000 den büyükse 'sayý büyük' yazý 100 den küçükse 'sayi küçük' yazdýrýn

	Scanner scan=new Scanner(System.in);
	System.out.println("bir tamsayý giriniz");
	int sayi=scan.nextInt();
	
	if (sayi>0) {
		System.out.println("sayi pozitif");
	}
	if (sayi>=1000) {
		System.out.println("sayi büyük");
	}
	if (sayi<100) {
		System.out.println("sayi küçük");
	}
	
	scan.close();
	}
	

}
