package day09_ternary;

import java.util.Scanner;

public class C6_NestedTernary2 {

	public static void main(String[] args) {
		// kullanicidan bir harf istyin kucuk ise "kucuk harf" buyuk ise "buyuk harf" yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir harf giriniz");
		char harf=scan.next().charAt(0);
		
		System.out.println(harf>'a' && harf<'z' ? "kucuk harf" : (harf>'A' && harf<'Z' ? "buyuk harf" : "Lutfen gecerli bir harf giriniz"));

		scan.close();
	}

}
