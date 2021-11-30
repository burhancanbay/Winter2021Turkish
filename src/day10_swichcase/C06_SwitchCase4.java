package day10_swichcase;

import java.util.Scanner;

public class C06_SwitchCase4 {

	public static void main(String[] args) {
		// kullanicidan VIP(Veri Important Person) kisaltmasinda hangi harfin anlamini istedigini soralim girilen harfin aciklamasini yazdiralim

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir harf giriniz");
		char harf=scan.next().charAt(0);
		
	switch (harf) {
	case 'v':
	case 'V':	
		System.out.println("Very");
		break;
	case 'i':
	case 'I':	
		System.out.println("Important");
		break;
	case 'p':
	case 'P':	
		System.out.println("Person");
		break;
	default:
		System.out.println("gecersiz harf");
	}
	
	// string ile yaparsak
	
	System.out.println("lutfen bir harf giriniz");
	String str=scan.next();
	
switch (str) {
case "v":
case "V":	
	System.out.println("Very");
	break;
case "i":
case "I":	
	System.out.println("Important");
	break;
case "p":
case "P":	
	System.out.println("Person");
	break;
default:
	System.out.println("gecersiz harf");
}

scan.close();
	
	
		
	}
	
}
